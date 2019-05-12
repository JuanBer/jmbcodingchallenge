package dataentities;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "label", "abbreviation", "minLoanAmount", "minAge" })
public class State {

    @JsonProperty("label")
    private String label;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("minLoanAmount")
    private Double minLoanAmount;
    @JsonProperty("minAge")
    private Integer minAge;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @JsonProperty("minLoanAmount")
    public Double getMinLoanAmount() {
        return minLoanAmount;
    }

    @JsonProperty("minLoanAmount")
    public void setMinLoanAmount(Double minLoanAmount) {
        this.minLoanAmount = minLoanAmount;
    }

    @JsonProperty("minAge")
    public Integer getMinAge() {
        return minAge;
    }

    @JsonProperty("minAge")
    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}