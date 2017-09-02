package com.fiverr.simple_rest_project.response.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "signed",
    "role",
    "accepted",
    "id",
    "data",
    "fields",
    "name"
})
public class ApprovalResponse {

    @JsonProperty("signed")
    private Object signed;
    @JsonProperty("role")
    private String role;
    @JsonProperty("accepted")
    private Object accepted;
    @JsonProperty("id")
    private String id;
    @JsonProperty("data")
    private Object data;
    @JsonProperty("fields")
    private List<FieldResponse> fields = null;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("signed")
    public Object getSigned() {
        return signed;
    }

    @JsonProperty("signed")
    public void setSigned(Object signed) {
        this.signed = signed;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("accepted")
    public Object getAccepted() {
        return accepted;
    }

    @JsonProperty("accepted")
    public void setAccepted(Object accepted) {
        this.accepted = accepted;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("data")
    public Object getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    @JsonProperty("fields")
    public List<FieldResponse> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<FieldResponse> fields) {
        this.fields = fields;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
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
