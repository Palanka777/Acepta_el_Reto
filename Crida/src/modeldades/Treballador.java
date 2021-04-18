/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeldades;

/**
 *
 * @author Palanka
 */
public class Treballador implements java.io.Serializable, Comparable <Treballador> {

    private String _1_nom;
    private String _2_cognom;
    private int _3_telefon;
    private String _4_categoria;
    private int _5_hores;


    
    public Treballador(){
        
    }
    
    public Treballador(String nom, String cognom, int telefon, String categoria, int hores){

        this._1_nom=nom;
        this._2_cognom=cognom;
        this._3_telefon=telefon;
        this._4_categoria=categoria;
        this._5_hores=hores;
    }
    
    public String get1_nom() {
        return _1_nom;
    }

    public void set1_nom(String _1_nom) {
        this._1_nom = _1_nom;
    }

    public String get2_cognom() {
        return _2_cognom;
    }

    public void set2_cognom(String _2_cognom) {
        this._2_cognom = _2_cognom;
    }

    public int get3_telefon() {
        return _3_telefon;
    }

    public void set3_telefon(int _3_telefon) {
        this._3_telefon = _3_telefon;
    }

    public String get4_categoria() {
        return _4_categoria;
    }

    public void set4_categoria(String _4_categoria) {
        this._4_categoria = _4_categoria;
    }

    public int get5_hores() {
        return _5_hores;
    }

    public void set5_hores(int _5_hores) {
        this._5_hores = _5_hores;
    }
    

    
    @Override
    public String toString() {
        return "Treballador{" + "_1_nom=" + _1_nom + ", _2_cognom=" + _2_cognom + ", _3_Telefon=" + _3_telefon + ", _4_categoria=" + _4_categoria + ", _5_hores=" + _5_hores + '}';
    }

    @Override
    public int compareTo(Treballador o) {
        if (o==null)return 0;
        if (_5_hores < o._5_hores) {
                return -1;
        }
        if (_5_hores > o._5_hores) {
                return 1;
        }
        return 0;
        
    }
    
}
