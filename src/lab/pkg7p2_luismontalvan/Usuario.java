/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg7p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Usuario extends Admin{

    public Usuario() {
        super();
    }

    public Usuario(String usuario, String contrasena) {
        super(usuario, contrasena);
    }

    @Override
    public String toString() {
        return "Usuario{" + '}';
    }
    
}
