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
public class Rabbit extends Animal{
    private String color;
    private String name;

    public Rabbit(String color, String name,boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
        this.name=name;
        this.vegetarian=vegetarian;
        this.eats=food;
        this.noOfLegs=legs;
        this.color=color;
    }
    
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    


}
