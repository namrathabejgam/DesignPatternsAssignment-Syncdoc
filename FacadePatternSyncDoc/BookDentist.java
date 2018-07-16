package FacadePatternSyncDoc;

public class BookDentist implements Dentist {
    @Override
    public void book() {
        System.out.println("You've successfully booked your appointment with the Dentist");
    }
}

