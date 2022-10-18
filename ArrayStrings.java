public class ArrayStrings{
    public static void main(String[] args) {
/*LOS ARREGLOS PUEDEN SER DE TIPO INT, DOUBLE, STRING */
    /*ARREGLOS STRINGS */
    String [] apellidos = new String[5];
    //SE INGRESAN LOS 5 APELLIDOS DESDE LA POSICION 0 HASTA LA 4
    apellidos[0] = "Rosales";
    apellidos[1] = "Payes";
    apellidos[2] = "Velasquez";
    apellidos[3] = "Cuellar";
    apellidos[4] = "Orellana";
    
    //ESTA ES UNA FORMA DE MANDAR A IMPRIMIR LOS APELLIDOS DENTRO DEL ARRAY
    //System.out.println(apellidos[0]+" "+apellidos[1]+" "+apellidos[2]+" "+apellidos[3]+" "+apellidos[4]);

    //Se apertura un ciclo for para poder recorrer todo el array y mandar a imprimir todos los apellidos dentro del array
    for (int i = 0; i < apellidos.length; i++) { //apellidos.length es el tamaño del array
     //Apellidos[i] en donde i vale inicialmente 0 y apellidos[0]= Rosales, luego aumenta i++ y muestra el siguiente array
        System.out.println(apellidos[i]);
    }
    }
}