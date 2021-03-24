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
public class Terminaciones1 {
    
    public static void main(String[] args) {
    
    Scanner ent = new Scanner(System.in);
    
    int[] suma;
    int proves,cont,fi,num,ultim=0;
    double copiaNum;
    boolean varis;
    
    do{
        cont=0;
        fi=0;
        varis=false;
        suma = new int []{0,0,0,0,0,0,0,0,0,0};
        
        proves=ent.nextInt();
    
        if (proves==0)break;
    
        do{

            num=ent.nextInt();

            copiaNum = num%10;
            if (copiaNum<0)copiaNum=num*10;
            suma[(int)copiaNum]+=1;
            cont++;

        }while(cont<proves);


     
        for (int i = 0; i < suma.length; i++) {

            if(suma[i]>=fi){
                fi=suma[i];
                ultim=i;
            }
            
        }

        for (int i = 0; i < suma.length; i++) {
            
            if(suma[i]==suma[ultim]&& i!=ultim){
                
                varis=true;
                
            }
            
        }
        if (varis)System.out.println("VARIS");
        else System.out.println(ultim);
    
    }while(true);
    
    }
}
