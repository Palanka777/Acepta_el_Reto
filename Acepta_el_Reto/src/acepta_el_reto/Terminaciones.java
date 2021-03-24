/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_el_reto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class Terminaciones {
    
    public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);
    
    int[] suma;
    int proves,cont,ultim,fi;
    String num;
    String copiaNum;
    boolean varis;
    
    do{
        cont=0;
        fi=0;
        ultim=0;
        varis=false;
        suma = new int []{0,0,0,0,0,0,0,0,0,0};
        
        proves=ent.nextInt();
    
        if (proves==0)break;
    
        do{

            num=ent.skip("[\r\n]*").nextLine();

            copiaNum=""+num.charAt(num.length()-1);
            ultim=Integer.parseInt(copiaNum);
            suma[ultim]+=1;
            cont++;

        }while(cont<proves);


     
        for (int i = 0; i < suma.length; i++) {

            if(suma[i]>fi)fi=i;
            if(i>0){
                if(suma[i-1]==suma[i] && suma[i]!=0)varis=true;
            }
        }
        if (varis)System.out.println("VARIS");
        else System.out.println(fi);
    
    }while(true);
    
    }
}
