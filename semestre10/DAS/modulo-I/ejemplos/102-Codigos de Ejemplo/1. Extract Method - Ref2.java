public void printInvoice(Order order) {
	printInvoiceHeader();

	printCustomerDetails(order.getCustomer());

	//...
}

public void printInvoiceHeader() {
	System.out.println ("Factura");
	System.out.println ("=================================");
}

public void printCustomerDetails(Customer customer) {
	System.out.println ("Cliente ");
	System.out.println (customer.getName());
}
