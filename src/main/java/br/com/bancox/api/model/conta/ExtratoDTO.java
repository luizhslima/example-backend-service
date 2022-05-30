package br.com.bancox.api.model.conta;

import br.com.bancox.api.model.ApiDTO;

import java.util.List;

public class ExtratoDTO implements ApiDTO {

    private List<ExtratoDadosDTO> dados;

    public List<ExtratoDadosDTO> getDados() {
        return dados;
    }

    public void setDados(List<ExtratoDadosDTO> dados) {
        this.dados = dados;
    }
}
