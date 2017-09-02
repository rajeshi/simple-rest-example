package com.fiverr.simple_rest_project.response.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ese_document_texttag_extract_needed"
})
public class Data {

    @JsonProperty("ese_document_texttag_extract_needed")
    private String eseDocumentTexttagExtractNeeded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ese_document_texttag_extract_needed")
    public String getEseDocumentTexttagExtractNeeded() {
        return eseDocumentTexttagExtractNeeded;
    }

    @JsonProperty("ese_document_texttag_extract_needed")
    public void setEseDocumentTexttagExtractNeeded(String eseDocumentTexttagExtractNeeded) {
        this.eseDocumentTexttagExtractNeeded = eseDocumentTexttagExtractNeeded;
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
