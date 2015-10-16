/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bizz;

/**
 *
 * @author macbookproretina
 */
public class Bizz {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        bizz(3);
        bizz(2);
        bizz(19);
        bizz(5);
        bizz(9);
    }
    
    public static void bizz(int val){
        if(val%3!=0){
            System.out.println("bizz");
        }else{
            System.out.println(""+val+"est un mutliple de 3");
        }
        
    }
    
}
