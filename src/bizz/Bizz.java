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
        System.out.println("-----recherche des multiple de 5-----");
        
        multiple(3);
        multiple(2);
        multiple(19);
        multiple(5);
        multiple(9);
    }
    
    public static void multiple(int val){
        int etat=0;
        if(val%3==0){
            
            etat=1;
        }else if(val%5==0){
            System.out.println("buzz");
            etat=2;
        }
        if(etat==1){
            System.out.println(""+val+"est un mutliple de 3");
        }else if(etat==2){
            System.out.println(""+val+"est un mutliple de 5");
        }
        
    }
    
    
}
