package br.com.bancox.api.model.conta;

import br.com.bancox.api.model.ApiDTO;

import java.time.LocalDate;
import java.util.Date;

public class ExtratoDadosDTO implements ApiDTO {
    private LocalDate dataLancamento;
    private Double valor;
    private String lancamento;
    private String detalhes;

    public Double getValor() {
        return valor;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getLancamento() {
        return lancamento;
    }

    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
