public double calculateShipping() {
	if(freeShipping()) return 0;

 	//Calcular el env�o
 	//...
}

public boolean freeShipping() {
 	return (_isEmployee || _isPlatinumCustomer || _isGoldCustomer || _hasCoupon);
}
