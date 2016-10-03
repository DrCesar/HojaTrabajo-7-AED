
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Main {
    
    
    public static void main(String[] args) throws UnsupportedEncodingException{
        
        String path = Main.class.getResource("Main.class").getFile();
        path = URLDecoder.decode(path,"UTF-8");
        
        Scanner scan = new Scanner(System.in);
        Huffman huff = new Huffman();
        /*try(BufferedReader buff = new BufferedReader(new FileReader( path.substring(path.indexOf("Main")) + "cadena.txt" ))){
            
            
        }catch(IOException e){
            e.printStackTrace();
        }*/
        System.out.println("Ingrese una cadena de Caracteres.");
        huff.getFrequencies(scan.nextLine());
        huff.createNodos();
        huff.createTree();
        huff.printTree(huff.getTree().getRoot(),"");
        
        System.out.println("Ingrese un mensaje codificado. Ej 100 0101 01010 1010 1 01 1 00 1 01. \n Los codigos van separados por espacio.");
        huff.decodMessage(scan.nextLine());
    
    }
}
