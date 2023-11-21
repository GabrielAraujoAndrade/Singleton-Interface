package Singleton;

public class Principal {
    public static void main(String[] args) {
        GerenciadorDeEventos gerenciadorDeEventos = GerenciadorDeEventos.getInstance();
        gerenciadorDeEventos.setEvento("Evento A");
        gerenciadorDeEventos.processarEvento();
    }
}

