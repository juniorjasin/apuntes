final boolean stockAvailable = stock.checkStatus(order.getItem()) > order.getQuantity();

final boolean freeShipping = order.getTotal() > 99;

final boolean addressMatches = order.getCustomer().getBillingAddress().
getLinel().equals(order.getShippingAddress().getLinel());

if(stockAvailable && freeShipping && addressMatches) {
    System.out.println("Aceptado");
    ...
}
else {
    ...
}
