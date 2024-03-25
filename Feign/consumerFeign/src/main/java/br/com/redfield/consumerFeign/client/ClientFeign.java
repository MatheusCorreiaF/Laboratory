package br.com.redfield.consumerFeign.client;

import br.com.redfield.consumerFeign.model.Age;
import br.com.redfield.consumerFeign.model.Client;
import feign.Body;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "clientFeignClient",
            url = "localhost:8181/v1/client")
public interface ClientFeign {

    @PostMapping
    Client getClient(Age age);
}
