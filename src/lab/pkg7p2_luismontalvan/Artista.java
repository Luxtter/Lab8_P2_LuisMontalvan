/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7p2_luismontalvan;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Artista extends Usuario{
    protected String nombre,genero;
    
    
    public Artista() {
        super();
    }

    public Artista(String nombre, String genero, String usuario, String contrasena) {
        super(usuario, contrasena);
        this.nombre = nombre;
        this.genero = genero;
    }
      
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Artista{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
