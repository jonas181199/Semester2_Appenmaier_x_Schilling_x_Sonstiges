package Sonstiges.Semester1.JavaBank;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FrontOffice {

    public static void main(String[] args) {
        BackOffice backoffice = new BackOffice();

        System.out.println();

        String currentDate = new SimpleDateFormat("dd. MMM yyyy").format(Calendar.getInstance().getTime());
        System.out.println(currentDate + " - ein weiterer Tag in der Bank\n");

        backoffice.createNewOverdraftAccount();
        backoffice.createNewAccount();
        backoffice.getAllAccountStatus();

        backoffice.withdrawCash(250.0, 1L);
        backoffice.getAllAccountStatus();

        backoffice.depositCash(5000.0, 2L);
        backoffice.getAllAccountStatus();

        backoffice.wireTransfer(200, 1, 2);
        backoffice.getAllAccountStatus();

        backoffice.wireTransfer(1000, 1, 2);
        backoffice.getAllAccountStatus();

        backoffice.depositCash(50000000.0, 2L);
        backoffice.getAllAccountStatus();

        backoffice.withdrawCash(6400.0, 1L);
        backoffice.getAllAccountStatus();

        System.out.println("\nFiliale geschlossen.");
    }
}