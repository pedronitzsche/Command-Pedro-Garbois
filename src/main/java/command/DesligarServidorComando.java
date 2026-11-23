package command;

public class DesligarServidorComando implements Comando {

    private Servidor servidor;

    public DesligarServidorComando(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public void executar() {
        this.servidor.desligar();
    }

    @Override
    public void cancelar() {
        this.servidor.iniciar();
    }
}