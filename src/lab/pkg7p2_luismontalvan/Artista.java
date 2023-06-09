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
public class Artista {
    protected String usuario,contrasena,nombre,genero;
    
    
    public Artista() {
    }

    public Artista(String usuario, String contrasena, String nombre, String genero) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.genero = genero;
        
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Artista{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", nombre=" + nombre + '}';
    }
    
}
