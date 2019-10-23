/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and add object oriented principles satisfy as comment in the code
 * @author sivagamasrinivasan
 * date 10/22
 */
//public class ArithmeticBase 
//{
// public double x,y;
//    double calculate(double x, double y) 
//        {
//        Scanner sc =new Scanner(System.in);
//        System.out.println("enter String");
//        String s= sc.next();
//        switch (s.toUpperCase()) 
//        {
//            case "PLUS":
//                return x + y;
//            case "MINUS":
//                return x - y;
//            case "TIMES":
//                return x * y;
//            case "DIVIDE":
//                return x / y;
//            default:
//                throw new AssertionError("Unknown operations " + this);
//        }
//    }
//   
//}

e
public class ArithmeticBase
{
    public double num1,num2;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String s =sc.nextInt
  
    
    Operator operator = Operator.DIVIDE;
    int result = 0;
    switch (ArithmeticBase())
            {
      case "ADD":
      result = num1 + num2;
      break;
      case "SUBTRACT":
     result = num1 - num2;
      break;
      case "MULTIPLY":
      result = num1 * num2;
      break;
      case "DIVIDE":
            if (num2 != 0) {
                    result = num1 / num2;
            } else {
                    System.out.println("Can't divide by zero.");
            }
      break;
    }
  }
