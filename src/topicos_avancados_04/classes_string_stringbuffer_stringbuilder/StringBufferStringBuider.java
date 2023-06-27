package topicos_avancados_04.classes_string_stringbuffer_stringbuilder;

public class StringBufferStringBuider {

    public static void main(String[] args) {

        //String, StringBuilder e StringBuffer

        String s = "Olá";// Criado a String "Ola"
        s = s +  "Pessoal!!";// Criada a String "Olá Pessoal!"

        System.out.println(s);

        StringBuilder sb = new StringBuilder("Olá");
        sb.append("Pessoal!!");

        String resultado = sb.toString();

        System.out.println("Com StringBilder" + resultado);

    }
}
