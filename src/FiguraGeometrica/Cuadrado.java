/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author ap550
 */
public class Cuadrado extends Figura2D{
    
    public Cuadrado(int lado){ //constructor
    this.lado= lado;
    }
    
    private int lado;

 public int getLado(int lado){
     this.lado = lado;
     return lado;
 }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    private void CambiarTamaño(){
    
    
    }
}
