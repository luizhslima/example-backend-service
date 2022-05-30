package br.com.bancox.viewModel.mappers;

import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.model.conta.ExtratoDTO;
import br.com.bancox.viewModel.ViewEntidade;
import br.com.bancox.viewModel.model.ExtratoDadosView;
import br.com.bancox.viewModel.model.ExtratoView;
import br.com.bancox.viewModel.model.StatusLancamento;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ExtratoModelMapper {

    private ExtratoModelMapper(){

    }

    public static ViewEntidade fromDto(ApiDTO dto){
        ExtratoDTO extratoDTO = (ExtratoDTO) dto;
        ExtratoView extratoView = new ExtratoView();
        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        List<ExtratoDadosView> extradoDados =  extratoDTO.getDados().stream().map((data) -> {
            ExtratoDadosView dadosView = new ExtratoDadosView();
            dadosView.setDataLancamento(data.getDataLancamento().format(formatter));
            dadosView.setDetalhes(data.getDetalhes());
            dadosView.setLancamento(data.getLancamento());
            dadosView.setValor(currencyFormatter.format(data.getValor()));
            if(data.getDataLancamento().isAfter(now)){
                if(data.getValor() < 0){
                    dadosView.setStatusLancamento(StatusLancamento.SAIDAFUTURA);
                }else{
                    dadosView.setStatusLancamento(StatusLancamento.ENTRADAFUTURA);
                }
            }
            return dadosView;
        }).collect(Collectors.toList());
        extratoView.setDadosExtrato(extradoDados);
        return extratoView;
    }
}
