package fundamentos_da_linguagem_01;

public class ConversaoDeTiposPrimitivos {
    public static void main(String[] args) {

        // Usando CASTING
        long x = 10;
        //int y = x;
        int y = (int) x;
        System.out.println(y);

        long w = 9300000035L;
        //int i = w;
        int i = (int)w;
        System.out.println(i);

        double largura = 100;
        //int tamamho = largura;
        int tamamho = (int) largura;
        System.out.println(tamamho);

    }
}
