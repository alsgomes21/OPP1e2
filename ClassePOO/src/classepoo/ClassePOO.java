/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classepoo;

/**
 *
 * @author alsgo
 */
public class ClassePOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta ();
        c1.modelo = "Compactor";
        c1.cor = "Preta";
        c1.ponta = 0.5f;
        c1.carga = 80;
        
        c1.destampar();
        c1.status();
     
        c1.rabiscar();
        
        
        Caneta c2 = new Caneta ();
        c2.modelo = "Faber Castell";
        c2.cor = "Vermelha";
        c2.ponta = 0.7f;
        c2.carga = 60;
        
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
    
            
}
