/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Usuario;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Paul Idrovo
 */
public class ControladorPersona {

    private RandomAccessFile archivo;
    private int tamanioRegistro;

    /**
     * Estructura del archivo Persona.
     *
     * private int id (4bytes) private String cedula (10 bytes) + 2 extras
     * private String nombre (45 bytes) + 2 extras private String apellido (45
     * bytes) + 2 extras private String direccion (45 bytes) + 2 extras private
     * bolean genero (1 byte) private String fechaNacimiento (10 bytes) + 2
     * extras
     *
     * Total 170 bytes
     *
     */
    public ControladorPersona() {
        try {
            archivo = new RandomAccessFile("datos/usuarios.dat", "rw");
            tamanioRegistro = 170;
        } catch (FileNotFoundException ex) {
            System.out.println("Error escritura y lectura [DaoUsuario]");
            System.out.println(ex);
        }
    }

    public void create(Persona persona) {
        try {
            archivo.seek(archivo.length());
            archivo.writeUTF(persona.getCedula());
            archivo.writeUTF(persona.getNombre());
            archivo.writeUTF(persona.getApellido());
            archivo.writeUTF(persona.getDireccion());
            archivo.writeBoolean(persona.isGenero());
            archivo.writeUTF(persona.getFechaNacimiento());
            archivo.writeBoolean(persona.isEstadoCivil());
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [create DaoUsuario]");
            System.out.println(ex);
        }
    }

    public Persona readId(int id) {
        Persona persona = new Persona();
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                persona.setId(archivo.readInt());
                if (persona.getId() == id) {
                    persona.setCedula(archivo.readUTF());
                    persona.setNombre(archivo.readUTF());
                    persona.setApellido(archivo.readUTF());
                    persona.setDireccion(archivo.readUTF());
                    persona.setGenero(archivo.readBoolean());
                    persona.setFechaNacimiento(archivo.readUTF());
                    persona.setEstadoCivil(archivo.readBoolean());
                    return persona;
                }
                salto += tamanioRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [read DAOUsuario]");
        }
        return null;
    }

    public void update(Persona persona) {
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                int idLectura = archivo.readInt();
                if (persona.getId() == idLectura) {
                    archivo.writeUTF(persona.getCedula());
                    archivo.writeUTF(persona.getNombre());
                    archivo.writeUTF(persona.getApellido());
                    archivo.writeUTF(persona.getDireccion());
                    archivo.writeBoolean(persona.isGenero());
                    archivo.writeUTF(persona.getFechaNacimiento());
                    archivo.writeBoolean(persona.isEstadoCivil());
                    break;
                }
                salto += tamanioRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [update DAOUsuario]");
        }
    }

    public Persona buscarCedula(String cedula) {
        Persona persona = new Persona();
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                persona.setId(archivo.readInt());
                persona.setCedula(archivo.readUTF());
                if (persona.getCedula().equals(cedula)) {
                    persona.setNombre(archivo.readUTF());
                    persona.setApellido(archivo.readUTF());
                    persona.setDireccion(archivo.readUTF());
                    persona.setGenero(archivo.readBoolean());
                    persona.setFechaNacimiento(archivo.readUTF());
                    persona.setEstadoCivil(archivo.readBoolean());
                    return persona;
                }
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [buscarCedula DAOUsuario]");
        }
        return null;
    }
}
