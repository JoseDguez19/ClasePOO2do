/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author ap550
 */
class Estudiante extends Persona {
    // Atributos adicionales
    private int numeroEstudiante;
    
    // Constructor
    public Estudiante(String nombre, int edad, int numeroEstudiante) {
        // Llamada al constructor de la clase base
        super(nombre, edad);
        this.numeroEstudiante = numeroEstudiante;
    }
    
    // Método para imprimir información sobre el estudiante
    public void imprimirInformacionEstudiante() {
        imprimirInformacion(); // Llama al método de la clase base
        System.out.println("\nNumero de Estudiante: " + numeroEstudiante);
    }
        
}
