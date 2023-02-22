/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.recibocfe.entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ReciboCFE {

    private int id;
    private LocalDate fecha;
    private List<DetalleReciboCFE> detalles;
    private double total;
    private double costoKwh;
    private double iva;
    private double subsidio;
    private double ajuste;
    private double totalPagar;
    private LocalDate periodoInicio;
    private LocalDate periodoFin;

    public ReciboCFE(int id, LocalDate fecha, Cliente cliente, List<DetalleReciboCFE> detalles, double costoKwh, double iva, double subsidio, double ajuste, double totalPagar, LocalDate periodoFin, LocalDate periodoInicio, LocalDate of2, List<Pago> pagos) {
        this.id = id;
        this.fecha = fecha;
        this.detalles = detalles;
        this.costoKwh = costoKwh;
        this.iva = iva;
        this.subsidio = subsidio;
        this.ajuste = ajuste;
        this.totalPagar = totalPagar;
        this.periodoInicio = periodoInicio;
        this.periodoFin = periodoFin;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        double total = 0.0;
        for (DetalleReciboCFE detalle : detalles) {
            total += detalle.getTotalDetalle();
        }
        return total;
    }

    public double getTotal() {
        return total;
    }

    public double getSubtotal() {
        double subtotal = total - subsidio;
        return subtotal;
    }

    public double getDescuento() {
        double descuento = 0.0;
        if (subsidio > 0.0) {
            descuento = subsidio;
        }
        return descuento;
    }

    public double getMontoAnterior() {
        // retorna el monto anterior que debe el cliente a CFE
        return 0.0;
    }

    public double getSaldoAnterior() {
        // retorna el saldo anterior que tiene el cliente con CFE
        return 0.0;
    }

    public double getMontoAPagar() {
        return totalPagar;
    }

    public Date getFechaLimitePago() {
        // retorna la fecha límite de pago del recibo
        return null;
    }

    public double getTotalIVA() {
        double totalIVA = getSubtotal() * iva;
        return totalIVA;
    }

    public double getAjuste() {
        return ajuste;
    }

    public LocalDate getPeriodoInicio() {
        return periodoInicio;
    }

    public LocalDate getPeriodoFin() {
        return periodoFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<DetalleReciboCFE> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleReciboCFE> detalles) {
        this.detalles = detalles;
    }

    public double getCostoKwh() {
        return costoKwh;
    }

    public void setCostoKwh(double costoKwh) {
        this.costoKwh = costoKwh;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getSubsidio() {
        return subsidio;
    }

    public void setSubsidio(double subsidio) {
        this.subsidio = subsidio;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
}
