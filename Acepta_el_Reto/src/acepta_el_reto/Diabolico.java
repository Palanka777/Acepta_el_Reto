/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.bo
 */
package acepta_el_reto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class Diabolico {
    static Scanner ent = new Scanner(System.in);
    static int[][] matriu;
    static int caselles;
    static boolean diabolic=false,esoterico=false;
    static int numMagic=0;
    
    public static void main(String[] args) {
        
        
        caselles =ent.nextInt();
        do{
            if(caselles==0)break;
            matriu=new int[caselles][caselles];
            for (int i = 0; i < matriu.length; i++) {
                for (int j = 0; j < matriu[i].length; j++) {
                    matriu[i][j]=ent.nextInt();

                }
            }
//miro si la matriu es diabolica            
            diabolic=esDiabolic(matriu);

//si es diabolica miro si es esoterica

            if (diabolic) {
                if(esEsoterico(matriu)){
                    System.out.println("ESTERICO");
                    break;
                }else {
                    System.out.println("DIABOLICO");
                    break;
                }
            }else {
                System.out.println("NO");
                break;
            }
            
        }while(true);
        
    }

    private static boolean esDiabolic(int[][] matriu) {
        if (matriu==null) return false;
        
        int num=0;
        
//miro primer que totes les files sumin el numero magic
        for (int i = 0; i < matriu.length; i++) {
                  
                numMagic+=matriu[0][i];
            
        }
        for (int i = 0; i < matriu.length; i++) {
            num=0;
            for (int j = 0; j < matriu[i].length; j++) {
                if (i>0)num+=matriu[i][j];
            }

        }

        if (num!=numMagic)return false;

        
////miro si les columnes sumen el numero magic
        
        for (int i = 0; i < matriu.length; i++) {
           num=0;
            for (int j = 0; j < matriu[i].length; j++) {
                num+=matriu[j][i];
            }

            if (num!=numMagic)return false;
        }
        
////miro si les diagonals sumen el numero magic
        num=0;
        
        for (int i = 0; i < matriu.length; i++) {
            num+=matriu[i][i];
        }

        if (num!=numMagic)return false;
        
        num=0;

        return true;
    }

    private static boolean esEsoterico(int[][] matriu) {
        if(matriu==null)return false;
        
        int num=0,centro=((matriu.length+1)/2)-1,centro1=(matriu.length/2)-1,dimensio=matriu.length*matriu.length;
        int numMagic2=(4*numMagic)/caselles;
        
//miro si els numeros son com el numero de caselles

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
               
                if(matriu[i][j] > dimensio)return false;
            }
        }
        
//miro que les cantonades donguin el numero magic2
        
        num=matriu[0][0]+matriu[matriu.length-1][matriu.length-1]+matriu[matriu.length-1][0]+matriu[0][matriu.length-1];
        
        if (num!=numMagic2)return false;
        
//miro si el numero magic es parell o imparell

        if(numMagic%2==0){
//            System.out.println(matriu[0][centro1]+matriu[0][centro1+1]+matriu[centro1][0]+matriu[centro1+1][0]+matriu[centro1][matriu.length-1]+matriu[centro1+1][matriu.length-1]+matriu[matriu.length-1][centro1]+matriu[matriu.length-1][centro1+1]);
            if (matriu[0][centro]+matriu[0][centro+1]+matriu[centro][0]+matriu[centro+1][0]+matriu[centro][matriu.length-1]+matriu[centro+1][matriu.length-1]+matriu[matriu.length-1][centro]+matriu[matriu.length-1][centro+1]!=numMagic2*2)return false;
            if (matriu[centro1][centro1]+matriu[centro1+1][centro1+1]+matriu[centro1+1][centro1]+matriu[centro1][centro1+1]==numMagic2)return true;
        
            if (matriu[0][centro]+matriu[centro][0]+matriu[centro][matriu.length-1]+matriu[matriu.length-1][centro]!=numMagic2)return false;
            if (matriu[centro][centro]*4!=numMagic2)return false;           }

            return true;
    
        }
        
    }

    
