/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author PC-06
 */
public class Notas {
     
    public static void main(String[] args) {
//scanner
     Scanner sc=new Scanner(System.in);
     //cant de notas
         System.out. print("Ingrese el numero notas que se va ingresar:");
         //int N= sc.nextInt();
         
          float [] notas=new float[2];
           System.out. println("Ingrese las notas:");
          //for para la posicion
          
        for (int i = 0; i <notas.length; i++) {
             notas[i]= sc.nextInt();
            System.out. print("Elemento "+(i+1)+":"); 
             
        }
        //comprobar q sea menor q 20
        if (true) {
             float suma=0;
       for (int i = 0; i <notas.length; i++){
           suma=suma+notas[i];
       
       
            
        }
            
        
        }
    }
}
       
   
        // TODO code application logic here
    


