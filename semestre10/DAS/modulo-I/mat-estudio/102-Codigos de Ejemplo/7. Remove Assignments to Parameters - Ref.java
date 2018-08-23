public void checkStock(OrderItem item, int desired) {
    //�Se puede cumplir con el pedido?
    if(item.getStockUnits() < desired) {
        //Se usa una temporal en l�nea en lugar de asignar al par�metro
        System.out.println("Solo " + item.getStockUnits() + " unidades disponibles");
        
        //Se usa una nueva temporal en lugar de asignar al par�metro
        OrderItem alternate = new OrderItem(item.getAlternateID()); 
        System.out.println("Sugiero " + alternate.getName() + " en su lugar");
        
        ...
    }
    ...
}
