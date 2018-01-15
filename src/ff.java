/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FARID 1972
 */
public class ff {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int nombor1 = 30, nombor2 = 30;
        
System.out.println("Masukkan nombor 1 : ");
    nombor1=input.nextInt();
System.out.println("Masukkan nombor 2 : ");
    nombor2=input.nextInt();
if (nombor1 > nombor2){
        System.out.println("Nombor 1 lebih besar berbanding nombor 2 ");
}
else if (nombor2 > nombor1){
        System.out.println(" Nombor 1 lebih kecil berbanding nombor 2 ");
}
else{
        System.out.println(" Nombor adalah sama besar ");
}
   
}
}
    
