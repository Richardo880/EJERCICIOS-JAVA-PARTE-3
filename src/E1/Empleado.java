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
public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected int sueldoPorHora;
    protected int horasTrabajadas;

    public Empleado(String nombre, String apellido, int edad, int sueldoPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldoPorHora() {
        return sueldoPorHora;
    }

    public void setSueldoPorHora(int sueldoPorHora) {
        this.sueldoPorHora = sueldoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    
    public abstract int calcularSueldo();
    
}
