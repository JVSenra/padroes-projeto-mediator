package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendenteTest {

    @Test
    void deveElogiarRH() {
        Atendente atendente = new Atendente();
        assertEquals("A Ouvidoria agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH agradece a mensagem: Ótimo atendimento", atendente.elogiarRH("Ótimo atendimento"));
    }

    @Test
    void deveReclamarRH() {
        Atendente atendente = new Atendente();
        assertEquals("A Ouvidoria agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                atendente.reclamarRH("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirRH() {
        Atendente atendente = new Atendente();
        assertEquals("A Ouvidoria agradece seu contato.\nO RH respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O RH vai analisar a sugestão: Ampliar horário funcionamento",
                atendente.sugerirRH("Ampliar horário funcionamento"));
    }

}