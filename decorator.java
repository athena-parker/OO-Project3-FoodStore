class decorator extends roll{
    protected roll decoratedRoll;
    public decorator(roll toDecorate){
        decoratedRoll = toDecorate;
    }
    public void addSauce() {
        if (decoratedRoll.type == "egg") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "spring") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "pastry") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "sausage") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "jelly") {
            decoratedRoll.price += 0.50;
        }
    }
    public void addFilling() {
        if (decoratedRoll.type == "egg") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "spring") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "pastry") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "sausage") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "jelly") {
            decoratedRoll.price += 0.50;
        }
    }
    public void addTopping() {
        if (decoratedRoll.type == "egg") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "spring") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "pastry") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "sausage") {
            decoratedRoll.price += 0.50;
        }
        if (decoratedRoll.type == "jelly") {
            decoratedRoll.price += 0.50;
        }
    }
}