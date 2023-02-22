/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.recibocfe.entidades;

import java.util.Date;
import mx.itson.recibocfe.enumeradores.LugarPago;
import mx.itson.recibocfe.enumeradores.MetodoPago;

/**
 *
 * @author Arian Gastelum
 */
public class Pago {
    private Date fecha;
    private double monto;
    private MetodoPago metodoPago;
    private LugarPago lugarPago;
    
    public Pago(double monto, MetodoPago metodoPago, LugarPago lugarPago) {
        this.fecha = fecha;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.lugarPago = lugarPago;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public double getMonto() {
        return monto;
    }
    
    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
    
    public LugarPago getLugarPago() {
        return lugarPago;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public void setLugarPago(LugarPago lugarPago) {
        this.lugarPago = lugarPago;
    }
}
