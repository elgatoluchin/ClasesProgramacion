import java.util.Scanner;
public class Ejercicio_Cuatro {
    public static void main(String[] args) {
       //Mostrar la secuencia de numeros entre 2 valores dados, el primer numero puede ser mayor,menor o igual al segundo
       //Se debe de mostrar por consolas desde el menor hasta el mayor
       Scanner sc = new Scanner (System.in);
       int  a,b;
       System.out.print("VºA: ");
       a=sc.nextInt(); 
       System.out.print("VºB: ");
       b=sc.nextInt();
       
       if(a > b){
        for(int i=b;i < a;i++){
            System.out.print(i + "\n");
          }
       }else{
          for(int i=a;i < b;i++){
            System.out.print(i + "\n");;
          }
       }
    }
}