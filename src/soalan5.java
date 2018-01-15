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
public class soalan5 {
public static void main(String[] args){

    String ulasan = null;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nama anda: " );
    String nama=input.nextLine();
   
    System.out.print("Taipkan warna kegemaran anda\n "
            + "merah/biru/kuning/hijau/hitam/putih: ");
    
    String warna=input.nextLine();
    switch(warna) {
     case "merah" :{
     ulasan="membawa makna kekuatan, kemarahan dan semangat";
    break;
     }case "biru" :{
     ulasan="membawa maksud ketenangan, keikhlasan dan harapan"; 
    break;
     }case "kuning" :{
     ulasan="melambangkan kegembiraan, penuh semnagat dan riang";
    break;
     }case "hijau" :{
     ulasan="menggambarkan kehidupan, kestabilan dan ketulenan";
    break;
     }case "hitam" :{
     ulasan="dikaitkan dengan kejahatan dan penuh kerahsiaan";
    break;
     }case "putih" :{
     ulasan="adalah berani tetapi tidak suka tunjukkan keberanian";
    break;
     }default :{
         
    System.out.println("Maaf pilihan salah ");
    
     
     
    
         
     }
     }
             
     
        }
    }
            
            
                   


