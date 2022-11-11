package br.com.nuvy.testetecnico.response;

import br.com.nuvy.testetecnico.model.DadosBancoCentral;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class DadosBancoCentralResponse implements Serializable {

    List<DadosBancoCentral> dados;
}
