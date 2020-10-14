class decorator extends roll{
    public roll decoratedRoll;
    public decorator(roll toDecorate){
        decoratedRoll = toDecorate;
    }
    public void addSauce(int numSauce) {
        if (decoratedRoll.type == "egg") {
            price = decoratedRoll.price + (0.50 * numSauce);
        }
        if (decoratedRoll.type == "spring") {
            price = decoratedRoll.price + (0.25 * numSauce);
        }
        if (decoratedRoll.type == "pastry") {
            price = decoratedRoll.price + (0.75 * numSauce);
        }
        if (decoratedRoll.type == "sausage") {
            price = decoratedRoll.price + (0.10 * numSauce);
        }
        if (decoratedRoll.type == "jelly") {
            price = decoratedRoll.price + (0.60 * numSauce);
        }
    }
    public void addFilling(int numFilling) {
        if (decoratedRoll.type == "egg") {
            price = decoratedRoll.price + (1.00 * numFilling);
        }
        if (decoratedRoll.type == "spring") {
            price = decoratedRoll.price + (1.25 * numFilling);
        }
        if (decoratedRoll.type == "pastry") {
            price = decoratedRoll.price + (1.50 * numFilling);
        }
        if (decoratedRoll.type == "sausage") {
            price = decoratedRoll.price + (1.75 * numFilling);
        }
        if (decoratedRoll.type == "jelly") {
            price = decoratedRoll.price + (1.99 * numFilling);
        }
    }
    public void addTopping(int numToppings) {
        if (decoratedRoll.type == "egg") {
            price = decoratedRoll.price + (2.00 * numToppings);
        }
        if (decoratedRoll.type == "spring") {
            price = decoratedRoll.price + (2.25 * numToppings);
        }
        if (decoratedRoll.type == "pastry") {
            price = decoratedRoll.price + (2.50 * numToppings);
        }
        if (decoratedRoll.type == "sausage") {
            price = decoratedRoll.price + (2.75 * numToppings);
        }
        if (decoratedRoll.type == "jelly") {
            price = decoratedRoll.price + (2.99 * numToppings);
        }
    }
}