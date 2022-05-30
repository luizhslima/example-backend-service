package br.com.bancox.api.model.conta;

import br.com.bancox.api.model.ApiDTO;

public class SaldoDTO implements ApiDTO {
    private Double saldo;
    private Double lis;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLis() {
        return lis;
    }

    public void setLis(Double lis) {
        this.lis = lis;
    }
}
