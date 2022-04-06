package br.com.bancox.api.service;

import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.params.ExampleParams;

public interface ExampleService {

    public ApiDTO getExample(ExampleParams params) throws Exception;
}
