package ar.edu.ubp.das.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

// clase grande (pq resuelve varios problemas y tiene varias variables)
public class Factura {

	private Date fecha;
	private Cliente cliente;
	private LinkedList<Tarifa> tarifas;
	private LinkedList<Entrada> entradas;

	public Factura(Date fecha, Cliente c) {
		this.fecha = fecha;
		this.cliente = new Cliente(c.getApellidoCliente(), c.getNombreCliente(), c.getDocCliente());
		this.tarifas = new LinkedList<Tarifa>();
		this.entradas = new LinkedList<Entrada>();
	}

	public void addTarifa(Tarifa tarifa) {
		this.tarifas.add(tarifa);
	}

	// no se que hacer con este metodo
	public Tarifa getTarifa(String tipoTarifa) {
		for (Tarifa t : this.tarifas) {
			if (t.getTipo().equals(tipoTarifa)) {
				return t;
			}
		}
		return null;
	}

	// aca preguntar isinstanceof
	public void addEntrada(String tipoTarifa, int horaDesde, int horaHasta) {
		Tarifa t = this.getTarifa(tipoTarifa);
		if (t == null)
			return;

		Entrada e = new Entrada();
		e.setTarifa(t);
		e.setHoraDesde(horaDesde);
		e.setHoraHasta(horaHasta);
		e.setCosto(t.getCosto());
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
			// esto me parece que deberia estar en la clase entradas
			System.out.println(e.getClass().getSimpleName() + " " + e.getCosto());
			System.out.println(e.getHoraDesde() + " " + e.getHoraHasta());
		}
		System.out.println("**************************************************************");
		System.out.println("TOTAL A PAGAR: " + totalPagar);
		System.out.println("**************************************************************");
	}

}
