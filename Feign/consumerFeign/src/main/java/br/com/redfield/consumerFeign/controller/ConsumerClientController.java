package br.com.redfield.consumerFeign.controller;

import br.com.redfield.consumerFeign.model.Client;
import br.com.redfield.consumerFeign.service.ClientService;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("consumerController")
@RequestMapping("/v1")
public class ConsumerClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/consumer")
    public ResponseEntity<Client> getClient(){
        System.out.println("InConsumer - controller");
        try {
            return new ResponseEntity<>(clientService.getClientService(),HttpStatus.OK);
        } catch (Exception e) {
            if(e.getClass().equals(feign.FeignException.class))
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return null;
    }
}
