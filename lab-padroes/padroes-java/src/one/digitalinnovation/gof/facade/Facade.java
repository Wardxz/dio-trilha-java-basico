package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
