/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author ap550
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Métodos getter y setter...
    
    // Método para imprimir información sobre la persona
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
    public static void main(String[] args) {
        // Crear una instancia de Estudiante
        Estudiante estudiante1 = new Estudiante("Ana", 20, 12345);
        
        // Imprimir información sobre el estudiante
        estudiante1.imprimirInformacionEstudiante();
        Empleado empleado1 = new Empleado("Carlos", 35, "Gerente", 50000.0);
        
        // Imprimir información sobre el empleado
        empleado1.imprimirInformacionEmpleado();
    }
}
