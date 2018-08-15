public boolean checkWithdrawalStatus(double amoutToWithdraw) {
    final double temp = getAvailableBalance();

    if(temp > amoutToWithdraw) {
        System.out.println("Aceptado");
        return true;
    }
    else {
        System.out.println("Solo tienes " + temp + " disponible");
        return false;
    }
}

private double getAvailableBalance() {
    return _balance - _pendingCharges;
}
