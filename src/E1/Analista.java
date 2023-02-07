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
public class Analista extends Informatico{
    protected String nivel; // junior, senior, etc

    public Analista(String nivel, String lenguajeDominado, String nombre, String apellido, int edad, int sueldoPorHora, int horasTrabajadas) {
        super(lenguajeDominado, nombre, apellido, edad, sueldoPorHora, horasTrabajadas);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
