/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_el_reto;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PortemUna {

    static Scanner ent = new Scanner(System.in);
    static int[] num1, num2;
    static String numero1, numero2;
    static int cont;

    public static void main(String[] args) {

        numero1 = ent.nextLine();
        num1 = new int[numero1.length()];
        num1 = intToString(numero1);

        numero2 = ent.nextLine();
        num2 = new int[numero2.length()];
        num2 = intToString(numero2);

        System.out.println(quantesEnPortem(num1, num2));

    }

    private static int[] intToString(String num1) {
        int[] num3 = new int[num1.length()];
        for (int i = 0; i < num1.length(); i++) {
            num3[i] = Integer.parseInt("" + num1.charAt(i));

        }

        return num3;
    }

    private static int quantesEnPortem(int[] num1, int[] num2) {
        
        if (num1!=null && num2!=null){
        int cont = 0;

        if (num1.length < num2.length) {

            for (int i = 0; i < num1.length; i++) {
                if (num1[i] + num2[i] >= 10) {
                    cont++;
                }

            }
        } else {
            for (int i = 0; i < num2.length; i++) {
                if (num1[i] + num2[i] >= 10) {
                    cont++;
                }
            }
        }
        return cont;
        }
        return 0;
    }

}
