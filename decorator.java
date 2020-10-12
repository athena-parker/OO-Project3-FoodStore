class decorator extends roll{
    protected roll decoratedRoll;
    public decorator(roll toDecorate){
        decoratedRoll = toDecorate;
    }

    public void addSauce(){
    }
}