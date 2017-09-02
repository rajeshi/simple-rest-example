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
    "top",
    "left",
    "height",
    "page",
    "type",
    "validation",
    "binding",
    "width",
    "subtype",
    "extract",
    "extractAnchor",
    "id",
    "data",
    "value",
    "name"
})
public class FieldResponse {

    @JsonProperty("top")
    private Integer top;
    @JsonProperty("left")
    private Integer left;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("type")
    private String type;
    @JsonProperty("validation")
    private Object validation;
    @JsonProperty("binding")
    private Object binding;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("subtype")
    private String subtype;
    @JsonProperty("extract")
    private Boolean extract;
    @JsonProperty("extractAnchor")
    private Object extractAnchor;
    @JsonProperty("id")
    private String id;
    @JsonProperty("data")
    private Object data;
    @JsonProperty("value")
    private String value;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("top")
    public Integer getTop() {
        return top;
    }

    @JsonProperty("top")
    public void setTop(Integer top) {
        this.top = top;
    }

    @JsonProperty("left")
    public Integer getLeft() {
        return left;
    }

    @JsonProperty("left")
    public void setLeft(Integer left) {
        this.left = left;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("validation")
    public Object getValidation() {
        return validation;
    }

    @JsonProperty("validation")
    public void setValidation(Object validation) {
        this.validation = validation;
    }

    @JsonProperty("binding")
    public Object getBinding() {
        return binding;
    }

    @JsonProperty("binding")
    public void setBinding(Object binding) {
        this.binding = binding;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("subtype")
    public String getSubtype() {
        return subtype;
    }

    @JsonProperty("subtype")
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    @JsonProperty("extract")
    public Boolean getExtract() {
        return extract;
    }

    @JsonProperty("extract")
    public void setExtract(Boolean extract) {
        this.extract = extract;
    }

    @JsonProperty("extractAnchor")
    public Object getExtractAnchor() {
        return extractAnchor;
    }

    @JsonProperty("extractAnchor")
    public void setExtractAnchor(Object extractAnchor) {
        this.extractAnchor = extractAnchor;
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

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
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
