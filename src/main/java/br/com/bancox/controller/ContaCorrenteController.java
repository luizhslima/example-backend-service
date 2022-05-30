package br.com.bancox.controller;

import br.com.bancox.api.model.conta.ContaCorrenteDTO;
import br.com.bancox.api.service.conta.ContaCorrenteService;
import br.com.bancox.viewModel.ViewEntidade;
import br.com.bancox.viewModel.mappers.ContaCorrenteModelMapper;
import br.com.bancox.viewModel.mappers.ExtratoModelMapper;
import br.com.bancox.viewModel.mappers.SaldoModelMapper;
import br.com.bancox.viewModel.model.ErrorViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ContaCorrenteController{

    private ContaCorrenteService service;

    @Autowired
    ContaCorrenteController(ContaCorrenteService service){
        this.service = service;
    }

    @RequestMapping("/consultar/conta")
    @ResponseBody
    public ResponseEntity<ViewEntidade> contaCorrente(@RequestBody ContaCorrenteDTO conta){
        try{
            return ResponseEntity.ok().body(ContaCorrenteModelMapper.fromDto(service.getContaCorrente(conta)));
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ErrorViewModel(ex.getMessage())
            );
        }
    }

    @RequestMapping("/consultar/saldo")
    @ResponseBody
    public ResponseEntity<ViewEntidade> saldoContacorrente(@RequestBody ContaCorrenteDTO conta){
       try{
           return ResponseEntity.ok().body(SaldoModelMapper.fromDto(service.getSaldo(conta)));
       }catch (Exception ex){
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                   new ErrorViewModel(ex.getMessage())
           );
       }
    }

    @RequestMapping("/consulta/extrato")
    @ResponseBody
    public ResponseEntity<ViewEntidade> saldo(@RequestBody ContaCorrenteDTO conta){
        try{
            return ResponseEntity.ok().body(ExtratoModelMapper.fromDto(service.getExtrato(conta)));
        }catch(Exception ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    new ErrorViewModel(ex.getMessage())
            );
        }
    }
}
