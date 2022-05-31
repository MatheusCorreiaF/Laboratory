package br.com.redfield.localdatetimeserialize.controller;

import br.com.redfield.localdatetimeserialize.model.Pessoa;
import br.com.redfield.localdatetimeserialize.utils.LocalDateTimeUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1")
public class PessoaController {


    @GetMapping(value = "/pessoa")
    public ResponseEntity<Pessoa> getPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Karin Benzema");
        /*LocalDateTime localDateTime = LocalDateTime.now();
        pessoa.setBornDate(localDateTime);*/
        LocalDateTime localDateTime = LocalDateTimeUtils.convertStringToDateTime("20220530212508074");
        pessoa.setBornDate(localDateTime);

        return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
    }
}
