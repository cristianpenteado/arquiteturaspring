package io.github.cristianpenteado.arquiteturaspring.montadora.api;

import io.github.cristianpenteado.arquiteturaspring.montadora.CarroStatus;
import io.github.cristianpenteado.arquiteturaspring.montadora.Chave;
import io.github.cristianpenteado.arquiteturaspring.montadora.HondaHRV;
import io.github.cristianpenteado.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        carro.darIgnicao(chave);
        return carro.darIgnicao(chave);
    }
}
