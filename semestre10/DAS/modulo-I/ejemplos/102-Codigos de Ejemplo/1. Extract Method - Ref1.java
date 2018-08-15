public void printInvoice(Order order) {
	printInvoiceHeader();

	//Imprimir datos del cliente
	System.out.println ("Cliente ");
	System.out.println (order.getCustomer().getName());

	//...
}

public void printInvoiceHeader() {
	System.out.println ("Factura");
	System.out.println ("=================================");
}
