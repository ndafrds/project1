/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FARID 1972
 */
import java.util.Scanner;
public class soalan1b {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String ulasan;
        int nombor1; 
        int nombor2;
        
System.out.println("Masukkan nombor 1 : ");
    nombor1=input.nextInt();
System.out.println("Masukkan nombor 2 : ");
    nombor2=input.nextInt();
if (nombor1 < nombor2){
        ulasan= "Nombor 2 lebih besar berbanding nombor 1";
}
else if (nombor1 > nombor2){
        ulasan= " Nombor 1 lebih kecil berbanding nombor 2";
}
else
        ulasan=" Nombor adalah sama besar";

System.out.println(ulasan);

        }
   
}


    

