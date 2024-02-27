/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author ap550
 */
public class Triangulo extends Figura2D{
    
    private int base;
    private int altura;
    
    //constructor
    
    public Triangulo(int base, int altura){
    this.base=base;
    this.altura=altura;
    }
    
    public Triangulo (String nombre, int base, int altura){
    super(nombre);
    this.base=base;
    this.altura=altura;
            
    
    }
    

    
    public int getBase() {
        return base;
    }

   
    public void setBase(int base) {
        this.base = base;
    }

    
    public int getAltura() {
        return altura;
    }

   public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    public void cambiarTam(){
    
    }
    
}