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
public class TecnicoMantenimiento extends Empleado{
    protected String area;

    public TecnicoMantenimiento(String area, String nombre, String apellido, int edad, int sueldoPorHora, int horasTrabajadas) {
        super(nombre, apellido, edad, sueldoPorHora, horasTrabajadas);
        this.area = area;
    }
    
    

    @Override
    public int calcularSueldo() {
        return this.sueldoPorHora * this.horasTrabajadas;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
    
}
