package br.com.bancox.api.service.conta;

import br.com.bancox.api.helper.HttpClientHelper;
import br.com.bancox.api.helper.RegraContaHelper;
import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.model.conta.ContaCorrenteDTO;
import br.com.bancox.api.model.conta.ExtratoDTO;
import br.com.bancox.api.model.conta.SaldoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaCorrenteServiceImpl implements  ContaCorrenteService{

    HttpClientHelper helper;
    RegraContaHelper regraContaHelper;

    private static  final String PATH_CONTA_CORRENTE = "/conta/conta-corrente";
    private static final String PATH_CONTA_SALDO = "/conta/saldo";
    private static final String PATH_EXTRATO = "/transferencias/extrato";
    @Autowired
    ContaCorrenteServiceImpl(HttpClientHelper helper, RegraContaHelper regraContaHelper){
        this.helper = helper;
        this.regraContaHelper = regraContaHelper;
    }

    @Override
    public ApiDTO getContaCorrente(ContaCorrenteDTO contaCorrenteDTO) throws Exception {
        regraContaHelper.validarConta(contaCorrenteDTO);
        if(contaCorrenteDTO.getSenha() == null || !contaCorrenteDTO.getSenha().equals("123456")){
            throw new Exception("senha inalida");
        }
        return helper.post(PATH_CONTA_CORRENTE,contaCorrenteDTO).readEntity(ContaCorrenteDTO.class);
    }

    @Override
    public ApiDTO getSaldo(ContaCorrenteDTO dto) throws Exception {
        regraContaHelper.validarConta(dto);
        return helper.post(PATH_CONTA_SALDO, dto).readEntity(SaldoDTO.class);
    }

    @Override
    public ApiDTO getExtrato(ContaCorrenteDTO dto) throws Exception {
        regraContaHelper.validarConta(dto);
        return helper.post(PATH_EXTRATO, dto).readEntity(ExtratoDTO.class);
    }
}
