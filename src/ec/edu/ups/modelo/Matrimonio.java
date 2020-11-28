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
    int testigo2Id;
    int juezId;
    String fecha;
    String lugar;

    /**
     * Estructura del archivo Matrimonio.
     *
     * private int id (4bytes) private int comprometido1Id (4bytes) private int
     * comprometido2Id (4bytes) private int testigo1Id (4bytes) private int
     * testigo2Id (4bytes) private int juezId (4bytes) private String fecha (10
     * bytes) + 2 extras private String lugar (45 bytes) + 2 extras
     *
     * Total 83 bytes
     *
     */
    public Matrimonio() {
    }

    public Matrimonio(int id, int comprometido1Id, int comprometido2Id, int testigo1Id, int testigo2Id, int juezId, String fecha, String lugar) {
        this.id = id;
        this.comprometido1Id = comprometido1Id;
        this.comprometido2Id = comprometido2Id;
        this.testigo1Id = testigo1Id;
        this.testigo2Id = testigo2Id;
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

    public int getTestigo2Id() {
        return testigo2Id;
    }

    public void setTestigo2Id(int testigo2Id) {
        this.testigo2Id = testigo2Id;
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
