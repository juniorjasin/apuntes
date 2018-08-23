public void printInvoice(Order order) {
	//Imprimir el encabezado de la factura
	System.out.println ("Factura");
	System.out.println ("=================================");

	//Imprimir datos del cliente
	System.out.println ("Cliente ");
	System.out.println (order.getCustomer().getName());

	//...
}
