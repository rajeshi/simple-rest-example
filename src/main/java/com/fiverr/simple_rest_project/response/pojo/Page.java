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
    "id",
    "height",
    "left",
    "top",
    "width",
    "index",
    "version"
})
public class Page {

    @JsonProperty("id")
    private String id;
    @JsonProperty("height")
    private Double height;
    @JsonProperty("left")
    private Double left;
    @JsonProperty("top")
    private Double top;
    @JsonProperty("width")
    private Double width;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("version")
    private Integer version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    @JsonProperty("left")
    public Double getLeft() {
        return left;
    }

    @JsonProperty("left")
    public void setLeft(Double left) {
        this.left = left;
    }

    @JsonProperty("top")
    public Double getTop() {
        return top;
    }

    @JsonProperty("top")
    public void setTop(Double top) {
        this.top = top;
    }

    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
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
