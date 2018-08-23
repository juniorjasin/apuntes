public void checkStock(OrderItem item, int desired) {
     //¿Se puede cumplir con el pedido?
     if(item.getStockUnits() < desired) {
         //Asignando a un parámetro primitivo
         desired = item.getStockUnits();
         System.out.println("Solo " + desired + " unidades disponibles");

         //Asignando a un parámetro de objeto
         item = new OrderItem(item.getAlternateID());
         System.out.println("Sugiero " + item.getName() + " en su lugar");

         // ...
     }
     // ...
}
