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
public class Outer
{
        private String text = "Outer" ;
        
        public class Inner
        {
            void show()
            {
                System.out.println(text);
            }
        }
}
    