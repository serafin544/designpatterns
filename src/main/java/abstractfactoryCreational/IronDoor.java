package abstractfactoryCreational;

public class IronDoor implements Door{
    @Override
    public void getDescription() {
        System.out.println("I am an Iron Door");
    }
}
