import java.util.Scanner;


public class Solucion_Cinco
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      // 1.- Leer el primer número desde el teclado, que indica el largo del arreglo.
      int largoArreglo = sc.nextInt();
      
      // 2.- Crear un arreglo dinámico, del largo indicado anteriormente,
      //     para almacenar los datos siguientes.
      int[] arrDatos = new int[ largoArreglo ];
      
      // 3.- Realizar un ciclo que lea todos los datos del arreglo y los vaya
      //     almacenando dentro del arreglo del paso 2.
      for(int pos=0; pos < arrDatos.length; pos++)
      {
         // 3.1.- Leer el próximo dato del arreglo desde el teclado.
         int dato = sc.nextInt();
         
         // 3.2.- Almacenarlo en el arreglo.
         arrDatos[ pos ] = dato;      
      }
      
      // 4.- Realizar un segundo ciclo para sumar los datos del arreglo en un acumulador.
      int suma = 0;
      
      for(int pos=0; pos < arrDatos.length; pos++)
      {
         // 4.1.- Sumar los datos del arreglo y acumular en la variable 'suma'.
         suma = suma + arrDatos[ pos ];      
      }
      
      // 5.- Imprimir el resultado en consola, sin saltos de línea o espacios finales.
      System.out.print( suma );
      
      
   }
}