import java.util.Scanner;
public class ArrayInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaEdad=0;
        double mediaEdad=0;
        int[] edad = new int[3]; //SE ABRE UN ARRAY EN DONDE SE GUARDARAN LAS EDADES
        for (int i = 0; i < edad.length; i++) { //SE ABRE UN CICLO FOR EN DONDE SE RRECORRE EL ARRAY Y SE GUARDAN LAS EDADES 
        System.out.print("Ingrese tu edad: ");
        edad[i]=sc.nextInt(); //SE GUARDA LA PRIMERA EDAD EN LA POSICION [i]=0 luego al array incrementa i++
        }
        System.out.println();
        //SE CREA UN SEGUNDO FOR PARA IMPRIMIR LOS EDADES GUARDADAS DENTRO DE CADA POSICION DEL ARRAY edad[]
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Las edades son: "+edad[i]);
        }
        //ABRIMOS UN FOR PARA PODER SUMAR LAS EDADES Y SACAR LA MEDIA
        for (int i = 0; i < edad.length; i++) {
            sumaEdad=sumaEdad+edad[i];
            mediaEdad=sumaEdad/edad.length;
        }
        System.out.println("La media de las edades es: "+mediaEdad);
    }
}
