class decorator extends roll{
    protected Roll decoratedRoll;
    public decorator(Roll toDecorate){
        decoratedRoll = toDecorate;
    }

    public void addSauce(){
    }
}