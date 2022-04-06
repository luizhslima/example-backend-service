package br.com.bancox.api.service;


import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.model.UsuarioExampleDTO;
import br.com.bancox.api.params.ExampleParams;
import br.com.bancox.utils.ClientWebTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Service
public class ExampleServiceImpl implements ExampleService{

    private final static String PATH_EXAMPLE_API = "/example/feature";

    private ClientWebTarget webTarget;

    @Autowired
    ExampleServiceImpl(ClientWebTarget webTarget){
        this.webTarget = webTarget;
    }

    @Override
    public ApiDTO getExample(ExampleParams params) throws Exception{
        Response response = this.webTarget
                .client()
                .path(PATH_EXAMPLE_API)
                .request()
                .post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
        if(response.getStatus() != HttpStatus.OK.value()) {
            throw new Exception("erro de api");
        }

        return response.readEntity(UsuarioExampleDTO.class);
    }
}
