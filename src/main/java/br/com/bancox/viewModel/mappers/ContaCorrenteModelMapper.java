package br.com.bancox.viewModel.mappers;

import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.model.conta.ContaCorrenteDTO;
import br.com.bancox.viewModel.ViewEntidade;
import br.com.bancox.viewModel.model.ContaCorrenteViewModel;

public class ContaCorrenteModelMapper {

    private ContaCorrenteModelMapper(){}

    public static ViewEntidade fromDto(ApiDTO dto){
        ContaCorrenteDTO contaCorrenteDTO = (ContaCorrenteDTO) dto;
        ContaCorrenteViewModel viewModel = new ContaCorrenteViewModel();
        viewModel.setAgencia(contaCorrenteDTO.getAgencia());
        viewModel.setConta(contaCorrenteDTO.getConta());
        viewModel.setDac(contaCorrenteDTO.getDac());
        viewModel.setNome(contaCorrenteDTO.getNome());
        viewModel.setSobrenome(contaCorrenteDTO.getSobrenome());
        return viewModel;
    }
}
