package FacadePatternSyncDoc;

public class BookOncologist implements Oncologist {
    @Override
    public void book() {
        System.out.println("You've successfully booked your appointment with the oncologist");}
}
