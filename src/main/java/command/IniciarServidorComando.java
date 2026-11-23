package command;

public class IniciarServidorComando implements Comando {

    private Servidor servidor;

    public IniciarServidorComando(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public void executar() {
        this.servidor.iniciar();
    }

    @Override
    public void cancelar() {
        this.servidor.desligar();
    }
}