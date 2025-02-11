package mediator;

public class Pessoa {

    public String elogiarRH(String mensagem) {
        return Ouvidoria.getInstancia().receberElogioSecretaria(mensagem);
    }

    public String reclamarRH(String mensagem) {
        return Ouvidoria.getInstancia().receberReclamacaoSecretaria(mensagem);
    }

    public String sugerirRH(String mensagem) {
        return Ouvidoria.getInstancia().receberSugestaoSecretaria(mensagem);
    }


}