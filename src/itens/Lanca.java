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
public class Lanca extends Item{
    private double atack = 0.2;
    private double price = 50.0;
    
    public Lanca(String nome, String descricao, int peso){
        super(nome, descricao, peso);
    }
    public double pegaAtack(){
        return atack;
    }
    public double pegaPrice(){
        return price;
    }
    public void setAtack(double atack){
        this.atack = atack;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
