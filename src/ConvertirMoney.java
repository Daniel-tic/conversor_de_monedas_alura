import java.util.Scanner;
import java.util.Date;

public class ConvertirMoney {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarApi consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;
        Date hoy = new Date();

        Money monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy " +hoy+
                " \n1 "+monedaBase+ " = "+monedas.conversion_rate()+" "+monedaTarget);


        System.out.println("Ingrese el valor que deseas convertir a " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("El valor de " + cantidad + " " + monedaBase + " corresponde al valor de =>> " + cantidadConvertida + " " + monedas.target_code());

    }
}
