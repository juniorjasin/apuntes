public class Order {

    private int orderID;
    private Date date;
    private Customer customer;
    private Address address;
    private Item[] items;
    
    ...
    
    public void printInvoice() {
        //Imprimir encabezado de la factura
        System.out.println("Invoice: " + this.getOrderID());
        System.out.println("Date: " + this.getDate().toString());
        
        //Imprimir datos del cliente
        System.out.println("Customer: ");
        System.out.println(this.getCustomer().getName());

        Address address = this.getAddress();
        System.out.println(" " + address.getStreet());
        System.out.println(" " + address.getCity());
        System.out.println(" " + address.getState());
        System.out.println(" " + address.getZip());
        
        System.out.println("Order Items:");
        Item[] items = this.getItems();
        for(int i = 0; i < items.length; i ++) {
            System.out.println("* Name: " + items[i].getName());
            System.out.println("* ID: " + items[i].getId());
            System.out.println("* Quantity: " + items[i].getQuantity());
            System.out.println("* Price: " + items[i].getPrice());
        }
    }
    
    ...
    
}
