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
public class Pruebas {
    
    public static void main(String [] args){
    
        TecnicoMantenimiento tecnico = new TecnicoMantenimiento("Deposito", "Juan", "De los pelotes", 45, 23000, 40);
        Informatico informatico = new Informatico("C", "German", "Igolnikov", 15, 56000, 90);
        Gerente gerente = new Gerente("Logistica", "Mihail", "Tupolev", 34, 50000, 60);
        
        Analista analista = new Analista("Junior", "TS", "Nicolas", "Shurmann", 32, 78000, 30);
        Programador programador = new Programador("Full Stack", "JS", "Ciche", "Corte", 54, 22000, 10);
        Operador operador = new Operador(13, "Python", "Jose", "Ayala", 45, 45000, 45);
        
        System.out.println("Sueldo del analista: " + analista.calcularSueldo());
        System.out.println("El operador de la maquina " + operador.getNroMaquina() + " cobra " + operador.calcularSueldo() + " de sueldo");
        System.out.println("El tecnico de mantenimiento tiene como area asignada de trabajo: " + tecnico.getArea());
        System.out.println("El informatico se llama " + informatico.getNombre() + informatico.getApellido());
        System.out.println("El gerente solo trabaja en " + gerente.getDepartamento());
        System.out.println(programador.getNombre() + programador.getApellido() + " sabe programar en " + programador.getLenguajeDominado());
    }
    
}
