package br.com.bancox.viewModel.model;

import br.com.bancox.viewModel.ViewEntidade;

import java.time.LocalDate;
import java.util.Date;

public class ExtratoDadosView implements ViewEntidade {

    private String dataLancamento;
    private String lancamento;
    private String valor;
    private String detalhes;
    private StatusLancamento statusLancamento;

    public StatusLancamento getStatusLancamento() {
        return statusLancamento;
    }

    public void setStatusLancamento(StatusLancamento statusLancamento) {
        this.statusLancamento = statusLancamento;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
