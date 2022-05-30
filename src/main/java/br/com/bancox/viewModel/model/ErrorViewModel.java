package br.com.bancox.viewModel.model;

import br.com.bancox.viewModel.ViewEntidade;

public class ErrorViewModel implements ViewEntidade {

    private String msg;

    public ErrorViewModel(){
    }

    public ErrorViewModel(String msg){
        this.msg = msg;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
