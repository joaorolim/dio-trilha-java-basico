import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {

        // Number valor = Double.valueOf("a1.75");
        // System.out.println("1-valor: " + valor);


        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println("2-valor: " + valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}