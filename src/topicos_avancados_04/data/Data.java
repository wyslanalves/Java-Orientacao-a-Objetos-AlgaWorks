package topicos_avancados_04.data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {


        Date hoje = new Date();
        System.out.println(hoje);

       // DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat.format(hoje));

        String dataAniversario = "20/01/1985";
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date aniversario = formatador.parse(dataAniversario);
        System.out.println(formatador.format(aniversario));

    }
}
