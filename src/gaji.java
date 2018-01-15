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
public class gaji{
        public static void main (String [] args) {
        
        String nama;
        int jam_sehari;
        int jam_ot;
        int bil_hari;
        int gaji;
        
        Scanner scan=new Scanner(System.in);
                
        System.out.print("Masukkan nama pekerja:");
        nama=scan.nextLine();
        
        System.out.print("Masukkan bilangan jam bekerja sehari:");
        jam_sehari=scan.nextInt();
        while (jam_sehari>9){
            System.out.print("Bilangan jam sehari tidak boleh melebihi 9 jam, sila masukkan bilangan jam yang betul:");
            jam_sehari=scan.nextInt(); 
        }
        
        System.out.print("Masukkan bilangan hari bekerja:");
        bil_hari=scan.nextInt();
        while (bil_hari>30){
            System.out.print("Bilangan hari bekerja tidak boleh melebihi 30 hari, sila masukkan bilangan hari yang betul:");
            bil_hari=scan.nextInt();
        }
        
        System.out.print("Masukkan bilangan jam kerja lebih masa:");       
        jam_ot=scan.nextInt();
        while (jam_ot>50){
            System.out.print("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam, sila masukkan bilangan jam yang betul.");
            jam_ot=scan.nextInt();
        }
        
        gaji=(jam_sehari*bil_hari*20)+(jam_ot*15);
        
        System.out.println("\nRumusan gaji bulanan "+nama+":\n\nJumlah jam bekerja: "+jam_sehari+" jam\nJumlah hari bekerja: "+bil_hari+" hari\nJumlah jam lebih masa: "+jam_ot+" jam\n\nJUMLAH GAJI: RM "+gaji);
    }
}


    
