package br.com.bancox.api.params;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExampleParams {

    @JsonProperty("name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
