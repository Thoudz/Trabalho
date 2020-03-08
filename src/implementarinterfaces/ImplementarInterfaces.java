/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementarinterfaces;

/**
 *
 * @author joaom
 */
public class ImplementarInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Nintendo nintendoSwitch = new Nintendo("Nintendo", "342342342342", "there's no play like it");
       
        System.out.println(nintendoSwitch.criarAcessoriosNintendoSwitch());
        System.out.println(nintendoSwitch.criarControleNintendoSwitch());
        System.out.println(nintendoSwitch.criarNintendoSwitch());
       
       
    }
    
}
