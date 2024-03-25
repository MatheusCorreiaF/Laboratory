package br.com.redfield.clientFeign.controller;

import br.com.redfield.clientFeign.model.Age;
import br.com.redfield.clientFeign.model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ClientController {

    @PostMapping("/client")
    public ResponseEntity<Client> getClient(@RequestBody Age age){

        System.out.println("InClient - controller");
        return new ResponseEntity<>(new Client("Matheus","Correia", age.age()),HttpStatus.OK);
    }
}
