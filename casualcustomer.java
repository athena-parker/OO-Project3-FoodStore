import java.util.Random;
class casualcustomer extends customer {
    casualcustomer (bean sourcebean) {
        super(sourcebean);
        type = "casual";
    }


    public String[] orderRolls () {
        Random randRoll = new Random();
        Random randNumRoll = new Random();
        int numRollOrder = randNumRoll.nextInt(3)+1; //1-3 rolls
        int whichRoll;

        String[] order = new String[numRollOrder];

        System.out.println("Casual customer requests: ");
        for(int i = 0; i < numRollOrder; i++){
            whichRoll = randRoll.nextInt(5); //0-4, one for each roll
            if(whichRoll == 0){
                System.out.println("1 Eggroll");
                order[i] = "Egg";
            }
            else if(whichRoll == 1){
                System.out.println("1 Jellyroll");
                order[i] = "Jelly";
            }
            else if(whichRoll == 2){
                System.out.println("1 Pastryroll");
                order[i] = "Pastry";
            }
            else if(whichRoll == 3){
                System.out.println("1 Sausageroll");
                order[i] = "Sausage";
            }
            else if(whichRoll == 4){
                System.out.println("1 Springroll");
                order[i] = "Spring";
            }
        }
        return order;
    }
}