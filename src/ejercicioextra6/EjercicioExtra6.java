/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package ejercicioextra6;

import java.util.Scanner;

public class EjercicioExtra6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double bajitos = 0;
        double altos = 0;
        double contadorBajitos = 0;
        double contadorAltos = 0;
        
        System.out.print("Ingresa N personas: ");
        int N = entrada.nextInt();
        
        System.out.println("");
        
        for (int i = 0; i < N; i++) {
            System.out.print("Cual es la estatura de la persona "+(i+1)+": ");
            double estatura = entrada.nextDouble();
            if(estatura < 1.60){
                bajitos += estatura;
                contadorBajitos++;
            }else{
                altos += estatura;
                contadorAltos++;
            }                
        }
        System.out.println("");
        if(contadorBajitos == 0){
            System.out.println("No se registraron personas  por debajo de 1.60 mts de altura");
            System.out.println("El promedio de personas con estatura por encima de 1.60 mts es de: "+altos/contadorAltos);
        }else if(contadorBajitos > 0 && contadorAltos > 0){
            System.out.println("El promedio de personas con estatura debajo de 1.60 mts es de: "+bajitos/contadorBajitos);
            System.out.println("");
            System.out.println("El promedio de personas con estatura por encima de 1.60 mts es de: "+altos/contadorAltos);
        }else{
            System.out.println("No se registraron personas por encima de 1.60 mts de altura");
            System.out.println("El promedio de personas con estatura debajo de 1.60 mts es de: "+bajitos/contadorBajitos);
        }
    }
}
