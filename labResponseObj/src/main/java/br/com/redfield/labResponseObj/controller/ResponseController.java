package br.com.redfield.labResponseObj.controller;

import br.com.redfield.labResponseObj.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ResponseController {



    @PostMapping()
    public ResponseEntity<Object> teste() {

        Object error = new Error("Erro Título", "Error Message");

        return new ResponseEntity<>(error,HttpStatus.UNAUTHORIZED);

    }
}
