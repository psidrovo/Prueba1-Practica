/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Matrimonio;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul Idrovo
 */
public class ControladorMatrimonio {

    private RandomAccessFile archivo;
    private int tamanioRegistro;

    public void create(Matrimonio matrimonio) {
        try {
            archivo.seek(archivo.length());
            archivo.writeInt(matrimonio.getComprometido1Id());
            archivo.writeInt(matrimonio.getComprometido2Id());
            archivo.writeInt(matrimonio.getTestigo1Id());
            archivo.writeInt(matrimonio.getTestigo2Id());
            archivo.writeUTF(matrimonio.getFecha());
            archivo.writeUTF(matrimonio.getLugar());
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [create DaoUsuario]");
            System.out.println(ex);
        }
    }

    public List<Matrimonio> todosTelefonosGeneral() {
        List<Matrimonio> lstMatrimonios = new ArrayList<>();
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                Matrimonio mtr = new Matrimonio();
                archivo.seek(salto);
                int id = archivo.readInt();
                if (id != 0) {
                    mtr.setId(archivo.readInt());
                    mtr.setComprometido1Id(archivo.readInt());
                    mtr.setComprometido2Id(archivo.readInt());
                    mtr.setTestigo1Id(archivo.readInt());
                    mtr.setTestigo2Id(archivo.readInt());
                    mtr.setJuezId(archivo.readInt());
                    mtr.setFecha(archivo.readUTF());
                    mtr.setLugar(archivo.readUTF());
                    lstMatrimonios.add(mtr);
                }
                salto += tamanioRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [read DAOUsuario]");
        }
        return lstMatrimonios;
    }

    public void update(int id) {
        int salto = 0;
        try {
            while (salto < archivo.length()) {
                archivo.seek(salto);
                if (id == archivo.readInt()) {
                    archivo.writeInt(0);
                    archivo.writeInt(0);
                    archivo.writeInt(0);
                    archivo.writeInt(0);
                    archivo.writeInt(0);
                    archivo.writeUTF("          ");
                    archivo.writeUTF("                                             ");
                    break;
                }
                salto += tamanioRegistro;
            }
        } catch (IOException ex) {
            System.out.println("Error escritura y lectura [update DAOUsuario]");
        }
    }
}
