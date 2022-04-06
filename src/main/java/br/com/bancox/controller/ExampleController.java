package br.com.bancox.controller;


import br.com.bancox.api.params.ExampleParams;
import br.com.bancox.api.service.ExampleService;
import br.com.bancox.viewModel.ViewEntidade;
import br.com.bancox.viewModel.mappers.UsuarioModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    final ExampleService service;

    public ExampleController(ExampleService service) {
        this.service = service;
    }

    @ResponseBody
    @PostMapping("/exemplo")
    public ResponseEntity<ViewEntidade> exemplo(@RequestBody ExampleParams params) throws Exception{
        return ResponseEntity.ok().body(UsuarioModelMapper.fromDto(service.getExample(params)));
    }
}
