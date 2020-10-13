import java.util.Random;
import java.util.Scanner;
class store extends factory {
    store() {
    }

    public int eggInventory = 30;
    public int jellyInventory = 30;
    public int pastryInventory = 30;
    public int sausageInventory = 30;
    public int springInventory = 30;

    roll[] eggArray = new roll[30]; //make array of each roll to populate w factory
    roll[] jellyArray = new roll[30];
    roll[] sausageArray = new roll[30];
    roll[] springArray = new roll[30];
    roll[] pastryArray = new roll[30];

    //Encapsulation, only the store should have access to the
    //Prices and profits

    //Keep track of the daily Earnings and the overall Earnings of the store
    private double dailyEarnings = 0;
    private double totalEarnings = 0;

    private void printInventory(store roll_store){
        System.out.println("Current Inventory: ");
        System.out.println(roll_store.eggInventory + " Eggrolls");
        System.out.println(roll_store.jellyInventory + " Jellyrolls");
        System.out.println(roll_store.pastryInventory + " Pastryrolls");
        System.out.println(roll_store.sausageInventory + " Sausagerolls");
        System.out.println(roll_store.springInventory + " Springrolls");
    }

    //updates the inventory of each roll
    //prints message when sold out
    public void updateInventory(String roll) {
        if (roll == "Egg") {
            eggInventory -= 1;
            if (eggInventory == 0){
                System.out.println("Sold out of Eggrolls");
            }
        } else if (roll == "Jelly") {
            jellyInventory -= 1;
            if (jellyInventory == 0){
                System.out.println("Sold out of Jellyrolls");
            }
        } else if (roll == "Pastry") {
            pastryInventory -= 1;
            if (pastryInventory == 0){
                System.out.println("Sold out of Pastryrolls");
            }
        } else if (roll == "Sausage") {
            sausageInventory -= 1;
            if (sausageInventory == 0){
                System.out.println("Sold out of Sausagerolls");
            }
        } else if (roll == "Spring") {
            springInventory -= 1;
            if (springInventory == 0){
                System.out.println("Sold out of Springrolls");
            }
        }
    }

    private void callFactory(roll[] array, factory store_Factory, String type){
        for(int i =0; i < 30; i++){
            array[i] = store_Factory.createRoll(type);
        }
    }

    private static void shuffleArray(customer[] array)
    {
        int index;
        customer temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    } //adapted from stackOverflow: https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array

    public static void main(String[] args) {
        boolean open;
        store rollStore = new store();//create store

        factory storeFactory = new factory(); //create roll/customer factory

        //Day 0, factory must supply 30 of each roll
        rollStore.callFactory(rollStore.eggArray, storeFactory, "egg");
        rollStore.callFactory(rollStore.jellyArray, storeFactory, "jelly");
        rollStore.callFactory(rollStore.sausageArray, storeFactory, "sausage");
        rollStore.callFactory(rollStore.springArray, storeFactory, "spring");
        rollStore.callFactory(rollStore.pastryArray, storeFactory, "pastry");
        //populate arrays with 30 of each roll


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

            customer[] dailyCustomers = new customer[(numCas + numBis + numCat)];
            //makes array of all the customers to arrive
            //idk if this is right
            bean eventbean = new bean();
            open = true;
            eventbean.makeEvent("open");
            for(int j = 0; j < numCas; j++){
                dailyCustomers[j] = storeFactory.createCustomer("casual");
                eventbean.addPropertyChangeListener(dailyCustomers[j]);
            }
            for(int j = numCas; j < (numCas+numBis); j++){
                dailyCustomers[j] = storeFactory.createCustomer("business");
                eventbean.addPropertyChangeListener(dailyCustomers[j]);
            }
            for(int j = (numCas+numBis); j < (numCas+numBis+numCat); j++){
                dailyCustomers[j] = storeFactory.createCustomer("catering");
                eventbean.addPropertyChangeListener(dailyCustomers[j]);
            }
            rollStore.shuffleArray(dailyCustomers); //makes customer random

            //At the start of each day, print the day and the number
            //of each roll stocked
            System.out.println("Day "+ i +":");
            rollStore.printInventory(rollStore);
            for(int j = 0; j < (numCas+numBis+numCat); j++){
                dailyCustomers[j].arrive();
                dailyCustomers[j].orderRolls();
                if(rollStore.eggInventory == 0 && rollStore.jellyInventory == 0 && rollStore.sausageInventory == 0 && rollStore.pastryInventory == 0 && rollStore.springInventory == 0) {
                    open = false;
                    eventbean.makeEvent("closed");
                }
            }
            open = false;
            eventbean.makeEvent("closed");

        }


    }
}
