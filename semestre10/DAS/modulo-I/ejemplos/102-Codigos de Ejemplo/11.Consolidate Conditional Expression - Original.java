public double calculateShipping() {
	if(_isEmployee) return 0;
	if(_isPlatinumCustomer) return 0;
	if(_isGoldCustomer) return 0;
	if(_hasCoupon) return 0;

	//Calcular el envío
	//...
}