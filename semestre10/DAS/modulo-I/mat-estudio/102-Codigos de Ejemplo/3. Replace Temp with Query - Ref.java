public boolean checkWithdrawalStatus(double amoutToWithdraw) {
    if(getAvailableBalance() > amoutToWithdraw) {
        System.out.println("Aceptado");
        return true;
    }
    else {
        System.out.println("Solo tienes " + getAvailableBalance() + " disponible");
        return false;
    }
}
   
private double getAvailableBalance() {
    return _balance - _pendingCharges;
}
