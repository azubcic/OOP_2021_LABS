// OOP LAB 1 2/2 - Antonio Zubcic
package LAB2;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class App {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = createScanner();
        Tablet tabl1 = new Tablet("Samsung");
        // moj test
        Tablet tabl3 = new Tablet("Samsung2");
        tabl1.setScanner(sc);
        tabl1.openWebPage();
        tabl1.openWebPage();
        closeTheScanner();
        try {
            sc = createScanner();
            Tablet tabl2 = new Tablet("Apple");
            tabl2.setScanner(sc);
            tabl2.openWebPage();
        } catch (NoSuchElementException nse) {
            System.out.println("This is expected Exception, because we have only one shared System Input Stream.");
        }
        // moj test
        System.out.println(tabl1.getTabletSerial());;
        System.out.println(tabl3.getTabletSerial());;
    }

    public static void closeTheScanner() {
        System.out.println("Closing the Scanner....");
        System.out.println("There is no intention to use scanner any more in: " + Thread.currentThread().getName());
        sc.close();
    }

    public static Scanner createScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
}

