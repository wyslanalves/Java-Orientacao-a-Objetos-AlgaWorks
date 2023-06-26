package wrappers_boxing_e_arrays_03;

public class Wrapper {
    public static void main(String[] args) {
        // byte, short, int, long, floot, doublr e char
        //Byte, Short, Interger, Long, Floot, Double e Character

        int x = 5;
        Integer i = new Integer(5);

        byte y = i.byteValue();

        String  valor = "15.5";
        Float v = new Float(valor);
        System.out.println(v + 3);

        int idade = Integer.parseInt("27");
        System.out.println("Daqui á 5 Anos você terá: " + (idade + 5) + " anos.");

        double custo = Double.parseDouble("23.5");
        System.out.println("Custo total: " + custo);
    }
}
