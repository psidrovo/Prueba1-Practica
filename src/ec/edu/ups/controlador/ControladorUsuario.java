/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Paul Idrovo
 */
public class ControladorUsuario {
    private RandomAccessFile archivo;
    private int tamanioRegistro;
    
    public void create(Usuario usuario) {
        try {
            archivo.seek(archivo.length());
            archivo.writeInt(usuario.getJuezId());
            archivo.writeUTF(usuario.getCorreo());
            archivo.writeUTF(usuario.getPassword());
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [create DaoUsuario]");
            System.out.println(ex);
        }
    }

    public Usuario readId(int id) {
        Usuario usuario = new Usuario();
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                usuario.setJuezId(archivo.readInt());
                if (usuario.getJuezId()== id) {
                    return usuario;
                }
                salto += tamanioRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [read DAOUsuario]");
        }
        return null;
    }


    public int validar(String credenciales) {
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                int id = archivo.readInt();
                String validar = archivo.readUTF();
                validar += archivo.readUTF();                
                if (validar.equals(credenciales)) {
                    return id;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [buscarCedula DAOUsuario]");
        }
        return 0;
    }
}
