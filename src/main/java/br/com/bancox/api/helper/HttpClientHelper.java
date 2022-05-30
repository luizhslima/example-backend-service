package br.com.bancox.api.helper;

import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.utils.ClientWebTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
public class HttpClientHelper {

    private ClientWebTarget webTarget;


    @Autowired
    HttpClientHelper(ClientWebTarget webTarget){
        this.webTarget = webTarget;
    }

    public Response post(String path, ApiDTO params) throws Exception{
        Response response = this.webTarget.client()
                .path(path)
                .request()
                .post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
        if(response.getStatus() != HttpStatus.OK.value()){
            throw new Exception(String.format("erro ao consultar api: %s status: %s", path, response.getStatus()));
        }
        return response;
    }
}
