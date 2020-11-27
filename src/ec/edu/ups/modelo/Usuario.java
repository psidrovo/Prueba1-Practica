/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Paul Idrovo
 */
public class Usuario {
    
    int juezId;
    String correo;
    String password;

    public Usuario() {
    }

    public Usuario(int juezId, String correo, String password) {
        this.juezId = juezId;
        this.correo = correo;
        this.password = password;
    }

    public int getJuezId() {
        return juezId;
    }

    public void setJuezId(int juezId) {
        this.juezId = juezId;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
