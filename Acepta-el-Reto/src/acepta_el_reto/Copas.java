package acepta_el_reto;

import java.util.Arrays;
import java.util.Scanner;


public class Copas {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int copas=0;
        long mitja=0;
        long[] cl;
        
        copas = ent.nextInt();
        cl=new long[copas];
        
        while(copas!=0){
           
            for(int i =0; i<cl.length; i++ ){
                cl[i]=ent.nextLong();
            }
            
            Arrays.sort(cl);
            
            for(int i = cl.length-1; i>=0; i--){
                mitja+=cl[cl.length - 1]-cl[i];
            }
            System.out.println(mitja);
            break;
        }
    }
}
