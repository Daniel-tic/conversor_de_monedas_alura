
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarApi consulta = new ConsultarApi();
        int opcion = 0;


        while (opcion != 9) {
            System.out.println("\n***************************************************************");
            System.out.println("Bienvenido al coversor de monedas");
            System.out.println("---------------------------------");
            System.out.println("1) Dolar ==> Sol Peruano");
            System.out.println("2) Sol Peruano ==> Dolar");
            System.out.println("3) Sol Peruano ==> Peso Chileno");
            System.out.println("4) Peso Chileno ==> Sol Peruano");
            System.out.println("5) Dolar ==> Peso Argentino");
            System.out.println("6) Peso Argentino ==> Dolar");
            System.out.println("7) Dolar ==> Peso Colombiano");
            System.out.println("8) Peso Colombiano ==> Peso Dolar");
            System.out.println("9) Salir");
            System.out.println(" Elija una opción válida \n");
            System.out.println("*******************************************************************");

            try {
                opcion = lectura.nextInt();
                lectura.nextLine();

                switch (opcion) {
                    case 1:
                        ConvertirMoney.convertir("USD", "PEN", consulta, lectura);
                        Thread.sleep(5000); //se aplica una pausa para observar el resultado por un momento

                        break;
                    case 2:
                        ConvertirMoney.convertir("PEN", "USD", consulta, lectura);
                        Thread.sleep(5000);
                        break;
                    case 3:
                        ConvertirMoney.convertir("PEN", "CLP", consulta, lectura);
                        Thread.sleep(5000);
                        break;
                    case 4:
                        ConvertirMoney.convertir("CLP", "PEN", consulta, lectura);
                        Thread.sleep(5000);
                        break;
                    case 5:
                        ConvertirMoney.convertir("USD", "ARS", consulta, lectura);
                        Thread.sleep(5000);
                        break;
                    case 6:
                        ConvertirMoney.convertir("ARS", "USD", consulta, lectura);
                        Thread.sleep(5000);
                        break;
                    case 7:
                        ConvertirMoney.convertir("USD", "COP", consulta, lectura);
                        Thread.sleep(5000);
                        break;
                    case 8:
                        ConvertirMoney.convertir("COP", "USD", consulta, lectura);
                        Thread.sleep(5000);
                        break;

                    case 9:
                        System.out.println("Saliendo...");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Introduce sólo números por favor");
                opcion = -1;
            } catch (Exception e) {
                System.out.println("Opción no válida");
                break;

            }
        }
    }
}