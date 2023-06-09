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
public class Banda extends Artista{
    private int integrantes;
    private ArrayList<Cancion> canciones = new ArrayList();
    
    public Banda() {
        super();
    }

    public Banda(int integrantes, String usuario, String contrasena, String nombre, String genero) {
        super(usuario, contrasena, nombre, genero);
        this.integrantes = integrantes;
    }
    
    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
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

    @Override
    public String toString() {
        return super.toString()+"Banda{" + "integrantes=" + integrantes + '}';
    }
    
}
