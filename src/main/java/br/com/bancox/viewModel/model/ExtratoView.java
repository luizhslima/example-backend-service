package br.com.bancox.viewModel.model;

import br.com.bancox.viewModel.ViewEntidade;

import java.util.List;

public class ExtratoView implements ViewEntidade {

    private List<ExtratoDadosView> dadosExtrato;

    public List<ExtratoDadosView> getDadosExtrato() {
        return dadosExtrato;
    }

    public void setDadosExtrato(List<ExtratoDadosView> dadosExtrato) {
        this.dadosExtrato = dadosExtrato;
    }
}
