package br.com.redfield.consumerFeign.client.decode;


import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Component;

@Component
public class ClientDecodeError implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        System.out.println("Error Response!!!");

        if (404 == response.status()) {
            System.out.println("It's a 400 Error!!!");
        } else System.out.println("Error Response!!!");

        return new BadRequestException();
    }
}
