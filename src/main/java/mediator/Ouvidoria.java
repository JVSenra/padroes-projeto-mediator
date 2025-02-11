package mediator;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String receberElogioSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O RH respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RH.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O RH respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RH.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSecretaria(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O RH respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + RH.getInstancia().receberSugestao(mensagem);
    }

}
