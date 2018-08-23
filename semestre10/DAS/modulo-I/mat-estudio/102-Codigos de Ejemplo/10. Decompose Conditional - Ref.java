if(largeOrImportant(order)) {
	shipping = discountShippingRate(order);
}
else {
	shipping = normalShippingRate(order);
}

public boolean largeOrImportant(Order order) {
	return order.getCustomer().getStatus().equals("P") || (order.getTotal() > 1000 && order.getWeight() < 500);
}

public double discountShippingRate(Order order) {
	double result = order.getTotal() * 0.05;
	if(result > 100) result = 100;
	return result;
}

public double normalShippingRate(Order order) {
	double result = order.getTotal() * 0.08;
	if(result > 200) result = 200;
	return result;
}
