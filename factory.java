class factory { //factory pattern
    factory () {}
    public Roll createRoll (String rollType) {
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
    }
    public Customer createCustomer (String customerType) {
        if (customerType == "casual") {
            return new casualcustomer();
        }
        if (customerType == "business") {
            return new businesscustomer();
        }
        if (customerType == "catering") {
            return new cateringcustomer();
        }
    }
}