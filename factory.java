class factory { //factory pattern
    factory () {} //FACTORY - create rolls and customers
    public roll createRoll (String rollType) {
        if (rollType == "egg") {
            return new eggroll();
        }
        if (rollType == "spring") {
            return new springroll();
        }
        if (rollType == "pastry") {
            return new pastryroll();
        }
        if (rollType == "sausage") {
            return new sausageroll();
        }
        if (rollType == "jelly") {
            return new jellyroll();
        }
        return null;
    }
    public customer createCustomer (String customerType) {
        bean eventbean = new bean();
        if (customerType == "casual") {
            return new casualcustomer(eventbean);
        }
        if (customerType == "business") {
            return new businesscustomer(eventbean);
        }
        if (customerType == "catering") {
            return new cateringcustomer(eventbean);
        }
        return null;
    }
}