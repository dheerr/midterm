/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 10/22
 */
public class Arithmetic 
{
//modified by raghav
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         public enum Operation{PLUS,MINUS,TIMES,DIVIDE};
         public enum Value{ONE,TWO};
         
         private final Operation operation;
         private final Value value;
         
         public Arithmetic( Operation o,Value v)
         {
             this.operation = o;
             this.value = v;
         }
         
         public Operation getOperation(){
             return operation;
         }
         public Value getValue(){
             return value;
         }
         
                
                 
                 
    
         
       
       
       ArithmeticBase r= new ArithmeticBase();
        double result = r.calculate(1,2);
        System.out.println("result :" +result); 
    
    }





}

