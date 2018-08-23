if(largeOrImportant(order)) {
	shipping = discountShippingRate(order);
}
else {
	shipping = normalShippingRate(order);
}
order.addShippingCost(shipping);
