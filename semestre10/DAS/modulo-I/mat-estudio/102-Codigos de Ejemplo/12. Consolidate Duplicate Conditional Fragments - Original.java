if(largeOrImportant(order)) {
	shipping = discountShippingRate(order);
	order.addShippingCost(shipping);
}
else {
	shipping = normalShippingRate(order);
	order.addShippingCost(shipping);
}