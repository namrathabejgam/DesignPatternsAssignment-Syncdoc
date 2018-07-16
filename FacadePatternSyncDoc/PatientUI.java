package FacadePatternSyncDoc;

public class PatientUI {
    public static void main(String[] args)
    {
        SyncDoc booking = new SyncDocImpl();
        booking.book();
    }
}
