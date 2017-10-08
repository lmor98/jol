/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jol;

/**
 *
 * @author Jose DAW
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;

    public Persona (Persona persona){ //constructor
        nombre = "";
        apellidos = "";
        edad = 0;
        casado = false;
        
    }
    //metodos 
    public void setNombre(String valornombre){
        nombre = "nombre: " + valornombre;
    }
    public void setApellidos(String valorapellidos){
        apellidos = "apellidos: " + valorapellidos;
    }
    public void setEdad(int valoredad){
        edad = valoredad;
    }
    public void fantasma(boolean valorcasado){
    casado = valorcasado;
    }
    
}
