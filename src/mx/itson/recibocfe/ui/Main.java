/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.recibocfe.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import mx.itson.recibocfe.entidades.Cliente;
import mx.itson.recibocfe.entidades.DetalleReciboCFE;
import mx.itson.recibocfe.entidades.Pago;
import mx.itson.recibocfe.entidades.ReciboCFE;
import mx.itson.recibocfe.enumeradores.LugarPago;
import mx.itson.recibocfe.enumeradores.MetodoPago;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        DetalleReciboCFE detalle1 = new DetalleReciboCFE("Energía eléctrica", 1234, 3.5);
        DetalleReciboCFE detalle2 = new DetalleReciboCFE("Impuesto Federal", 567, 2.0);
        DetalleReciboCFE detalle3 = new DetalleReciboCFE("Impuesto Estatal", 890, 1.5);

        List<DetalleReciboCFE> detalles = new ArrayList<>();
        detalles.add(detalle1);
        detalles.add(detalle2);
        detalles.add(detalle3);

        Cliente cliente = new Cliente(1, "Juan Perez", "juan.perez@example.com", "1234567890");

        Pago pago1 = new Pago( 1200.0, MetodoPago.TARJETA_DEBITO, LugarPago.CAJERO);
        Pago pago2 = new Pago( 800.0, MetodoPago.EFECTIVO, LugarPago.SUCURSAL);

        List<Pago> pagos = new ArrayList<>();
        pagos.add(pago1);
        pagos.add(pago2);

        ReciboCFE recibo = new ReciboCFE(1, LocalDate.of(2022, 2, 1), cliente, detalles, 3000.0, 4.5, 0.16, 0.0, 0.0, 3004.68, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 1, 31), pagos);

        System.out.println("--------------------------------------------------");
System.out.println("               Comisión Federal de Electricidad     ");
System.out.println("--------------------------------------------------");
System.out.println("Periodo de facturación: " + recibo.getPeriodoInicio() + " al " + recibo.getPeriodoFin());
System.out.println("Fecha de emisión: " + recibo.getFecha());
System.out.println("Número de recibo: " + recibo.getId());
System.out.println("Nombre del cliente: " + recibo.getCliente.getNombre());
System.out.println("Número de servicio: " + recibo.getCliente().getNumeroServicio());
System.out.println("Número de medidor: " + recibo.getCliente().getNumeroMedidor());
System.out.println("Dirección del cliente: " + recibo.getCliente().getDireccion().getCalle() + " " + recibo.getCliente().getDireccion().getNumExt() + ", " + recibo.getCliente().getDireccion().getColonia() + ", " + recibo.getCliente().getDireccion().getMunicipio() + ", " + recibo.getCliente().getDireccion().getEstado() + ", CP " + recibo.getCliente().getDireccion().getCp());
System.out.println("Teléfono del cliente: " + recibo.getCliente().getTelefono());
System.out.println("Detalle de consumo:");

for (DetalleReciboCFE detalle : recibo.getDetalles()) {
    System.out.println(" - " + detalle.getConcepto() + " (" + detalle.getConsumo() + " kWh) a $" + detalle.getCostoKwh() + " por kWh: $" + detalle.getTotalDetalle());
}

System.out.println("--------------------------------------------------");
System.out.println("Subtotal: $" + recibo.getSubtotal());
System.out.println("Descuento: $" + recibo.getDescuento());
System.out.println("Total: $" + recibo.getTotal());
System.out.println("Monto anterior: $" + recibo.getMontoAnterior());
System.out.println("Saldo anterior: $" + recibo.getSaldoAnterior());
System.out.println("Monto a pagar: $" + recibo.getMontoAPagar());
System.out.println("Fecha límite de pago: " + recibo.getFechaLimitePago());

System.out.println("--------------------------------------------------");
System.out.println("Detalles de pagos:");

for (Pago pago : recibo.) {
    System.out.println(" - Fecha de pago: " + pago.getFecha());
    System.out.println(" - Monto de pago: $" + pago.getMonto());
    System.out.println(" - Método de pago: " + pago.getMetodoPago());
    System.out.println(" - Lugar de pago: " + pago.getLugarPago());
    System.out.println();
}

System.out.println("--------------------------------------------------");
System.out.println("Gracias por su pago. ¡Hasta la próxima!");
    }}


