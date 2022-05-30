package br.com.bancox.viewModel.mappers;

import br.com.bancox.api.model.ApiDTO;
import br.com.bancox.api.model.conta.SaldoDTO;
import br.com.bancox.viewModel.ViewEntidade;
import br.com.bancox.viewModel.model.SaldoView;
import org.springframework.cglib.core.Local;

import java.text.NumberFormat;
import java.util.Locale;

public class SaldoModelMapper {

    private  SaldoModelMapper(){}

    public static ViewEntidade fromDto(ApiDTO dto){
        Locale locale = new Locale("pt", "BR");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        SaldoDTO saldoDTO = (SaldoDTO) dto;
        SaldoView saldoView = new SaldoView();
        saldoView.setSaldoTotal(currencyFormatter.format(saldoDTO.getSaldo() + saldoDTO.getLis()));
        return saldoView;
    }
}
