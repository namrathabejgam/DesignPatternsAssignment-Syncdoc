package FacadePatternSyncDoc;

public class BookGynecologist implements Gynecologist {
    @Override
    public void book() {
        System.out.println("You've successfully booked your appointment with the gynecologist");}
}
