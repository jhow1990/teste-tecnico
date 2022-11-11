package br.com.nuvy.testetecnico.service.impl;

import br.com.nuvy.testetecnico.model.InstallmentsDefinition;
import br.com.nuvy.testetecnico.model.Payment;
import br.com.nuvy.testetecnico.model.Product;
import br.com.nuvy.testetecnico.response.ComprasResponse;
import br.com.nuvy.testetecnico.service.ComprarProdutosService;
import br.com.nuvy.testetecnico.service.ConsultaBancoCentral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ComprarProdutosServiceImpl implements ComprarProdutosService {

    @Autowired
    ConsultaBancoCentral consultaBancoCentral;

    @Override
    public ComprasResponse comprarProdutoTaxas(Product product, Payment payment) throws IOException {

        ComprasResponse compras = new ComprasResponse();
        InstallmentsDefinition installmentsDefinition = new InstallmentsDefinition();

        installmentsDefinition.setInstallmentsNum(payment.getInstallments());
        installmentsDefinition.setPrice(product.getPrice());

        String taxa = consultaBancoCentral.consultarBancoCentral();
        installmentsDefinition.setTax(Double.parseDouble(taxa));
        compras.setInstallmentsDefinition(installmentsDefinition);


        return compras;
    }
}
