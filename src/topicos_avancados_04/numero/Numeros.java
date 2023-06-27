package topicos_avancados_04.numero;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Numeros {
    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 1113.59;

        System.out.println(format.format(valorProduto));

        String entrada = "R$ 50,34";
        try {
            double numero = format.parse(entrada).doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        BigDecimal bg = new BigDecimal(500);
        bg.divide(BigDecimal.TEN);

    }
}
