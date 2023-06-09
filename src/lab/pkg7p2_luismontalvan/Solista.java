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
public class Solista extends Artista{
    private int edad;
    private ArrayList<Cancion> canciones = new ArrayList();

    public Solista() {
        super();
    }

    public Solista(int edad, String usuario, String contrasena, String nombre, String genero) {
        super(usuario, contrasena, nombre, genero);
        this.edad = edad;
    }
    
    public Solista(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return super.toString()+"Solista{" + "edad=" + edad + '}';
    }
    
}
