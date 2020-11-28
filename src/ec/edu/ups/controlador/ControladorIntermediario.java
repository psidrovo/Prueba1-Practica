/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

/**
 *
 * @author Paul Idrovo
 */
public class ControladorIntermediario {
    ControladorPersona persona;
    ControladorUsuario usuario;
    ControladorMatrimonio matrimonio;

    public ControladorIntermediario() {
        persona = new ControladorPersona();
        usuario = new ControladorUsuario();
        matrimonio = new ControladorMatrimonio();
    }
    
    
}
