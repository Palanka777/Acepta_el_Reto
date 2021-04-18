/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.io.File;

/**
 *
 * @author Palanka
 */
public class Projecte {

    static final String NOM_FITXER_CONFIG = "config.txt"; //creo una constant amb el nom del fixer de config amb extencio txt per poder-lo manipular.
    static File fitxerConfig = new File(NOM_FITXER_CONFIG); // instancio el fixer config.
    static final String NOM_FITXER_DADES = "dades.dat"; //creo una constant amb el nom del fixer de dades
    static File fitxerDades = new File(NOM_FITXER_DADES); // instancio el fixer dades.
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Window1 v = new Window1();
        v.setVisible(true);
        Ajuda a = new Ajuda();
        a.setVisible(true);
    }
    
}
