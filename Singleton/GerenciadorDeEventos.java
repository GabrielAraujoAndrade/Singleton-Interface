package Singleton;

public class GerenciadorDeEventos {
    private static GerenciadorDeEventos instancia;
    private String evento;

    private GerenciadorDeEventos() {
    }

    public static GerenciadorDeEventos getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorDeEventos();
        }
        return instancia;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void processarEvento() {
        System.out.println("Evento processado: " + evento);
    }
}

