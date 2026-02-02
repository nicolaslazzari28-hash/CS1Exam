public class Plant {
    int numWeeksOld = 1;
    String color = "red";
    boolean isEdible = true;

    public Plant(int numWeeksOld,String color,boolean isEdible){

    }
    public void printInfo(){
        System.out.println("This plant is " +numWeeksOld+ ". It is "+color+". and it is "+isEdible+" that it is edible");
    }
}
