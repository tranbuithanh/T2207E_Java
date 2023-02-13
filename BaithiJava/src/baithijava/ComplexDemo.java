/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithijava;

/**
 *
 * @author default
 */
public class ComplexDemo {
  public static void main(String[] args) {
    Complex a = new Complex(1, 2);
    Complex b = new Complex
        (4, 5);
    
    System.out.println("Complex number 1: " + a);
    System.out.println("Complex number 2: " + b);
    
    Complex sum = a.add(b);
    System.out.println("Sum of complex numbers: " + sum);
    
    Complex difference = a.subtract(b);
    System.out.println("Difference of complex numbers: " + difference);
    
    Complex product = a.multiply(b);
    System.out.println("Product of complex numbers: " + product);
    
    Complex quotient = a.divide(b);
    System.out.println("Quotient of complex numbers: " + quotient);
    
    a.setRealPart(9);
    a.setImaginaryPart(10);
    System.out.println("Complex number 1 after modification: " + a);
  }
}
