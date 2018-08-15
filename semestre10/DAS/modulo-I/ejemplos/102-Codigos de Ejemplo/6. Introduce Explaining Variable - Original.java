if(stock.checkStatus(order.getItem()) > order.getQuantity() && 
   order.getTotal() > 99 && 
   order.getCustomer().getBillingAddress().getLinel().
equals(order.getShippingAddress().getLinel())) {
    System.out.println("Aceptado");
    ...
}
else {
    ...
}
