package mediator;

public class RH implements Setor{
    private static RH instancia = new RH();

    private RH() {}

    public static RH getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O RH vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O RH agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O RH vai analisar a sugestão: " + mensagem;
    }
}

