package com.bolivar.comunes.casing.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PalabrasAjustadasConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.bolivar.comunes.casing.consumingwebservice.wsdl");
        return marshaller;
    }


    @Bean
    public PalabrasAjustadasService palabrasAjustadasService (Jaxb2Marshaller marshaller) {
        PalabrasAjustadasService client = new PalabrasAjustadasService();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
