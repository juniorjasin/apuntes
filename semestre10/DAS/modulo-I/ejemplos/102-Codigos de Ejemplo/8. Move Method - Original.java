public class Customer {

    private String name;

    ...
    
    public void printInvoice(Order order) {
        //Imprimir encabezado de la factura
        System.out.println("Invoice: " + order.getOrderID());
        System.out.println("Date: " + order.getDate().toString());
        
        //Imprimir datos del cliente
        System.out.println("Customer: ");
        System.out.println(this.getName());

        Address address = order.getAddress();
        System.out.println(" " + address.getStreet());
        System.out.println(" " + address.getCity());
        System.out.println(" " + address.getState());
        System.out.println(" " + address.getZip());
        
        System.out.println("Order Items:");
        Item[] items = order.getItems();
        for(int i = 0; i < items.length; i ++) {
            System.out.println("* Name: " + items[i].getName());
            System.out.println("* ID: " + items[i].getId());
            System.out.println("* Quantity: " + items[i].getQuantity());
            System.out.println("* Price: " + items[i].getPrice());
        }
    }
    
    ...
    
}
