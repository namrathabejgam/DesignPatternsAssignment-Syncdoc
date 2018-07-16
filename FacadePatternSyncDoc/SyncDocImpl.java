package FacadePatternSyncDoc;
import java.util.Scanner;
public class SyncDocImpl implements SyncDoc{
    public void book()
    {
        System.out.println("Choose the type of doctor you wanna get appointed with:" +
                " (Psychiatrist/Dentist/Cardiologist/Dermatologist/Gynecologist/\nNeurologist/Oncologist/Pediatrician/Plastic Surgeon/Radiologist)");
        String type = new Scanner(System.in).nextLine();

        if(type.equalsIgnoreCase("Psychiatrist"))
        {
            Psychiatrist psychiatrist=new BookPsychiatrist();
            psychiatrist.book();
        }
        else if(type.equalsIgnoreCase("Dentist"))
        {
            Dentist dentist=new BookDentist();
            dentist.book();
        }
        else if(type.equalsIgnoreCase("Cardiologist"))
        {
            Cardiologist cardiologist=new BookCardiologist();
            cardiologist.book();
        }
        else if(type.equalsIgnoreCase("Dermatologist"))
        {
            Dermatologist dermatologist=new BookDermatologist();
            dermatologist.book();
        }
        else if(type.equalsIgnoreCase("Gynecologist"))
        {
            Gynecologist gynecologist=new BookGynecologist();
            gynecologist.book();
        }
        else if(type.equalsIgnoreCase("Neurologist"))
        {
            Neurologist neurologist=new BookNeurologist();
            neurologist.book();
        }
        else if(type.equalsIgnoreCase("Oncologist"))
        {
            Oncologist oncologist=new BookOncologist();
           oncologist.book();
        }
        else if(type.equalsIgnoreCase("Pediatrician"))
        {
            Pediatrician pediatrician=new BookPediatrician();
            pediatrician.book();
        }
        else if(type.equalsIgnoreCase("Plastic Surgeon"))
        {
            PlasticSurgeon plasticSurgeon=new BookPlasticSurgeon();
            plasticSurgeon.book();
        }
        else if(type.equalsIgnoreCase("Radiologist"))
        {
            Radiologist radiologist=new BookRadiologist();
            radiologist.book();
        }
    }
}