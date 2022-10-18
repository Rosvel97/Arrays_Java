import java.util.Scanner;

public class ArrayDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] precios = new double[5];
        double totalPagar=0;
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Ingrese el precio de su compra numero "+(i+1)+": $ ");
            precios[i]=sc.nextDouble();
        }
        System.out.println("");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("El precio es: $"+precios[i]);
            totalPagar=totalPagar+precios[i];
        }
        System.out.println("\nEl total a pagar es: $"+totalPagar);
    }
}
