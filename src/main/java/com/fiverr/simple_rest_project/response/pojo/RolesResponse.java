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
import com.fiverr.simple_rest_project.request.pojo.Signer;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locked",
    "emailMessage",
    "attachmentRequirements",
    "reassign",
    "type",
    "index",
    "data",
    "id",
    "signers",
    "name"
})
public class RolesResponse {

    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("emailMessage")
    private Object emailMessage;
    @JsonProperty("attachmentRequirements")
    private List<Object> attachmentRequirements = null;
    @JsonProperty("reassign")
    private Boolean reassign;
    @JsonProperty("type")
    private String type;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("data")
    private Object data;
    @JsonProperty("id")
    private String id;
    @JsonProperty("signers")
    private List<Signer> signers = null;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonProperty("emailMessage")
    public Object getEmailMessage() {
        return emailMessage;
    }

    @JsonProperty("emailMessage")
    public void setEmailMessage(Object emailMessage) {
        this.emailMessage = emailMessage;
    }

    @JsonProperty("attachmentRequirements")
    public List<Object> getAttachmentRequirements() {
        return attachmentRequirements;
    }

    @JsonProperty("attachmentRequirements")
    public void setAttachmentRequirements(List<Object> attachmentRequirements) {
        this.attachmentRequirements = attachmentRequirements;
    }

    @JsonProperty("reassign")
    public Boolean getReassign() {
        return reassign;
    }

    @JsonProperty("reassign")
    public void setReassign(Boolean reassign) {
        this.reassign = reassign;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("data")
    public Object getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Object data) {
        this.data = data;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("signers")
    public List<Signer> getSigners() {
        return signers;
    }

    @JsonProperty("signers")
    public void setSigners(List<Signer> signers) {
        this.signers = signers;
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
