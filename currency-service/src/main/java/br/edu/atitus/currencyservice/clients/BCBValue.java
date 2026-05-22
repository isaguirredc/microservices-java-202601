package br.edu.atitus.currencyservice.clients;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BCBValue {

    @JsonProperty("cotacaoCompra")
    private Double cotacaoCompra;

    public Double getCotacaoCompra() {
        return cotacaoCompra;
    }

    public void setCotacaoCompra(Double cotacaoCompra) {
        this.cotacaoCompra = cotacaoCompra;
    }
}