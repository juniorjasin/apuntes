if(order.getCustomer().getStatus().equals("P") || (order.getTotal() > 1000 && order.getWeight() < 500)) {
	shipping = order.getTotal() * 0.05;
	if(shipping > 100) shipping = 100;
}
else {
	shipping = order.getTotal() * 0.08;
	if(shipping > 200) shipping = 200;
}
