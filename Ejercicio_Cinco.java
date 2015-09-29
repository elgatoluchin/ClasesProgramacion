import java.util.Scanner;
public class Ejercicio_Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);  
        int [] vector;
        int cant,num,sum=0;
        
        cant=sc.nextInt(); //tamaño que tomara el vector
        vector= new int [cant]; // definimos el tamaño
        for(int i=0;i < vector.length;i++){
            vector[i]=sc.nextInt(); //damos los datos a cada elemento del vector
            sum=sum + vector[i]; //sumamos los valores dados uno por uno
        }
        System.out.println(sum); //mostramos la suma
    }
}