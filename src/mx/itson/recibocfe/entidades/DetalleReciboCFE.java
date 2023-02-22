/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.recibocfe.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arian Gastelum
 */
public class DetalleReciboCFE {
    private String concepto;  // Concepto del detalle del recibo
    private int consumo;  // Consumo registrado
    private double costoKwh;  // Costo por Kilowatt-hora
    private double subtotal;  // Subtotal del detalle
    private double descuento;  // Descuento del detalle
    private double recargo;  // Recargo del detalle
    private double totalDetalle;  // Total del detalle
    private List<Double> precioKwhMes2022;  // Lista de precios por Kilowatt-hora por mes en 2022
    private List<Double> precioKwhMes2023;  // Lista de precios por Kilowatt-hora por mes en 2023

    // Constructor sin argumentos
    public DetalleReciboCFE(String consumo_de_energía_eléctrica, int par, double par1) {
        this.concepto = "";
        this.consumo = 0;
        this.costoKwh = 0.0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.recargo = 0.0;
        this.totalDetalle = 0.0;
        this.precioKwhMes2022 = new ArrayList<>();
        this.precioKwhMes2023 = new ArrayList<>();
    }

    // Constructor con argumentos
    public DetalleReciboCFE(String concepto, int consumo, double costoKwh, double subtotal, double descuento,
                            double recargo, double totalDetalle, List<Double> precioKwhMes2022,
                            List<Double> precioKwhMes2023) {
        this.concepto = concepto;
        this.consumo = consumo;
        this.costoKwh = costoKwh;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.recargo = recargo;
        this.totalDetalle = totalDetalle;
        this.precioKwhMes2022 = precioKwhMes2022;
        this.precioKwhMes2023 = precioKwhMes2023;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getCostoKwh() {
        return costoKwh;
    }

    public void setCostoKwh(double costoKwh) {
        this.costoKwh = costoKwh;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getTotalDetalle() {
        return totalDetalle;
    }

    public void setTotalDetalle(double totalDetalle) {
        this.totalDetalle = totalDetalle;
    }

    public List<Double> getPrecioKwhMes2022() {
        return precioKwhMes2022;
    }

    public void setPrecioKwhMes2022(List<Double> precioKwhMes2022) {
        this.precioKwhMes2022 = precioKwhMes2022;
    }

    public List<Double> getPrecioKwhMes2023() {
        return precioKwhMes2023;
    }

    public void setPrecioKwhMes2023(List<Double> precioKwhMes2023) {
        this.precioKwhMes2023 = precioKwhMes2023;
    }

}
