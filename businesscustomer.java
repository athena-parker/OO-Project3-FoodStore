class businesscustomer extends customer {
    businesscustomer (bean sourcebean) {
        super(sourcebean);
        type = "business";
    }
    public void orderRolls () {
        System.out.println("Business Customer would like 2 of each roll");
    }
}
