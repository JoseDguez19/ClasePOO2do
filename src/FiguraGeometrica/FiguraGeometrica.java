/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiguraGeometrica;

/**
 *
 * @author ap550
 */
public class FiguraGeometrica {
    
    private String nombre;
    private int grosorBorde;
    protected int color;
    
    public FiguraGeometrica(String nombre){
    this.nombre=nombre;
    }
    
    public FiguraGeometrica(){
    
    }
    
    
    public void setGrosorBorde (int grosorBorde){
    this.grosorBorde=grosorBorde;
    }
    
    public int getGrosorBorde(){
     return grosorBorde;
    }
    
    public void setNombre(String name){
    this.nombre=name;
     }
    public String getNombre(){
    return nombre;
    }
    
    public void dibujar(){
    
    }
    
}