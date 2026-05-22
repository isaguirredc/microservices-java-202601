package br.edu.atitus.currencyservice.controllers;

<<<<<<< HEAD
import br.edu.atitus.currencyservice.dtos.CurrencyDTO;
import br.edu.atitus.currencyservice.entities.CurrencyEntity;
import br.edu.atitus.currencyservice.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
=======
import br.edu.atitus.currencyservice.clients.BCBClient;
import br.edu.atitus.currencyservice.clients.BCBResponse;
import br.edu.atitus.currencyservice.dtos.CurrencyDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
>>>>>>> 63fd536 (última atualização)

@RestController
@RequestMapping("currency")
public class CurrencyController {

    @Value("${server.port}")
    private String port;

<<<<<<< HEAD
    private final CurrencyRepository repository;

    public CurrencyController(CurrencyRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/convert")
    public ResponseEntity<CurrencyDTO> getConvert(
            @RequestParam String source,
            @RequestParam String target) throws Exception {
=======
    private final BCBClient bcbClient;

    public CurrencyController(BCBClient bcbClient) {
        this.bcbClient = bcbClient;
    }

    @GetMapping("/convert")
    @Cacheable("currencyCache")
    public ResponseEntity<CurrencyDTO> getConvert(
            @RequestParam String source,
            @RequestParam String target) {
>>>>>>> 63fd536 (última atualização)

        source = source.toUpperCase();
        target = target.toUpperCase();

<<<<<<< HEAD
        CurrencyEntity currency = repository.findBySourceCurrencyAndTargetCurrency(source, target)
                .orElseThrow(() -> new Exception("Currency not found"));

        String environment = "Currency-service running on port: " + port;

        CurrencyDTO dto = new CurrencyDTO(currency.getSourceCurrency(),
                currency.getTargetCurrency(),
                currency.getConversionRate(),
                environment);

        return ResponseEntity.ok(dto);

=======
        Double rate = 1.0;

        if (!source.equals(target)) {

            BCBResponse response = bcbClient.getCurrency(
                    "'" + target + "'",
                    "'05-20-2026'"
            );

            if (response != null &&
                    response.getValue() != null &&
                    !response.getValue().isEmpty()) {

                rate = response.getValue().get(0).getCotacaoCompra();
            }
        }

        String environment = "Currency-service running on port: " + port;

        CurrencyDTO dto = new CurrencyDTO(
                source,
                target,
                rate,
                environment
        );

        return ResponseEntity.ok(dto);
>>>>>>> 63fd536 (última atualização)
    }
}