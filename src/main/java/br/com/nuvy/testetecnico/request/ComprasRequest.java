package br.com.nuvy.testetecnico.request;

import br.com.nuvy.testetecnico.model.Payment;
import br.com.nuvy.testetecnico.model.Product;
import lombok.Data;

@Data
public class ComprasRequest {

    Product product;
    Payment payment;
}
