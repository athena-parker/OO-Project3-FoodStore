class decorator extends roll{
    protected roll decoratedRoll;
    public decorator(roll toDecorate){
        decoratedRoll = toDecorate;
    }
    public void addSauce() {
        if (decoratedRoll.type == "egg") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "spring") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "pastry") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "sausage") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "jelly") {
            decoratedRoll.cost += 0.50;
        }
    }
    public void addFilling() {
        if (decoratedRoll.type == "egg") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "spring") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "pastry") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "sausage") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "jelly") {
            decoratedRoll.cost += 0.50;
        }
    }
    public void addTopping() {
        if (decoratedRoll.type == "egg") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "spring") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "pastry") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "sausage") {
            decoratedRoll.cost += 0.50;
        }
        if (decoratedRoll.type == "jelly") {
            decoratedRoll.cost += 0.50;
        }
    }
}