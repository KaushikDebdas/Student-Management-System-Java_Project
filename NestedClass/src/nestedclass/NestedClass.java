/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclass;

/**
 *
 * @author KAUSHIK
 */
public class NestedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
    
}
