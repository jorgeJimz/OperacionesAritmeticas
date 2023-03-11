

package com.mycompany.operacionesaritmeticas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionesAritmeticas {

    public static void main(String[] args) {
        
        int numero_1;
        int numero_2;
        int resultado;
        int resultado_1;
        int resultado_2;
        int resultado_3;
        
       
        Scanner constructor=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        numero_1=constructor.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        numero_2=constructor.nextInt();
        
        resultado=numero_1 + numero_2;
        resultado_1 =numero_1 - numero_2;
        resultado_2 =numero_1 * numero_2;
        resultado_3 =numero_1 / numero_2;
        
        
        System.out.println("El resultado de las operaciones Aritmeticas son: \n Suma: "+resultado +"\n Resta es: " +resultado_1 +"\n Multiplicacion es: "+resultado_2 +"\n Divicion es: " +resultado_3);
          
     }  
    
}
