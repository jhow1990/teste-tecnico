package br.com.nuvy.testetecnico.controller;

import br.com.nuvy.testetecnico.request.ComprasRequest;
import br.com.nuvy.testetecnico.response.ComprasResponse;
import br.com.nuvy.testetecnico.service.ComprarProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(value="/")
public class ComprarProdutosController {

    @Autowired
    ComprarProdutosService comprarProdutosService;

    @GetMapping("compra")
    public ComprasResponse compra(@RequestBody ComprasRequest request) throws IOException {

        ComprasResponse response = comprarProdutosService.comprarProdutoTaxas(request.getProduct(), request.getPayment());
        return response;
    }
}
