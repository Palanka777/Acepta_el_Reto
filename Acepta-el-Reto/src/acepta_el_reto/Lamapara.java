package acepta_el_reto;


import java.util.Scanner;

/**
 *i
 * @author alumne
 */
public class Lamapara {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        long intentos = 0, horas = 0, encend = 0, miuso = 0, cont = 0;

        intentos = ent.nextInt();

        do {
            
            if (cont >= intentos) {
                break;
            } else {
                
                do {
                    horas = ent.nextLong();
                    
                    if (horas <= 1000000000 && horas > 0) {
                        break;
                    }
                    
                } while (true);

                do {
                    encend = ent.nextLong();
                    if (encend <= 100000000 && encend > 0) {
                        break;
                    }
                } while (true);

                do {
                    miuso = ent.nextLong();
                    if (miuso > 0 && miuso <= 10) {
                        break;
                    }
                } while (true);

                if ((miuso * encend >= horas) && (miuso * encend <= horas)) {
                    System.out.println("AMBAS");
                } else {

                    if (miuso * encend >= horas) {
                        System.out.println("HORAS");
                    }else{
                    
                        System.out.println("ENCENDIDOS");
                    }
                }

                
            }
            cont++;
        } while (true);

    }
}
