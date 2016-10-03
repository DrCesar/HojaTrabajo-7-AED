
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class NodoComparator implements Comparator<Nodo> {

    @Override
    public int compare(Nodo t, Nodo t1) {
        
        if(t.getEle() < t1.getEle())
            return -1;
        if(t.getEle() > t1.getEle())
            return 1;
        return 0;
    }
    
}
