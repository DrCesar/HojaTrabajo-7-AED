
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Heap {
    
    private PriorityQueue<Nodo> array = new PriorityQueue(new NodoComparator());
    

    /**
     * @return the array
     */
    public PriorityQueue<Nodo> getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(PriorityQueue<Nodo> array) {
        this.array = array;
    }
}
