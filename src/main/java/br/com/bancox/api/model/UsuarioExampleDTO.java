package br.com.bancox.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioExampleDTO implements ApiDTO{

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("sobrenome")
    private  String sobrenome;

    @JsonProperty("idade")
    private Integer idade;

    @JsonProperty("salario")
    private Double salario;

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
