package br.com.nuvy.testetecnico.service.impl;

import br.com.nuvy.testetecnico.model.DadosBancoCentral;
import br.com.nuvy.testetecnico.response.DadosBancoCentralResponse;
import br.com.nuvy.testetecnico.service.ConsultaBancoCentral;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ConsultaBancoCentralImpl implements ConsultaBancoCentral {

    static RestTemplate restTemplate = new RestTemplate();
    String baseUrl = "https://api.bcb.gov.br/dados/serie/bcdata.sgs.11/dados?formato=json&dataInicial=30/11/2022&dataFinal=30/11/2022";
    public String consultarBancoCentral(){
        String response = restTemplate.getForObject(baseUrl, String.class);

        return response.replaceAll("(.*/\\d{4})","").substring(11).substring(0,8);

    }

}
