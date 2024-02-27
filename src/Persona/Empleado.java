/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author ap550
 */
public class Empleado extends Persona{
    
        private String cargo;
    private double salario;
    
    // Constructor
    public Empleado(String nombre, int edad, String cargo, double salario) {
        // Llamada al constructor de la clase base
        super(nombre, edad);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    // Métodos getter y setter para cargo y salario...
    
    // Método para imprimir información sobre el empleado
    public void imprimirInformacionEmpleado() {
        imprimirInformacion(); // Llama al método de la clase base
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
    }
}
