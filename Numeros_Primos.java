public class Numeros_Primos {
    public static void main(String[] args) {
        int num=1;
        do{
            boolean primo=true; //comprobamos todos los numeros que se encuentren desde 2 hasta el num
            for(int i=2;i < num/2 && primo==true;i++){
                if(num%i==0){  //si el numero No es divisible lo dejamos a false y luego comprobara primo=true NO ahora es false
                    primo=false;
                }
            }
            if(primo==true){
                System.out.print(num + " ");
            }
            num++;
        }while(num!=1000);
    }  
}