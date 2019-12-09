import abstractfactoryCreational.DoorFittingExpert;
import abstractfactoryCreational.IronDoorFactory;
import abstractfactoryCreational.WoodenDoorFactory;
import builderCreational.Burger;
import builderCreational.BurgerBuilder;
import factorymethodCreational.DevelopmentManager;
import factorymethodCreational.MarketingManager;
import prototypeCreational.Sheep;
import simplefactoryCreational.Door;
import simplefactoryCreational.DoorFactory;
import singletonCreational.President;

public class main {
    public static void main(String[] args) {


    //Simple factory Creational test
        Door door = DoorFactory.makeDoor(100,200);
        System.out.println("Width: " + door.getWidth() +  "\t Height: " + door.getHeight() );

        // factory method Creational test
   DevelopmentManager devManager = new DevelopmentManager();
   devManager.takeInterview();


   MarketingManager marketingManager = new MarketingManager();
   marketingManager.takeInterview();

//Abstract factory
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
//daf -> door abstract factory
        abstractfactoryCreational.Door daf = woodenDoorFactory.makeDoor();
        DoorFittingExpert expertWood = woodenDoorFactory.makeFittingExpert();

        daf.getDescription();
        expertWood.getDescription();

        IronDoorFactory ironFactory = new IronDoorFactory();
        // door iron abstract factory
        abstractfactoryCreational.Door diaf = ironFactory.makeDoor();
        DoorFittingExpert ironExpert = ironFactory.makeFittingExpert();

        diaf.getDescription();
        ironExpert.getDescription();


        //Builder
        BurgerBuilder burger = new BurgerBuilder(14);

        //Prototype
        Sheep original = new Sheep("Jollyy", "Mountain sheep");
        System.out.println(original.getName());
        System.out.println(original.getCategory());

        Sheep clone = original;
        clone.setName("Dolly");
        System.out.println(clone.getName());
        System.out.println(clone.getCategory());


        //Singleton
        President president1 = President.getInstance();
        President president2 = President.getInstance();
        System.out.println(president1 == president2);


    }
}
