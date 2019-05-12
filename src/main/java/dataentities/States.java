package dataentities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "states" })
public class States {

    @JsonProperty("states")
    private List<State> states = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("states")
    public List<State> getStates() {
        return states;
    }

    @JsonProperty("states")
    public void setStates(List<State> states) {
        this.states = states;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public List<State> getStatesByMinAge(int minAge) {
        List<State> aux = new ArrayList<State>();
        Iterator<State> iterator = this.getStates().iterator();
        while (iterator.hasNext()) {
            State state = iterator.next();
            if (state.getMinAge().equals(minAge)) {
                aux.add(state);
            }
        }
        return aux;
    }

    public List<State> getStatesByMinLoanAmount(Double minLoanAmount) {
        List<State> aux = new ArrayList<State>();
        Iterator<State> iterator = this.getStates().iterator();
        while (iterator.hasNext()) {
            State state = iterator.next();
            if (state.getMinLoanAmount().equals(minLoanAmount)) {
                aux.add(state);
            }
        }
        return aux;
    }

    public List<String> getStatesLabel() {
        List<String> aux = new ArrayList<String>();
        Iterator<State> iterator = this.getStates().iterator();
        while (iterator.hasNext()) {
            aux.add(iterator.next().getLabel());
        }
        return aux;
    }
}