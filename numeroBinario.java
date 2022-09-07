
package algoritmos;


public class numeroBinario
{
    // Función para invertir bits de un entero dado
    public static int reverseBits(int n)
    {
        int pos = Integer.SIZE - 1;     // mantiene el turno
 
        // almacenar bits invertidos de `n`. Inicialmente, todos los bits se establecen en 0
        int reverse = 0;
 
        // hacer hasta que se procesen todos los bits
        while (pos >= 0 && n != 0)
        {
            // si el bit actual es 1, establezca el bit correspondiente en el resultado
            if ((n & 1) != 0) {
                reverse = reverse | (1 << pos);
            }
 
            n >>= 1;                    // elimina el bit actual (divide por 2)
            pos--;                      // decrementa el turno en 1
        }
 
        return reverse;
    }
 
    public static String toBinaryString(int n)
    {
        return String.format("%32s", Integer.toBinaryString(n))
                    .replaceAll(" ", "0");
    }
 
    public static void main(String[] args)
    {
        int n = -100;
 
        System.out.println(n + " in binary is " + toBinaryString(n));
        System.out.println("On reversing bits " + toBinaryString(reverseBits(n)));
    }
}