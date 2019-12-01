/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itens;

/**
 *
 * @author Acer
 */
public class Bife extends Item{
    private int energy = 3;
    private double price = 100;
    
    public Bife(String nome, String descricao, int peso){
        super(nome, descricao, peso);
    }
    public int pegaEnergy(){
        return energy;
    }
    public double pegaPrice(){
        return price;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
