double cost = order.getTotal();
float weight = order.getWeight();
String destination = order.getPostalCode();

double shippingCost = calculateShipping(cost, weight, destination);


public double calculateShipping(cost, weight, destination) {
	// ...
}