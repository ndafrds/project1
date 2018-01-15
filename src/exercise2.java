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
public class exercise2 {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);


double no1;
double no2;
double tambah;
double tolak;
double bahagi;
double darab;

System.out.println(" Masukkan nombor pertama ");
no1=input.nextDouble();

System.out.println(" Masukkan nombor kedua ");
no2=input.nextDouble();

tambah=no1+no2;
tolak=no1-no2;
bahagi=no1/no2;
darab=no1*no2;

System.out.println("Jumlah tambah: " +tambah);
System.out.println("Jumlah tolak: "+tolak);
System.out.println("Jumlah darab:"+darab);
System.out.println("Jumlah bahagi: "+bahagi);
}
}






