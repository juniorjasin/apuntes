public void checkStock(OrderItem item, int desired) {
    //¿Se puede cumplir con el pedido?
    if(item.getStockUnits() < desired) {
        //Se usa una temporal en línea en lugar de asignar al parámetro
        System.out.println("Solo " + item.getStockUnits() + " unidades disponibles");
        
        //Se usa una nueva temporal en lugar de asignar al parámetro
        OrderItem alternate = new OrderItem(item.getAlternateID()); 
        System.out.println("Sugiero " + alternate.getName() + " en su lugar");
        
        ...
    }
    ...
}
