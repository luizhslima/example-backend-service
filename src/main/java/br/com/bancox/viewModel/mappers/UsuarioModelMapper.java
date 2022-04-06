package br.com.bancox.viewModel.mappers;

import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.model.UsuarioExampleDTO;
import br.com.bancox.viewModel.model.UsuarioExampleView;

public class UsuarioModelMapper {

    private  UsuarioModelMapper(){}

    public static UsuarioExampleView fromDto(ApiDTO dto){
       if(dto != null){
           UsuarioExampleDTO usuarioExampleDTO = (UsuarioExampleDTO) dto;
           UsuarioExampleView viewModel = new UsuarioExampleView();
           viewModel.setNome(usuarioExampleDTO.getNome());
           viewModel.setSobrenome(usuarioExampleDTO.getSobrenome());
           viewModel.setIdade(usuarioExampleDTO.getIdade().toString());
           viewModel.setSalario(usuarioExampleDTO.getSalario().toString());
           return viewModel;
       }
       return null;
    }
}
