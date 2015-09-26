import java.util.Scanner;
public class Ejercicio_Tres_VDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        int[] arreglo = new int[0];
        int[] indice = new int[0];
        int cant,num;
        int cont = 0;
        do{
            System.out.println("**************** WELOME TO THE MENU *************************");
            System.out.println("1 - Carga Arreglo");
            System.out.println("2 - Mostrar Contenido");
            System.out.println("3 - Promedio (positivo & Negativo)");
            System.out.println("4 - Eliminar Elemento");
            System.out.println("5 - Salir");
            System.out.println("*************************************************************");
            System.out.print("L: ");
            opc = sc.nextInt();
            for(int s=0;s < 20;s++){
                System.out.println("\n");
            }
            switch(opc){
                case 1:System.out.println("---------| OPCION 1 |----------");
                       System.out.println("Defina el tamaño del arreglo");
                       System.out.print("L: ");
                       cant = sc.nextInt();
                    if(cant <= 10 && cant >= 1) {
                        cont = cant;
                        arreglo = new int[cant];
                        indice = new int[cant]; 
                        for (int i = 0; i < arreglo.length; i++) {
                            System.out.println("Ingrese un Elemento en el Espacio V[" + (i + 1) + "]");
                            arreglo[i] = sc.nextInt();
                            indice[i] = 1;
                            }
                    }else{
                        System.out.println("ERROR...(IngresaSolo Enteros entre 1 & 10)");
                    }
                ;break;
                 case 2:System.out.println("---------| OPCION 2 |----------");
                        System.out.println("El Contenido del Arreglo: ");
                    if(arreglo.length <= 0){
                        System.out.println("Vacio...............");;
                    }else if(cont <= 0) {
                        System.out.println("Vacio...............");
                    }else{
                        for(int i = 0; i < arreglo.length; i++) {
                            if (indice[i] == 1){
                                System.out.print("V" + (i + 1) + "[" + arreglo[i] + "] ");
                            }
                        }
                    }
                ;break;
                case 3:System.out.println("---------| OPCION 3 |----------");
                    if(arreglo.length <= 0){
                        System.out.println("Vacio...............");
                    }else if(cont <=0){
                        System.out.println("Vacio...............");
                    }else{
                        int sum_n=0,sum_p=0,cero=0;
                        float prom_n=0f,prom_p=0f,cont_n=0f,cont_p=0f;   
                        if(arreglo.length <=0){
                            System.out.println("Vacio...............");;
                        }else if(cont <=0){
                          System.out.println("Vacio...............");
                        }else{
                         for(int i=0;i < arreglo.length;i++){
                             if(indice[i]==1 && arreglo[i]<=-1 ){
                                sum_n=sum_n + arreglo[i];
                                cont_n++;
                             }else if(indice[i]==1 && arreglo[i]>=1){
                                sum_p=sum_p + arreglo[i];
                                cont_p++;
                              }
                           }
                        }
                        System.out.println("El Promedio de los Negativos: " + sum_n + " / "+ cont_n +" = " + (prom_n=(sum_n/cont_n)));
                        System.out.println("El Promedio de los positivos: " + sum_p + " / "+ cont_p +" = " + (prom_p=(sum_p/cont_p)));
                    }
                ;break;
                case 4:System.out.println("---------| OPCION 4 |----------");
                        if(arreglo.length <= 0){
                            System.out.println("Defina el tamaño del arreglo");
                        }
                        if(cont > 0){
                            System.out.println("Que numero desea eliminar");
                            System.out.print("L: ");
                            num = sc.nextInt();   
                        for(int i = 0; i < arreglo.length; i++) {
                            if(arreglo[i] == num) {
                                indice[i] = 0;
                                cont--;
                            }
                        }      
                     }else{
                        System.out.println("Vacio...............");
                    }
                ;break;
                case 5:System.out.println("Fin Del Programa");break;
                default:System.out.println("Opcion Incorrecta");break;
                }
            }while (opc != 5);
        }
    }