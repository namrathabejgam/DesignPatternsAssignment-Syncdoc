package FacadePatternSyncDoc;

public class BookRadiologist implements Radiologist {
    @Override
    public void book() {
        System.out.println("You've successfully booked your appointment with the radiologist");}
}
