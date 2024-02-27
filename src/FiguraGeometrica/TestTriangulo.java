/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author ap550
 */
public class TestTriangulo {
    
    
    public static void main(String[] args) {
        
        
        Triangulo t = new Triangulo("Triangulo",5,2,10);
        
        //t.setNombre("Triangulo");
        System.out.print("Nombre: " + t.getNombre());
        System.out.print(" Base: "+ t.getBase());
        System.out.println(" Altura: "+t.getAltura());
        System.out.println("GrosorBode: "+t.getGrosorBorde());
      
        Esfera e = new Esfera(5.5);
        e.setNombre("Esfera");
        System.out.print("Nombre: " + e.getNombre());
        System.out.print(" Radio: "+ e.getRadio());
        
       
        
        
    }
    
}