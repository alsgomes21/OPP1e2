/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classopp2;

/**
 *
 * @author alsgo
 */
public class mesa {
    String modelo;
    String cor;
    int pes;
    boolean vazia;
    
    void status(){
        System.out.println("A mesa é de " + this.modelo + " com a cor " + this.cor + "e está em perfeito estado com " + this.pes + " pes.");
        
    }
   void estudar(){
       if (vazia == true){
           System.out.println("A mesa está disponível para estudo");
      }
       else{
           System.out.println("A mesá está ocupada e indisponivel");
       }
   } 
}


