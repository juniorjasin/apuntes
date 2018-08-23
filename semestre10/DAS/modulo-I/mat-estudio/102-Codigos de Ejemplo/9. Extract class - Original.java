class Customer {

    private String name;
    private String officeAreaCode;
    private String officeNumber;

    public String getName() {
        return this.name;
    }

    public void setName(String arg) {
        this.name = arg;
    }
    
    public String getTelephoneNumber() {
        return ("(" + this.officeAreaCode + ") " + this.officeNumber);
    }
    
    public String getOfficeAreaCode() {
        return this.officeAreaCode;
    }
    
    public void setOfficeAreaCode(String arg) {
        this.officeAreaCode = arg;
    }
    
    public String getOfficeNumber() {
        return this.officeNumber;
    }
    
    public void setOfficeNumber(String arg) {
        this.officeNumber = arg;
    }

}
