package orientacao_a_objetos_02.enums;

public enum Naipe {

    /*/
    OURO,
    PAUS,
    ESPADA,
    COPAS
    */
    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Preto"),
    COPAS("Vermelhor");

    private String cor;

    Naipe(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }
}
