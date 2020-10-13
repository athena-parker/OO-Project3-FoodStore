import java.util.Random;
class casualcustomer extends customer {
    casualcustomer (bean sourcebean) {
        super(sourcebean);
        type = "customer";
    }
    public void orderRolls () {
        Random randRoll = new Random();
        Random randNumRoll = new Random();
        int numRollOrder = randNumRoll.nextInt(3)+1; //1-3 rolls
        int whichRoll = randRoll.nextInt(4); //0-4, one for each roll

        for(int i = 0; i < numRollOrder; i++){

        }
        System.out.println("Business Customer would like 2 of each roll");
    }
}