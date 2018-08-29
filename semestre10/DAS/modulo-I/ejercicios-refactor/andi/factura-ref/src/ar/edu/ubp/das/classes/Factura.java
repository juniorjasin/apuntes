package ar.edu.ubp.das.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Factura {

	private Date fecha;
	private Cliente cliente;
	private LinkedList<Tarifa> tarifas;
	private LinkedList<Entrada> entradas;

	public Factura(Date fecha, Cliente c) {
		this.fecha = fecha;
		this.cliente.setApellidoCliente(c.getApellidoCliente());
		this.cliente.setNombreCliente(c.getNombreCliente());
		this.cliente.setDocCliente(c.getDocCliente());
		this.tarifas = new LinkedList<Tarifa>();
		this.entradas = new LinkedList<Entrada>();
	}

	public void addTarifa(Tarifa f) {
		this.tarifas.add(f);
	}

	public Tarifa getTarifa(String tipoTarifa) {
		for (Tarifa t : this.tarifas) {
			if (t.getTipo().equals(tipoTarifa)) {
				return t;
			}
		}
		return null;
	}

	public void addEntrada(String tipoTarifa, int horaDesde, int horaHasta) {
		Tarifa t = this.getTarifa(tipoTarifa);
		if (t == null)
			return;

		Entrada e = new Entrada();
		e.setTarifa(t);
		e.setHoraDesde(horaDesde);
		e.setHoraHasta(horaHasta);
		e.setCosto(t.costo);
		this.entradas.add(e);
	}

	public void mostrarFactura() {
		imprimirFactura();
		imprimirEntradas();
	}

	public void imprimirFactura() {
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("**************************************************************");
		System.out.println("DATOS DE LA FACTURA");
		System.out.println("**************************************************************");
		System.out.println("Fecha: " + formato.format(this.fecha));
		System.out.println("Cliente: " + this.cliente.getApellidoCliente() + ", " + this.cliente.getNombreCliente()
				+ " - Documento: " + this.cliente.getDocCliente());
		System.out.println();
	}

	public void imprimirEntradas() {
		double totalPagar = 0d;
		System.out.println("**************************************************************");
		System.out.println("ENTRADAS");
		System.out.println("**************************************************************");
		for (Entrada e : this.entradas) {
			totalPagar += e.getCosto();

			System.out.println(e.getTarifa().getTipo() + " " + e.getCosto());
			System.out.println(e.getHoraDesde() + " " + e.getHoraHasta());
		}
		System.out.println("**************************************************************");
		System.out.println("TOTAL A PAGAR: " + totalPagar);
		System.out.println("**************************************************************");
	}

}
