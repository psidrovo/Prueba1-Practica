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
public class Persona {
    int id;
    String cedula;
    String nombre;
    String apellido;
    String direccion;
    boolean genero;
    String fechaNacimiento;
    boolean estadoCivil;
    
    /**
     * Estructura del archivo Persona.
     * 
     * private int id (4bytes)
     * private String cedula (10 bytes) + 2 extras
     * private String nombre (45 bytes) + 2 extras
     * private String apellido (45 bytes) + 2 extras
     * private String direccion (45 bytes) + 2 extras
     * private bolean genero (1 byte)
     * private String fechaNacimiento (10 bytes) + 2 extras
     * private boolean estadoCivil 1 byte
     * 
     * Total 171 bytes
     * 
     */

    public Persona() {
    }

    public Persona(int id, String cedula, String nombre, String apellido, String direccion, boolean genero, String fechaNacimiento, boolean estadoCivil) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
    }

    public Persona(int id, boolean estadoCivil) {
        this.id = id;
        this.estadoCivil = estadoCivil;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
}
