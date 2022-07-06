/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classepoo;

/**
 *
 * @author alsgo
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.print("Uma caneta " + this.modelo);
        System.out.print(" de cor " + this.cor + " com ponta " + this.ponta);
        
        System.out.println(", e tem " + this.carga + "% de carga");
        System.out.println(" Esta tampada?" + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro, esta caneta está cancelada");
        }
        else {
            System.out.println("Rabiscar");
        } 
        
    }
    
    void tampar (){
        this.tampada = true;
        
    }
    void destampar () {
        this.tampada = false;
    }
}
