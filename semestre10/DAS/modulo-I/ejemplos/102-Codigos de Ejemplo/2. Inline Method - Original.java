public void calculateAreaOfCircle(double radius) {
    double area = getValueOfPI() * Math.pow(radius, 2);
    System.out.println ("Area: " + area);
}

private double getValueOfPI () {
    return Math.PI;
}
