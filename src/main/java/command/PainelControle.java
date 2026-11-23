package command;

import java.util.ArrayList;
import java.util.List;

public class PainelControle {

    private List<Comando> comandos = new ArrayList<Comando>();

    public void executarComando(Comando comando) {
        this.comandos.add(comando);
        comando.executar();
    }

    public void cancelarUltimoComando() {
        if (comandos.size() != 0) {
            Comando comando = comandos.get(comandos.size() - 1);
            comando.cancelar();
            comandos.remove(comandos.size() - 1);
        }
    }
}