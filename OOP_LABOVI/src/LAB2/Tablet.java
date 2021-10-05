// OOP LAB 1 1/2 - Antonio Zubcic
package LAB2;


import java.util.Scanner;

public class Tablet {

    private static int serNum = 1010;
    private int tabletSerial;
    private String manufacturer;
    private static final String URLPREFIX = "https://www.";
    private static final String URLPOSTFIX = ".org";
    private Scanner sc;


    public Tablet(String manufacturer) {
        this.manufacturer = manufacturer;
        this.tabletSerial = serNum;
        serNum += 10;
    }

    public int getTabletSerial() {
        return tabletSerial;
    }

    public void setScanner(Scanner sc) {
        this.sc = sc;
    }

    public void openWebPage() {
        // Otvara web stranicu spajanjem imena s prefiksom i sufiksom kako su zadani
        System.out.println("Please enter a web page name:");
        String pageName = sc.next();
                String urlData = URLPREFIX + pageName + URLPOSTFIX;
                System.out.println(this.getClass() + " opens a web page: " + urlData);
    }

}

