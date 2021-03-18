/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package acepta_el_reto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Palanka
 */
public class Bolsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] digit;
        String numero;
        int fin, suma, cont = 0, cops, contCops = 0;

        cops = ent.nextInt();

        do {
            if (contCops >= cops) {
                break;
            }
            cont = 0;

            fin = ent.nextInt();
            numero = ent.skip("[\r\n]*").nextLine();

            digit = new int[numero.length()];

            for (int i = 0; i < numero.length(); i++) {
                digit[i] = Integer.parseInt("" + numero.charAt(i));
            }

            for (int i = 0; i < numero.length(); i++) {
                suma = digit[i];
                if (digit[i] != 0) {

                    for (int j = i + 1; j < numero.length(); j++) {
                        if (suma + digit[j] < fin) {
                            suma += digit[j];
                        } else {
                            if ((suma += digit[j]) == fin) {
                                cont++;
                            } else {
                                break;
                            }
                        }
                    }
                }

            }
            System.out.println(cont);
            contCops++;
        } while (true);
    }

}
