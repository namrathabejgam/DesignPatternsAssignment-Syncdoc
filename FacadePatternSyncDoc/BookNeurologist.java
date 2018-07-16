package FacadePatternSyncDoc;

public class BookNeurologist implements Neurologist {
    @Override
    public void book() {
        System.out.println("You've successfully booked your appointment with the neurologist");}
}
