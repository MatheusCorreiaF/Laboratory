package br.com.redfield.consumerFeign.client;

import br.com.redfield.consumerFeign.model.Age;
import br.com.redfield.consumerFeign.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "clientFeignClient",
            url = "localhost:8181/v1/client")
public interface ClientFeign {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Client getClient(@RequestBody Age age);
}
