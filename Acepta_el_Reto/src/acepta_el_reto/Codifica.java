/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.bo
 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class Codifica {
    
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    String original="", codificat="",codificat1="";
    int constant, cont=0;
    
    

do{
    
    
    codificat="";
    codificat1="";
    cont=0;
//llegeixo el missatge a codificar
    original=ent.nextLine();

//extrec la constan per codificar.    
    constant=original.charAt(0)-112;
    
//codifico el missatge
        for (int i = 1; i < original.length(); i++) {
            
            if((int)original.charAt(i)>64 && (int)original.charAt(i)<91 || (int)original.charAt(i) > 96 && (int)original.charAt(i) < 123){
                
                codificat+=""+(char)(original.charAt(i)-constant);
                
            }else {
                
                codificat+=""+(original.charAt(i));
            }
        }

        for (int i = 0; i < codificat.length(); i++) {
            
            if (codificat.charAt(i)<65 && codificat.charAt(i)!=32 && codificat.charAt(i)!=original.charAt(i+1)){
                codificat1+=(char)(91-(65-(codificat.charAt(i))));

            }else if (codificat.charAt(i)<97 && codificat.charAt(i)>90 && codificat.charAt(i)!=32 && codificat.charAt(i)!=original.charAt(i+1) && original.charAt(i+1)>96){
                codificat1+=(char)(123-(97-(codificat.charAt(i))));

            }else if (codificat.charAt(i)>122 && codificat.charAt(i)!=original.charAt(i+1)){
                codificat1+=(char)(97+(123-(codificat.charAt(i))));
               
            }else if (codificat.charAt(i) > 90 && codificat.charAt(i) < 97 && codificat.charAt(i)!=original.charAt(i+1)){
                codificat1+=(char)(65+(91-(codificat.charAt(i))));

            } else codificat1+=(char)codificat.charAt(i);

            switch(codificat1.charAt(i)){
                case 'a':
                    cont++;
                    break;
                case 'e':
                    cont++;
                    break;
                case 'i':
                    cont++;
                    break;
                case 'o':
                    cont++;
                    break;
                case 'u':
                    cont++;
                    break;
                case 'A':
                    cont++;
                    break;
                case 'E':
                    cont++;
                    break;
                case 'I':
                    cont++;
                    break;
                case 'O':
                    cont++;
                    break;
                case 'U':
                    cont++;
                    break;
            }
        }
        
        if (codificat1.equals("FIN"))break;

           System.out.println(cont++);
        
        
        }while(true);
    }
}
