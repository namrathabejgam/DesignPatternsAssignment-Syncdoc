package FacadePatternSyncDoc;

public class BookPsychiatrist implements Psychiatrist {
    @Override
    public void book() {
        System.out.println("You've successfully booked your appointment with the pyschiatrist");
    }
}
