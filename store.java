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
    public void updateInventory(String roll, int amount) {
        Random randSauce = new Random();
        Random randFilling = new Random();
        Random randToppings = new Random();
        int extraSauce = randSauce.nextInt(4); //0-3
        int extraFilling = randFilling.nextInt(2);
        int extraToppings = randToppings.nextInt(3);
        if (roll == "egg") {
            decorator decoratedEgg = new decorator(eggArray[0]);
            decoratedEgg.addSauce(extraSauce);
            decoratedEgg.addFilling(extraFilling);
            decoratedEgg.addTopping(extraToppings);
            dailyEarnings += (decoratedEgg.price * amount);
            System.out.println(amount + " eggroll: " + decoratedEgg.price * amount + " " + extraSauce + " extra sauce " + extraFilling + " extra filling " + extraToppings + " extra toppings");
            eggInventory -= amount;
            if (eggInventory == 0){
                System.out.println("Sold out of Eggrolls");
            }
        } else if (roll == "jelly") {
            decorator decoratedJelly = new decorator(jellyArray[0]);
            decoratedJelly.addSauce(extraSauce);
            decoratedJelly.addFilling(extraFilling);
            decoratedJelly.addTopping(extraToppings);
            dailyEarnings += (decoratedJelly.price * amount);
            System.out.println(amount + " jellyroll: " + decoratedJelly.price * amount + " " + extraSauce + " extra sauce " + extraFilling + " extra filling " + extraToppings + " extra toppings");
            jellyInventory -= amount;
            if (jellyInventory == 0){
                System.out.println("Sold out of Jellyrolls");
            }
        } else if (roll == "pastry") {
            decorator decoratedPastry = new decorator(pastryArray[0]);
            decoratedPastry.addSauce(extraSauce);
            decoratedPastry.addFilling(extraFilling);
            decoratedPastry.addTopping(extraToppings);
            dailyEarnings += (decoratedPastry.price * amount);
            System.out.println(amount + " pastryroll: " + decoratedPastry.price * amount + " " + extraSauce + " extra sauce " + extraFilling + " extra filling " + extraToppings + " extra toppings");
            pastryInventory -= amount;
            if (pastryInventory == 0){
                System.out.println("Sold out of Pastryrolls");
            }
        } else if (roll == "sausage") {
            decorator decoratedSausage = new decorator(sausageArray[0]);
            decoratedSausage.addSauce(extraSauce);
            decoratedSausage.addFilling(extraFilling);
            decoratedSausage.addTopping(extraToppings);
            dailyEarnings += (decoratedSausage.price * amount);
            System.out.println(amount + " sausageroll: " + decoratedSausage.price * amount + " " + extraSauce + " extra sauce " + extraFilling + " extra filling " + extraToppings + " extra toppings");
            sausageInventory -= amount;
            if (sausageInventory == 0){
                System.out.println("Sold out of Sausagerolls");
            }
        } else if (roll == "spring") {
            decorator decoratedSpring = new decorator(springArray[0]);
            decoratedSpring.addSauce(extraSauce);
            decoratedSpring.addFilling(extraFilling);
            decoratedSpring.addTopping(extraToppings);
            dailyEarnings += (decoratedSpring.price * amount);
            System.out.println(amount + " springroll: " + decoratedSpring.price * amount + " " + extraSauce + " extra sauce " + extraFilling + " extra filling " + extraToppings + " extra toppings");
            springInventory -= amount;
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
            for(int j = 0; j < (numCas+numBis+numCat); j++) {
                dailyCustomers[j].arrive();
                if (dailyCustomers[j].type == "casual") {
                    Random randRoll = new Random();
                    Random randNumRoll = new Random();
                    int numRollsGot = 0;
                    int numRollOrder = randNumRoll.nextInt(3) + 1; //1-3 rolls
                    int whichRoll;
                    while (numRollsGot < numRollOrder && (rollStore.eggInventory > 0 || rollStore.springInventory > 0 || rollStore.jellyInventory > 0 || rollStore.sausageInventory > 0 || rollStore.pastryInventory > 0)) {
                        whichRoll = randRoll.nextInt(5); //0-4, one for each roll
                        if(whichRoll == 0){
                            if (rollStore.eggInventory > 0) {
                                rollStore.updateInventory("egg", 1);
                                numRollsGot++;
                            }
                        }
                        else if(whichRoll == 1){
                            if (rollStore.jellyInventory > 0) {
                                rollStore.updateInventory("jelly", 1);
                                numRollsGot++;
                            }
                        }
                        else if(whichRoll == 2){
                            if (rollStore.pastryInventory > 0) {
                                rollStore.updateInventory("pastry", 1);
                                numRollsGot++;
                            }
                        }
                        else if(whichRoll == 3){
                            if (rollStore.sausageInventory > 0) {
                                rollStore.updateInventory("sausage", 1);
                                numRollsGot++;
                            }
                        }
                        else{
                            if (rollStore.springInventory > 0) {
                                rollStore.updateInventory("spring", 1);
                                numRollsGot++;
                            }
                        }
                    }
                }
                if (dailyCustomers[j].type == "business") {
                    if (rollStore.eggInventory < 2 || rollStore.springInventory < 2 || rollStore.jellyInventory < 2 || rollStore.sausageInventory < 2 || rollStore.pastryInventory < 2) {
                        dailyCustomers[j].leave();
                    } else {
                        rollStore.updateInventory("egg", 2);
                        rollStore.updateInventory("spring", 2);
                        rollStore.updateInventory("pastry", 2);
                        rollStore.updateInventory("sausage", 2);
                        rollStore.updateInventory("jelly", 2);
                    }
                }
                if (dailyCustomers[j].type == "catering") {
                    //orders 5 rolls of 3 different types determined randomly
                    Random randRoll = new Random();
                    int type = -1;
                    int numRolls = 0;
                    while (numRolls < 15) {
                        type = randRoll.nextInt(5); //0-4, one for each roll
                        if (type == 0) {
                            if (rollStore.eggInventory >= 5 && numRolls <= 10) {
                                rollStore.updateInventory("egg", 5);
                                numRolls += 5;
                            }
                            else if (rollStore.eggInventory > 0) {
                                while (rollStore.eggInventory > 0 && numRolls <= 15) {
                                    rollStore.updateInventory("egg", 1);
                                    numRolls += 1;
                                }
                            }
                        }
                        if (type == 1) {
                            if (rollStore.jellyInventory >= 5 && numRolls <= 10) {
                                rollStore.updateInventory("jelly", 5);
                                numRolls += 5;
                            }
                            else if (rollStore.jellyInventory > 0) {
                                while (rollStore.jellyInventory > 0 && numRolls <= 15) {
                                    rollStore.updateInventory("jelly", 1);
                                    numRolls += 1;
                                }
                            }
                        }
                        if (type == 2) {
                            if (rollStore.pastryInventory >= 5 && numRolls <= 10) {
                                rollStore.updateInventory("pastry", 5);
                                numRolls += 5;
                            }
                            else if (rollStore.pastryInventory > 0) {
                                while (rollStore.pastryInventory > 0 && numRolls <= 15) {
                                    rollStore.updateInventory("pastry", 1);
                                    numRolls += 1;
                                }
                            }
                        }
                        if (type == 3) {
                            if (rollStore.sausageInventory >= 5 && numRolls <= 10) {
                                rollStore.updateInventory("sausage", 5);
                                numRolls += 5;
                            }
                            else if (rollStore.sausageInventory > 0) {
                                while (rollStore.sausageInventory > 0 && numRolls <= 15) {
                                    rollStore.updateInventory("sausage", 1);
                                    numRolls += 1;
                                }
                            }

                        }
                        if (type == 4) {
                            if (rollStore.springInventory >= 5 && numRolls <= 10) {
                                rollStore.updateInventory("spring", 5);
                                numRolls += 5;
                            }
                            else if (rollStore.springInventory > 0) {
                                while (rollStore.springInventory > 0 && numRolls <= 15) {
                                    rollStore.updateInventory("spring", 1);
                                    numRolls += 1;
                                }
                            }
                        }
                        if (rollStore.eggInventory == 0 && rollStore.jellyInventory == 0 && rollStore.sausageInventory == 0 && rollStore.pastryInventory == 0 && rollStore.springInventory == 0) {
                            break;
                        }
                    }
                }
                if (rollStore.eggInventory == 0 && rollStore.jellyInventory == 0 && rollStore.sausageInventory == 0 && rollStore.pastryInventory == 0 && rollStore.springInventory == 0) {
                    open = false;
                    eventbean.makeEvent("closed");
                }
            }
            rollStore.printInventory(rollStore);
            open = false;
            eventbean.makeEvent("closed");
            System.out.println("Daily Earnings: " + rollStore.dailyEarnings + "\n");
            rollStore.totalEarnings += rollStore.dailyEarnings;
            rollStore.dailyEarnings = 0;
            if (rollStore.eggInventory == 0) {
                rollStore.eggInventory = 30;
            }
            if (rollStore.pastryInventory ==  0) {
                rollStore.pastryInventory = 30;
            }
            if (rollStore.jellyInventory ==  0) {
                rollStore.jellyInventory = 30;
            }
            if (rollStore.sausageInventory ==  0) {
                rollStore.sausageInventory = 30;
            }
            if (rollStore.springInventory ==  0) {
                rollStore.springInventory = 30;
            }

        }
        System.out.println("Total Earnings: " + rollStore.totalEarnings);


    }
}
