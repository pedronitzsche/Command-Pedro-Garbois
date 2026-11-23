package command;

public class Servidor {

    private String nome;
    private String situacao;

    public Servidor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void iniciar() {
        this.situacao = "Servidor iniciado";
    }

    public void desligar() {
        this.situacao = "Servidor desligado";
    }
}