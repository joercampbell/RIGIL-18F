package com.rigil.fda.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * Authentication Request Details
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataCode",
    "dataName",
    "dataDesc"
})
public class FDADataRequest {

    @JsonProperty("dataCode")
    private String dataCode;
    @JsonProperty("dataName")
    private String dataName;
    @JsonProperty("dataDesc")
    private String dataDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The dataCode
     */
    @JsonProperty("dataCode")
    public String getdataCode() {
        return dataCode;
    }

    /**
     *
     * @param dataCode
     *     The dataCode
     */
    @JsonProperty("dataCode")
    public void setdataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    /**
     *
     * @return
     *     The dataName
     */
    @JsonProperty("dataName")
    public String getdataName() {
        return dataName;
    }

    /**
     *
     * @param dataName
     *     The dataName
     */
    @JsonProperty("dataName")
    public void setdataName(String dataName) {
        this.dataName = dataName;
    }

    /**
     *
     * @return
     *     The dataDesc
     */
    @JsonProperty("dataDesc")
    public String getDataDesc() {
        return dataDesc;
    }

    /**
     *
     * @param dataDesc
     *     The dataDesc
     */
    @JsonProperty("dataDesc")
    public void setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataCode).append(dataName).append(dataDesc).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        FDADataRequest rhs = ((FDADataRequest) other);
        return new EqualsBuilder().append(dataCode, rhs.dataCode).append(dataName, rhs.dataName).append(dataDesc, rhs.dataDesc).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
