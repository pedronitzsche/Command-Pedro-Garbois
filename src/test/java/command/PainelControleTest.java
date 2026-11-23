package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PainelControleTest {

    PainelControle painelControle;
    Servidor servidor;

    @BeforeEach
    void setUp() {
        painelControle = new PainelControle();
        servidor = new Servidor("Servidor Principal");
    }

    @Test
    void deveIniciarServidor() {
        Comando comando = new IniciarServidorComando(servidor);

        painelControle.executarComando(comando);

        assertEquals("Servidor iniciado", servidor.getSituacao());
    }

    @Test
    void deveDesligarServidor() {
        Comando comando = new DesligarServidorComando(servidor);

        painelControle.executarComando(comando);

        assertEquals("Servidor desligado", servidor.getSituacao());
    }

    @Test
    void deveCancelarDesligamentoServidor() {
        Comando iniciar = new IniciarServidorComando(servidor);
        Comando desligar = new DesligarServidorComando(servidor);

        painelControle.executarComando(iniciar);
        painelControle.executarComando(desligar);

        painelControle.cancelarUltimoComando();

        assertEquals("Servidor iniciado", servidor.getSituacao());
    }
}