/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class BinaryTree {
    
    private Nodo root;
    
    public void addNodo(int ele,Nodo temp){
        if(temp == null)
            temp = new Nodo(ele, ' ');
        else{
            if(ele >= temp.getEle())
                addNodo(ele,temp.getDer());
            if(ele < temp.getEle())
                addNodo(ele,temp.getIzq());
        }      
    }
    
    public Nodo searchNodo(int ele,Nodo temp){
        if(temp == null)
            return null;
        else
            if(ele == temp.getEle())
                return temp;
            else
                if(ele > temp.getEle())
                    return searchNodo(ele,temp.getDer());
                else
                    return searchNodo(ele,temp.getIzq());    
    }

    /**
     * @return the root
     */
    public Nodo getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    
}
