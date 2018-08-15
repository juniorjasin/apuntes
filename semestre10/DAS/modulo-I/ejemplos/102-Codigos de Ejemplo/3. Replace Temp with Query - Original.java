public boolean checkWithdrawalStatus(double amoutToWithdraw) {
    //Crear temporal
    double availableBalance = _balance - _pendingCharges;

    //Usa temporal
    if(availableBalance > amoutToWithdraw) {
        System.out.println("Aceptado");
        return true;
    }
    else {
        System.out.println("Solo tienes " + availableBalance + " disponible");
        return false;
    }
}
