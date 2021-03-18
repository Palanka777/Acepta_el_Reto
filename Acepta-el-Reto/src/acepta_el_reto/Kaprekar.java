/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Es bo.
 */
package acepta_el_reto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *.
 * @author Palanka
 */
public class Kaprekar {
    static Scanner ent = new Scanner(System.in);
    static String numero;
    static int resultat,contA,contB,casos;
    static int[] num;
    static boolean valid;
    
    public static void main(String[] args) {
        casos = ent.nextInt();
        do{
        if(contB==casos)break;    
        
        do{
        numero = ent.skip("[\r\n]*").nextLine();
        num=new int[numero.length()];
       
//paso numero string a casellas de vector int
        num=intToString(numero);
        
        }while(numero.length()<4);
        
//compto quans salts de kaprekar ya
        
        resultat=saltsKaprekar(num);
        
        System.out.println(resultat);
        contB++;
        contA=0;
    }while(true);
    }
        
    
    private static int[] intToString(String num1) {
    int[] num3 = new int[num1.length()];
    for (int i = 0; i < num1.length(); i++) {
        num3[i] = Integer.parseInt("" + num1.charAt(i));

    }

    return num3;
}

    private static int saltsKaprekar(int[] num) {
        if (num==null)return 0;
        if (contA>7)return 8;
        
        int[] recu=new int[num.length];
        String numA="", numB="",numC="";
        int nA=0,nB=0,nC=0;
        Arrays.sort(num);
        
       
        for (int i = 0; i < num.length; i++) {
            numB+=Integer.toString(num[i]);
        }
        
        
        for (int i = num.length-1; i >= 0; i--) {
            numA+=Integer.toString(num[i]);
        }
        
        nA=Integer.parseInt(numA);
        nB=Integer.parseInt(numB);
        
        if (nA==7641)return 0;
        
        nC=nA-nB;
        numC=Integer.toString(nC);
        if(numC.length()<4){
           numC="0"+numC; 
        }
               
        recu=intToString(numC);


        if(nC!=6174){
            contA++;
            return  saltsKaprekar(recu);
        }
        else {
            contA++;
            return contA;
        }

    }
}
