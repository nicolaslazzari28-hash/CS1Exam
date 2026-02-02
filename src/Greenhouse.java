import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

public class Greenhouse {
    String name = "rose";
    boolean sprinklersOn = true;
    int numberOfFlowers = 10;





    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();
    }

    public Greenhouse(){
        System.out.println("Hello World! Goodluck on your exams!");
        name = "Planting Parameters at the CSG";
        sprinklersOn = true;
        numberOfFlowers = 31;
        System.out.println("Welcome to " +name+ "It is " +sprinklersOn+ " that we are watering plants right now. We have " +numberOfFlowers+ " flowers!");
        numberOfFlowers = 32;
        System.out.println("Welcome to " +name+ "It is " +sprinklersOn+ " that we are watering plants right now. One just bloomed so now we have " +numberOfFlowers+ " flowers!");
        randomReplant();
        veggieOfTheDay();
        countFlowers();
        changeTemperature();

    }

    public void randomReplant(){
        int randomInt = (int)(Math.random()*16);
        System.out.println("We are replanting " +randomInt+ " vegetables today!");
    }



    public void veggieOfTheDay(String veggie){
        System.out.println("today's chosen veggie is" +veggie);
    }
    public void countFlowers() {
        for (int i = 2; i <= 6; i++) ;

        for (int i = 20; i <= 110; i += 30) ;

        for (int i =8; i>=0; i-=1);
    }
    public void changeTemperature(){
        double randomNum = (int)(Math.random()*.9999999);
        if (randomNum<.25){
            System.out.println("The temp has decreased by 2 degrees");
        }
        else if (randomNum<.50){
            System.out.println("The temp has decreased by 1 degrees");
        }
        else if (randomNum<.75){
            System.out.println("The temp has increased by 1 degrees");
        }
        else if (randomNum<.1){
            System.out.println("The temp has increased by 2 degrees");
        }

    }
    Plant kimPlant = new Plant(3,"orange",true);
    public void printInfo(){
        System.out.println("This plant is " +kimPlant.numWeeksOld+ ". It is "+kimPlant.color+". and it is "+kimPlant.isEdible+" that it is edible");
    }
    Plant newPlant = new Plant(4,"red",false);


}



