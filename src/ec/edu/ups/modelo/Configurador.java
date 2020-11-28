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
public class Configurador {

    private int id;
    private static Configurador miconfigurador;

    public static synchronized Configurador getConfigurador(int id) {

        if (miconfigurador == null) {

            miconfigurador = new Configurador(id);
        }
        return miconfigurador;
    }

    private Configurador(int id) {

        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
