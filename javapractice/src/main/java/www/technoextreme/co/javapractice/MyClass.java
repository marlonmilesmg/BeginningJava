package www.technoextreme.co.javapractice;

public class MyClass {

    public static void main(String[] args) {
            System.out.println("2020 We Are Here");

    int myCash;
    myCash = 100;
    int monthlySalary = 150;
    final double ZIM_VAT_RATE = 0.15;

    double COST_OF_CHIPS = 2.50;
    double COST_OF_FISH = 1.50;

    String mainCourse = "Fish";
    String side = "Chips";

    System.out.println("My favourite food is: " + mainCourse + " " + side);
    System.out.println("Initial funds are: " +myCash);

    myCash = 150;

    System.out.println("Now I've got " + myCash);
    System.out.println("Payday. Got " + (myCash + monthlySalary));

    double whatsLeft = myCash - (COST_OF_CHIPS + COST_OF_FISH) *(1+ZIM_VAT_RATE);
    System.out.println("Had a good lunch. Funds depleted to " + whatsLeft);
    }

}
