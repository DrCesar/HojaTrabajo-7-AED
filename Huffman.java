
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Huffman {
    
    private ArrayList<Integer> frec = new ArrayList();
    private ArrayList<Character> letras = new ArrayList();
    private BinaryTree tree = new BinaryTree();
    private Heap heap = new Heap();
    private ArrayList<String> message = new ArrayList();
    
    public void getFrequencies(String s){
        s = s.toLowerCase();
        for(int i = 0; i< s.length(); i ++){
            int cont = 0;
            int index = 0;
            char c = s.charAt(i);
            
            if(!letras.contains(c)){
                while(s.indexOf(c, index)!= -1){
                    cont++;
                    index = s.indexOf(c, index)+1;
                }
            
                letras.add(c);
                frec.add(cont);
            }
        }
    }
    
    
    public void createNodos(){
        
        for(int i = 0; i < frec.size(); i++){
            Nodo temp = new Nodo(frec.get(i),letras.get(i));
            heap.getArray().add(temp);
        }
        System.out.println();
    }
    
    public void createTree(){
        while(!heap.getArray().isEmpty()){
            Nodo temp = heap.getArray().remove();
            if((tree.getRoot() == null || tree.getRoot().getEle()> temp.getEle()) && !heap.getArray().isEmpty()){
               
                Nodo temp2 = heap.getArray().remove(); 
                Nodo temp3 = new Nodo(temp.getEle()+temp2.getEle(),' ');
                temp3.setDer(temp2);
                temp3.setIzq(temp);

                if(tree.getRoot() == null){
                    tree.setRoot(new Nodo(temp3));
                }else{
                    
                    Nodo tempRoot = new Nodo(tree.getRoot());
                    /*if(temp3.getEle()>tree.getRoot().getEle()){
                        tree.getRoot().setDer(temp3);
                        tree.getRoot().setIzq(tempRoot);
                    }else{
                       tree.getRoot().setDer(tempRoot);
                       tree.getRoot().setIzq(temp3); 
                    }*/
                    tree.getRoot().setDer(tempRoot);
                    tree.getRoot().setIzq(temp3);
                }
            }else{
                Nodo tempRoot = new Nodo(tree.getRoot().getEle(), tree.getRoot().getLetter());
                tempRoot.setDer(tree.getRoot().getDer());
                tempRoot.setIzq(tree.getRoot().getIzq());
                /*if(temp.getEle()>tree.getRoot().getEle()){
                    tree.getRoot().setDer(temp);
                    tree.getRoot().setIzq(tempRoot);
                }else{
                   tree.getRoot().setDer(tempRoot);
                   tree.getRoot().setIzq(temp); 
                }*/
                tree.getRoot().setDer(tempRoot);
                tree.getRoot().setIzq(temp); 
            }
        }
        System.out.println();
    }
    
    
    public void printTree(Nodo n,String s){
        if(n.getDer() == null && n.getIzq() == null)
            System.out.println(n.getLetter()+"  "+ n.getEle()+" "+s);
        else{
            if(n.getIzq() != null)
                printTree(n.getIzq(),s+"0");
            if(n.getDer() != null)
                printTree(n.getDer(),s+"1");
        }
        
    }
    
    public void decodMessage(String s){
        int index = 0;
        if(s.charAt(s.length()-1) != ' ')
            s = s + " ";
        if(s.charAt(0) != ' ')
            s = " "+s;
        while(index != -1 && index < s.length()-2){
            int pro = s.indexOf(" ", index+1)-index;
            message.add(s.substring(index+1, s.indexOf(" ", index+1)));
            index = s.indexOf(" ", index+1);
        }
        System.out.println("El mensaje es :");
        for(int i = 0; i < message.size(); i++)
            printMessage(tree.getRoot(),message.get(i));
        System.out.println();
    }
    
    public void printMessage(Nodo n,String s){
        char c;
        if(s.length() > 0){
            c = s.charAt(0);
            if(c == '0')
                printMessage(n.getIzq(),s.substring(1));
            if(c == '1')
                printMessage(n.getDer(),s.substring(1));
        }else{
            if(n.getDer() != null || n.getIzq() != null)
                System.out.println("Codigo Incorrecto");
            else
                System.out.print(n.getLetter());
        }     
    }
    
    public BinaryTree getTree(){
        return this.tree;
    }
}
