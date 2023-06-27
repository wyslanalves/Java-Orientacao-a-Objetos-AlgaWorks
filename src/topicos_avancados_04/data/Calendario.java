package topicos_avancados_04.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendario {

    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();

        c.set(Calendar.DAY_OF_MONTH, 15);
        c.set(Calendar.MONTH, 8);
        c.set(Calendar.YEAR, 2010);
        c.set(Calendar.HOUR_OF_DAY, 10);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat.format(c.getTime()));

        c.add(Calendar.MONTH, 1);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");




    }
}
