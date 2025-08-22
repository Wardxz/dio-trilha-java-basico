package one.digitalinnovation.gof.subsistema2.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Brasilia";
    }

    public String recuperarEstado(String estado) {
        return "DF";
    }
}
