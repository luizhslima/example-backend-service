package br.com.bancox.api.helper;

import br.com.bancox.api.model.conta.ContaCorrenteDTO;
import org.springframework.stereotype.Component;

@Component
public class RegraContaHelper {

    public void validarConta(ContaCorrenteDTO dto) throws  Exception{
        if(dto.getAgencia() == null || dto.getAgencia().length() < 4){
            throw new Exception("agencia invalida");
        }

        if(dto.getConta() == null || dto.getConta().length() < 5){
            throw  new Exception("conta invalida");
        }

        if(dto.getDac() == null || dto.getDac().length() < 1){
            throw  new Exception("dac invalida");
        }
    }
}
