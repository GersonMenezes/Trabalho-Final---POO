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
public class Arco extends Item{
    private double atack = 0.3;
    private double price = 70.0;
    
    public Arco(String nome, String descricao, int peso){
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
