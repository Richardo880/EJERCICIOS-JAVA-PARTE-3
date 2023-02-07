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
public class Programador extends Informatico{
    
    protected String area; // backend, frontend, etc

    public Programador(String area, String lenguajeDominado, String nombre, String apellido, int edad, int sueldoPorHora, int horasTrabajadas) {
        super(lenguajeDominado, nombre, apellido, edad, sueldoPorHora, horasTrabajadas);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
}
