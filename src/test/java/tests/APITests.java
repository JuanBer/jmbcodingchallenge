package tests;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataentities.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import support.UsConstants;

public class APITests {

    private static RequestSpecification requestSpec;
    private static Response response;
    private final List<String> listOfUSStatesNames = UsConstants.listOfUSStatesName;

    @BeforeTest
    public void createRequestSpecification() {
        requestSpec = new RequestSpecBuilder().setBaseUri("https://credapi.credify.tech/").build();
    }

    @BeforeTest
    public void getEndpointResponse() {
        response = given().spec(requestSpec).when().get("api/loanapp/v1/states");
    }

    @Test
    public void verifyStatusCodeOK() {
        assertEquals(200, response.statusCode());
    }

    @Test(dependsOnMethods = { "verifyStatusCodeOK" })
    public void verifyValidityAndNumberOfStates() {
        States states =

                response.as(States.class);

        assertEquals(states.getStates().size(), 48);
        assertTrue(listOfUSStatesNames.containsAll(states.getStatesLabel()));

    }

    @Test(dependsOnMethods = { "verifyStatusCodeOK" })
    public void verifyOnlyOneStateWithMinAgeOf19() {
        States states =

                response.as(States.class);

        List<State> aux = states.getStatesByMinAge(19);

        assertEquals(aux.size(), 1);
        System.out.println("The US State with Min Age equals to 19 is ".concat(aux.get(0).getLabel()));
    }

    @Test(dependsOnMethods = { "verifyStatusCodeOK" })
    public void verifyGeorgiaOnlyStateWithMinLoanAmountOf3005() {
        States states =

                response.as(States.class);

        List<State> aux = states.getStatesByMinLoanAmount(3005.00);

        assertEquals(aux.size(), 1);
        assertEquals(aux.get(0).getLabel(), "Georgia");
    }
}