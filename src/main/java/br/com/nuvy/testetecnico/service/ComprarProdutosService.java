package br.com.nuvy.testetecnico.service;

import br.com.nuvy.testetecnico.model.Payment;
import br.com.nuvy.testetecnico.model.Product;
import br.com.nuvy.testetecnico.response.ComprasResponse;

import java.io.IOException;

public interface ComprarProdutosService {

    ComprasResponse comprarProdutoTaxas(Product product, Payment payment) throws IOException;
}
