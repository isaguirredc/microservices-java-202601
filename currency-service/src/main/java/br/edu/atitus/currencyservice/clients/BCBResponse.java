package br.edu.atitus.currencyservice.clients;

import java.util.List;

public class BCBResponse {

    private List<BCBValue> value;

    public List<BCBValue> getValue() {
        return value;
    }

    public void setValue(List<BCBValue> value) {
        this.value = value;
    }
}