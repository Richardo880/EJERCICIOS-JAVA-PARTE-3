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
public class Operador extends Informatico{
    
    protected int nroMaquina;

    public Operador(int nroMaquina, String lenguajeDominado, String nombre, String apellido, int edad, int sueldoPorHora, int horasTrabajadas) {
        super(lenguajeDominado, nombre, apellido, edad, sueldoPorHora, horasTrabajadas);
        this.nroMaquina = nroMaquina;
    }

    public int getNroMaquina() {
        return nroMaquina;
    }

    public void setNroMaquina(int nroMaquina) {
        this.nroMaquina = nroMaquina;
    }
    
    
    
}
