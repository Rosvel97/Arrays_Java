public class ArrayInt2 {
    public static void main(String[] args) {
        int cont0=0,contPar=0,contImpar=0;
        int [] numeros={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero: "+numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]==0){
                cont0=cont0+1;
            }
            else if(numeros[i]%2==0)
            {
                contPar=contPar+1;
            }
            else
            {
                contImpar=contImpar+1;
            }
        }
        System.out.println("\nLos numeros 0 encontrados son:"+cont0);
        System.out.println("Numeros pares encontrados: "+contPar+"\nNumeros impares encontrados: "+contImpar);
    }
}
