package orientacao_a_objetos_02.parte2;

import orientacao_a_objetos_02.enums.Naipe;

public class Carta {

    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public void imprimirCarta(){
        System.out.println("Sou " + numero + " de " + naipe);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }
}
