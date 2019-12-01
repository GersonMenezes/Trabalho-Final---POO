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
public class EscudoDeFerro extends Item{
    private double defense = 0.6;
    private double price = 70;
    
    public EscudoDeFerro(String nome, String descricao, int peso){
        super(nome, descricao, peso);
    }
    public double pegaDefense(){
        return defense;
    }
    public double pegaPrice(){
        return price;
    }
    public void setDefense(double defense){
        this.defense = defense;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
