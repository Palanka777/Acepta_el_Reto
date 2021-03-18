/*
He elegit l'esquema de seqüencia de recorregut sense tractar el primer element diferent perque el problema no ens fa buscar res 
sino que ens fa traduir unes coordenades, ell ens passa unes coordenades que son el punt final del recorregut i nosaltres
recorrem el array fins aquest punt final on hi trobem el valor de la traduccio. La sequencia es tot el rato igual, ens passen
dos numeros i els traduim a una lletra i un numero, desde el principi fins el final es el mateix, per tan el primer element es tractat
com els demes.

El inconvenient que m'he trobat utilitzan aquest esquema es que els metodes que he fet son tots dependents de variables declarades
com a globals i llavors no puc independitzar cap metode a la biblioteca, pero he volgut fer una segona versio que li he dit
Practica3_1 on no he respectat tan l'estructura per poder aillar un dels metodes i posar-lo a la biblioteca.

Els casos en que el programa pot donar error no els he tractat perque representa que les dades les passa unaltre programa que 
es una camara, per tan si el numero es mes gran que el tablero petaria o si es mes petit tambe, ho he deixat aixi pq es un
problema de acepta el reto i s'espera que les entrades siguin correctes.
 */
package acepta_el_reto;

import java.util.Scanner;

/**Programa de traduccio de cordenades a posicions de tablero d'escacs
 *
 * @author Palanka
 */
public class Escacs {
    static Scanner ent = new Scanner(System.in);
    static int[] cordenada;
   
    /**Metode main que conte la sequencia a ejecutar.
     *
     * @param args
     */
    public static void main(String[] args) {

        inicialitzarVariables();
        
        do {
            
            tractarElement();    
                
        } while (!tractamentFinal());

    }

    
    /**Aquest metode nomes inicialitza el vector.
     *
     */
    public static void inicialitzarVariables() {
       cordenada = new int[2];
    }

    /**Aquest metode tradueix les cordenades que passa un programa de analisis de moviments i ho tradueix a posicions d'escacs standards.
     *
     *
     *
     */
    public static void tractarElement() {
        cordenada[1] = ent.nextInt();
        cordenada[0] = ent.nextInt();
        char[] pos = {'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
        if(!tractamentFinal())
        System.out.println(pos[cordenada[1] - 1] + "" + cordenada[0]);  
    }

    /**Aquest metode serveix per posar final a la sequencia del programa i acabar.
     *
     * @return si una de les dues coordenades es 0 retorna true.
     */
    public static  boolean tractamentFinal() {
        
        return (cordenada[0] == 0 && cordenada[1] == 0); //jo aqui hagues posat un || per evitar el error pero ho he deixat tal qual diu el anunciat.
    }

}
