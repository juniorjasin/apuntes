double lineTotal = item.getPrice() * item.getQuantity();
System.out.println("Total por l�nea: " + lineTotal);

double amountDue = order.getTotal() - order.getDiscount();
System.out.println("Cantidad debida: " + amountDue);
