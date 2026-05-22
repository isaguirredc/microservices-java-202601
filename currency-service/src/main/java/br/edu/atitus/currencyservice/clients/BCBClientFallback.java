package br.edu.atitus.currencyservice.clients;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BCBClientFallback implements BCBClient {

    @Override
    public BCBResponse getCurrency(String moeda, String dataCotacao) {

        BCBValue value = new BCBValue();

        value.setCotacaoCompra(0.0);

        BCBResponse response = new BCBResponse();

        response.setValue(List.of(value));

        return response;
    }
}