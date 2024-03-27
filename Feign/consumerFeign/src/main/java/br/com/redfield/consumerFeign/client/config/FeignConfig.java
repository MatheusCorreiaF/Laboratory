package br.com.redfield.consumerFeign.client.config;

import br.com.redfield.consumerFeign.client.decode.ClientDecodeError;
import org.springframework.context.annotation.Bean;

import feign.Logger;
import feign.codec.ErrorDecoder;


public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

//    @Bean
//    ErrorDecoder errorDecoder() {
//        return new ClientDecodeError();
//    }
}