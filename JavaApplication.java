/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner angka = new Scanner(System.in);
        System.out.print( "Masukan Angka: "  );
        int k = angka.nextInt();
        int n1=1,n2=1,n3,i,count=k;    
        System.out.print(n1+" "+n2);//printing 0 and 1    

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
         n3=n1+n2;
         n1=n2;    
         n2=n3;    
        }
         System.out.print(n3);
    }
}
