package br.com.bancox.viewModel.model;

import br.com.bancox.viewModel.ViewEntidade;

public class SaldoView implements ViewEntidade {

    private String saldoTotal;

    public String getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(String saldoTotal) {
        this.saldoTotal = saldoTotal;
    }
}
