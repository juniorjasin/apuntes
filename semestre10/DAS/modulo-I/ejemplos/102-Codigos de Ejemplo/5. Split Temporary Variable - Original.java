double temp = item.getPrice() * item.getQuantity();
System.out.println("Total por línea: " + temp);

temp = order.getTotal() - order.getDiscount();
System.out.println("Cantidad debida: " + temp);
