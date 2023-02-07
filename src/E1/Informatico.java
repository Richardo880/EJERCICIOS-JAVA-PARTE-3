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
public class Informatico extends Empleado{

    protected String lenguajeDominado;

    public Informatico(String lenguajeDominado, String nombre, String apellido, int edad, int sueldoPorHora, int horasTrabajadas) {
        super(nombre, apellido, edad, sueldoPorHora, horasTrabajadas);
        this.lenguajeDominado = lenguajeDominado;
    }

    @Override
    public int calcularSueldo() {
        return this.sueldoPorHora * this.horasTrabajadas;
    }

    public String getLenguajeDominado() {
        return lenguajeDominado;
    }

    public void setLenguajeDominado(String lenguajeDominado) {
        this.lenguajeDominado = lenguajeDominado;
    }

    
    
    
    
}
