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
public class Matrimonio {
    
    int id;
    int comprometido1Id;
    int comprometido2Id;
    int testigo1Id;
    int juezId;
    String fecha;
    String lugar;

    public Matrimonio() {
    }

    public Matrimonio(int id, int comprometido1Id, int comprometido2Id, int testigo1Id, int juezId, String fecha, String lugar) {
        this.id = id;
        this.comprometido1Id = comprometido1Id;
        this.comprometido2Id = comprometido2Id;
        this.testigo1Id = testigo1Id;
        this.juezId = juezId;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComprometido1Id() {
        return comprometido1Id;
    }

    public void setComprometido1Id(int comprometido1Id) {
        this.comprometido1Id = comprometido1Id;
    }

    public int getComprometido2Id() {
        return comprometido2Id;
    }

    public void setComprometido2Id(int comprometido2Id) {
        this.comprometido2Id = comprometido2Id;
    }

    public int getTestigo1Id() {
        return testigo1Id;
    }

    public void setTestigo1Id(int testigo1Id) {
        this.testigo1Id = testigo1Id;
    }

    public int getJuezId() {
        return juezId;
    }

    public void setJuezId(int juezId) {
        this.juezId = juezId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
    
}
