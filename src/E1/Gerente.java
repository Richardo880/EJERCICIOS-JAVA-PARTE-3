/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author Diego
 */
public class Gerente extends Empleado{
    protected String departamento;

    public Gerente(String departamento, String nombre, String apellido, int edad, int sueldoPorHora, int horasTrabajadas) {
        super(nombre, apellido, edad, sueldoPorHora, horasTrabajadas);
        this.departamento = departamento;
    }
    
    @Override
    public int calcularSueldo() {
        return this.sueldoPorHora * this.horasTrabajadas;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
