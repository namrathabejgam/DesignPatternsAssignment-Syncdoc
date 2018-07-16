package FacadePatternSyncDoc;

public class BookCardiologist implements Cardiologist {
    @Override
    public void book() {
        System.out.println("You've successfully booked your appointment with the cardiologist");
    }
}
