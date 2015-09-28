import java.util.Scanner;
public class Ejercicio_Tres_VDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        int opc;                      //Variable de para seleccionar la opcion
        int[] arreglo = new int[0];  // arreglo de 0 elementos que sera definido por el usuario
        int[] indice = new int[0];  //  arreglo(indice) que controla los elementos que ocupa el arreglo 
        int cant,num;              //   Cant numero que determina el tamaño del arreglo & num que es para comparar el numero que se elimina    
        int cont = 0;             //    Cont toma el valor de cant para controla si el arreglo ha sido definido y se resta cada vez que se elimine un valor del arreglo e indice
        do{
            System.out.println("");
            System.out.println("******************* WELOME TO THE MENU **********************");
=======
        int opc;
        int[] arreglo = new int[0];
        int[] indice = new int[0];
        int cant,num;
        int cont = 0;
        do{
            System.out.println("**************** WELOME TO THE MENU *************************");
>>>>>>> 5a927d8cab62e7f9e29ca6a680011ccf6fce31ce
            System.out.println("1 - Carga Arreglo");
            System.out.println("2 - Mostrar Contenido");
            System.out.println("3 - Promedio (positivo & Negativo)");
            System.out.println("4 - Eliminar Elemento");
            System.out.println("5 - Salir");
            System.out.println("*************************************************************");
            System.out.print("L: ");
            opc = sc.nextInt();
<<<<<<< HEAD
            for(int s=0;s < 20;s++){    //Bucle para despejar la consola
=======
            for(int s=0;s < 20;s++){
>>>>>>> 5a927d8cab62e7f9e29ca6a680011ccf6fce31ce
                System.out.println("\n");
            }
            switch(opc){
                case 1:System.out.println("---------| OPCION 1 |----------");
<<<<<<< HEAD
                       System.out.println("El Contenido del Arreglo: ");
                       System.out.print("L: ");
                       cant = sc.nextInt();          //valor definido por el usuario para dar el tamaño del arreglo
                    if(cant <= 10 && cant >= 1) {   //controlamos que el arreglo no sea mayor a 10 y menor a 1
                        cont = cant;
                        arreglo = new int[cant];
                        indice = new int[cant];     //le damos el valor de cant al arreglo para controlar el tamaño del arreglo
                        for (int i = 0; i < arreglo.length; i++) {
                            System.out.println("Ingrese un Elemento en el Espacio V[" + (i + 1) + "]");
                            arreglo[i] = sc.nextInt();
                            indice[i] = 1;  // cada vez que se ingrese un elemento al arreglo original daremos el valor de 1 al indice para saber si esta ocupado y 0 para saber que no tiene nada
                            }
                    }else{
                        System.out.println("ERROR...(Ingresa Solo Enteros entre 1 & 10)");
=======
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
>>>>>>> 5a927d8cab62e7f9e29ca6a680011ccf6fce31ce
                    }
                ;break;
                 case 2:System.out.println("---------| OPCION 2 |----------");
                        System.out.println("El Contenido del Arreglo: ");
<<<<<<< HEAD
                        if(cont <= 0) { // para decir que no ha definido el arreglo por lo tanto envia el mensaje de VACIO
                            System.out.println("Vacio...............");
                         }else{
                            for(int i = 0; i < arreglo.length; i++) { //Visualizacion del arreglo definido
                                if (indice[i] == 1){
                                System.out.print("V" + (i + 1) + "[" + arreglo[i] + "] ");
                                }
                            }
                        }
                ;break;
                case 3:System.out.println("---------| OPCION 3 |----------");
                        int sum_n=0,sum_p=0,cero=0; //Definimos las variables dentro ya seran contadores locales y no globales.
                        float prom_n=0f,prom_p=0f,cont_n=0f,cont_p=0f;   
                        System.out.println("El Contenido del Arreglo: ");
                        if(cont <=0){  // para decir que no ha definido el arreglo por lo tanto envia el mensaje de VACIO
                          System.out.println("Vacio...............");
                        }else{
                         for(int i=0;i < arreglo.length;i++){
                             if(indice[i]==1 && arreglo[i]<=-1 ){     // si el indice tiene un elemto y este es menor a -1 
                                sum_n=sum_n + arreglo[i];             // sum_n toma el valor de este y los va sumando  
                                cont_n++;                             // cont_n ira sumando la cantidad de numeros menor a -1
                             }else if(indice[i]==1 && arreglo[i]>=1){ // si el indice tiene un elemto y este es mayor a 1 
                                sum_p=sum_p + arreglo[i];             // sum_p toma el valor de este y los va sumando
                                cont_p++;                             // cont_p ira sumando la cantidad de numeros mayores a 1
                              }
                        }   //prom_n y n sera el resultado de la division de sum_x y cont_x este es de tipo float
=======
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
>>>>>>> 5a927d8cab62e7f9e29ca6a680011ccf6fce31ce
                        System.out.println("El Promedio de los Negativos: " + sum_n + " / "+ cont_n +" = " + (prom_n=(sum_n/cont_n)));
                        System.out.println("El Promedio de los positivos: " + sum_p + " / "+ cont_p +" = " + (prom_p=(sum_p/cont_p)));
                    }
                ;break;
                case 4:System.out.println("---------| OPCION 4 |----------");
<<<<<<< HEAD
                       System.out.println("El Contenido del Arreglo: ");
                       if(cont > 0){// para decir que no ha definido el arreglo por lo tanto envia el mensaje de VACIO
                            System.out.println("Que numero desea eliminar");
                            System.out.print("L: ");
                            num = sc.nextInt();   //num toma el valor del numero a eliminar
                        for(int i = 0; i < arreglo.length; i++) {
                            if(arreglo[i] == num){ // si el numero es igual al contenido del arreglo
                                indice[i] = 0;     // el indice que tiene el valor de 1 que es el espacio que el numero ocupa pasa a ser 0 
                                cont--;            // cont que es la cant(el tamaño de arreglo) se restara 1 o mas dependiendo de las veces que el numero este en el arreglo y en la opcion 2 se visualiza el tamaño redefinido 
=======
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
>>>>>>> 5a927d8cab62e7f9e29ca6a680011ccf6fce31ce
                            }
                        }      
                     }else{
                        System.out.println("Vacio...............");
                    }
                ;break;
                case 5:System.out.println("Fin Del Programa");break;
                default:System.out.println("Opcion Incorrecta");break;
                }
<<<<<<< HEAD
            }while (opc != 5); //mientras la opcion sea = a 5 este podra salir
=======
            }while (opc != 5);
>>>>>>> 5a927d8cab62e7f9e29ca6a680011ccf6fce31ce
        }
    }