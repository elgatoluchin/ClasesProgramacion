import java.util.Scanner;


public class SolucionPR04
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      // 1.- Leer los dos números enteros con signo desde el teclado.
      int min = sc.nextInt();
      int max = sc.nextInt();
      
      // 2.- Si el primer número es mayor que el segundo, intercambiarlos de variable.
      if(max < min)
      {
         int temp = max;
         max = min;
         min = temp;
      }
      
      // 3.- Crear un ciclo iterativo para generar la secuencia numérica, desde 'min' hasta 'max'.
      for(int i=min; i <= max; i++)
      {
         // 4.- Imprimir cada número de la secuencia en consola, línea a línea.
         System.out.println( i );
      }
      
   }
}