package br.com.redfield.consumerFeign.service;

import br.com.redfield.consumerFeign.client.ClientFeign;
import br.com.redfield.consumerFeign.model.Age;
import br.com.redfield.consumerFeign.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientFeign clientFeign;

    public Client getClientService(){

        System.out.println("InConsumer - service");
        return clientFeign.getClient(new Age(1));
    }
}
