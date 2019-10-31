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
public class Animal {

    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs){
    this.vegetarian=vegetarian;
    this.eats=food;
    this.noOfLegs=legs;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }


}
