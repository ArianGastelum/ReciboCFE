package mx.itson.recibocfe.entidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


// Clase Direccion
public class Direccion {
    private String calle;
    private int numExt;
    private int numInt;
    private String colonia;
    private String municipio;
    private String estado;
    private String cp;
    
    // Constructor
    public Direccion(String calle, int numExt, int numInt, String colonia, String municipio, String estado, String cp) {
        this.calle = calle;
        this.numExt = numExt;
        this.numInt = numInt;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.cp = cp;
    }
    
    // Getters y setters
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumExt() {
        return numExt;
    }
    public void setNumExt(int numExt) {
        this.numExt = numExt;
    }
    public int getNumInt() {
        return numInt;
    }
    public void setNumInt(int numInt) {
        this.numInt = numInt;
    }
    public String getColonia() {
        return colonia;
    }
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getMunicipio() {
        return municipio;
    }
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCp() {
        return cp;
    }
    public void setCp(String cp) {
        this.cp = cp;
    }
}

