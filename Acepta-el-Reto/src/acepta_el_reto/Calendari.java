package acepta_el_reto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class Calendari {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int cas, encont = 0;
        short[] any;

        cas = ent.nextInt();
        if (cas > 0) {

            do {

                encont = ent.nextInt();
                
                any = new short[encont];

                for (int i = 0; i < any.length; i++) {
                    any[i] = ent.nextShort();
                }

                Arrays.sort(any);


                System.out.println(any[any.length - 1] - any[0] - encont + 1);

                
            } while (--cas>0);
        }
    }

}
