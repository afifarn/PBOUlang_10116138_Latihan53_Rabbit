/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan53_rabbit;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Program Biodata Kelinci
 */
public class PBOUlang_10116138_Latihan53_Rabbit {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("grey", "Peter", false, "grass", 4);
        System.out.println("Hello, his name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    }

}
