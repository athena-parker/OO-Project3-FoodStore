import java.util.Random;
import java.util.Scanner;
class store extends factory {
    store() {
    }
    Boolean open = true;

    public int eggInventory = 30;
    public int jellyInventory = 30;
    public int pastryInventory = 30;
    public int sausageInventory = 30;
    public int springInventory = 30;

    //Encapsulation, only the store should have access to the
    //Prices and profits
    private double eggPrice = 4.25; //Keep track of the price of each roll
    private double jellyPrice = 6.00;
    private double pastryPrice = 5.30;
    private double sausagePrice = 6.25;
    private double springPrice = 3.79;

    //Keep track of the daily Earnings and the overall Earnings of the store
    private double dailyEarnings = 0;
    private double totalEarnings = 0;

    public void updateInventory(String roll) {
        if (roll == "Egg") {
            eggInventory -= 1;
            if (eggInventory == 0){
                System.out.println("Sold out of Eggrolls")   ;
            }
        } else if (roll == "Jelly") {
            jellyInventory -= 1;
            if (jellyInventory == 0){
                System.out.println("Sold out of Jellyrolls")   ;
            }
        } else if (roll == "Pastry") {
            pastryInventory -= 1;
            if (pastryInventory == 0){
                System.out.println("Sold out of Pastryrolls")   ;
            }
        } else if (roll == "Sausage") {
            sausageInventory -= 1;
            if (sausageInventory == 0){
                System.out.println("Sold out of Sausagerolls")   ;
            }
        } else if (roll == "Spring") {
            springInventory -= 1;
            if (springInventory == 0){
                System.out.println("Sold out of Springrolls")   ;
            }
        }
    }

    public static void main(String[] args) {
        store rollStore = new store();
        factory storeFactory = new factory(); //create roll/customer factory

        roll[] eggArray = new roll[30]; //make array of each roll to populate w factory
        roll[] jellyArray = new roll[30];
        roll[] sausageArray = new roll[30];
        roll[] springArray = new roll[30];
        roll[] pastryArray = new roll[30];

        //Day 0, factory must supply 30 of each roll
        for(int i =0; i < 30; i++){
            eggArray[i] = storeFactory.createRoll("egg");
            jellyArray[i] = storeFactory.createRoll("jelly");
            sausageArray[i] = storeFactory.createRoll("sausage");
            springArray[i] = storeFactory.createRoll("spring");
            pastryArray[i] = storeFactory.createRoll("pastry");
        } //populate arrays with 30 of each roll

        Scanner sc = new Scanner(System.in); //take user input for # of days
        int days = 0;
        while(days <= 0) {
            System.out.println("Enter number of days");
            days = sc.nextInt();
        }

        for (int i = 1; i <= days; i = i + 1) { //Loop through days

            Random randCas = new Random();
            Random randBis = new Random();
            Random randCat = new Random();

            //1-12 casual customers
            int numCas = randCas.nextInt(12) + 1; //0-11 + 1 makes it 1-12 range
            int numBis = randBis.nextInt(3) + 1; //1-3 Business customers
            int numCat = randCat.nextInt(3) + 1; //1-3 Catering customers

            //At the start of each day, print the day and the number
            //of each roll stocked
            System.out.println("Day "+ i +":");
            System.out.println("Current Inventory: ");
            System.out.println(rollStore.eggInventory + " Eggrolls");
            System.out.println(rollStore.jellyInventory + " Jellyrolls");
            System.out.println(rollStore.pastryInventory + " Pastryrolls");
            System.out.println(rollStore.sausageInventory + " sausagerolls");
            System.out.println(rollStore.springInventory + " springrolls");
        }


    }
}