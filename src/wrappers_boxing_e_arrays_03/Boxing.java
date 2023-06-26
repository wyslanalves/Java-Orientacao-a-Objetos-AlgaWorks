package wrappers_boxing_e_arrays_03;

public class Boxing {
    public static void main(String[] args) {
        // byte, short, int, long, floot, doublr e char
        //Byte, Short, Interger, Long, Floot, Double e Character

        //Integer i = 10;

        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i1 == i2);
        //System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));
    }
}
