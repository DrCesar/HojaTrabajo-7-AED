/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Nodo {
    
    private int ele;
    private Character letter;
    private Nodo der;
    private Nodo izq;
    
    public Nodo(int ele, Character s){
        this.ele = ele;
        this.letter = s;
        this.der = null;
        this.izq = null;
    }
    
    public Nodo(Nodo n){
        this.ele = n.getEle();
        this.letter = n.getLetter();
        this.der = n.getDer();
        this.izq = n.getIzq();
    }

    /**
     * @return the ele
     */
    public int getEle() {
        return ele;
    }

    /**
     * @param ele the ele to set
     */
    public void setEle(int ele) {
        this.ele = ele;
    }

    /**
     * @return the letter
     */
    public Character getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(Character letter) {
        this.letter = letter;
    }

    /**
     * @return the der
     */
    public Nodo getDer() {
        return der;
    }

    /**
     * @param der the der to set
     */
    public void setDer(Nodo der) {
        this.der = der;
    }

    /**
     * @return the izq
     */
    public Nodo getIzq() {
        return izq;
    }

    /**
     * @param izq the izq to set
     */
    public void setIzq(Nodo izq) {
        this.izq = izq;
    }
    
}
