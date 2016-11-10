/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excod1av;

import static java.lang.Thread.sleep;

/**
 *
 * @author damian
 */
public class ExCOD1Av {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clonamos el repositorio
        
        //Escribimos un programa
        for (int i=10;i>0;i--){
            if (i>1){
            System.out.println("Quedan "+i+" ciclos");
            }
            else{
                System.out.println("Queda "+i+" ciclo");
            }
        }
        System.out.println("Programa finalizado");
    }
    
}
