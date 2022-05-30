package br.com.bancox.api.service.conta;

import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.model.conta.ContaCorrenteDTO;

public interface ContaCorrenteService {

    public ApiDTO getContaCorrente(ContaCorrenteDTO dto) throws Exception;
    public ApiDTO getSaldo(ContaCorrenteDTO dto) throws Exception;
    public ApiDTO getExtrato(ContaCorrenteDTO dto) throws Exception;
}
