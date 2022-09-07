
package algoritmos;

import java.util.Scanner;
 
public class numeroPrimo
{
    public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);//Hacemos el ingreso por teclado del numero
        int contador,I,numero;//definimos las variables a utilizar
 
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();//recuperamos el numero ingresado por teclado
 
        contador = 0;
 
        for(I = 1; I <= numero; I++)//entramos a un ciclo FOR para validar si el numero es primo o no
        {
            if((numero % I) == 0)//colocamos un IF para determinar si el residuo de ese numero es igual a 0
            {
                contador++;
            }
        }
 
        if(contador <= 2)//Verificamos con un contador si el numero es divisible para 2 es primo, caso contrario no lo es.
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}