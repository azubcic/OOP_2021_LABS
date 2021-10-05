// OOP LAB 1 - Antonio Zubcic
package LAB1;

import java.util.Scanner;

public class AppClient {

    public static Float granica = 100.45f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite jedan realni broj - float: \n");
        Float inpt = sc.nextFloat();
        if (numDec(inpt)) {
            System.out.println("Unos je Float tipa....");
            if (inpt > granica) {
                System.out.println(inpt + " je veći od postavljene granice -> " + granica);
            } else {
                System.out.println(inpt + " je manji ili jednak od postavljene granice -> " + granica);
            }
        } else {
            System.out.println("Unesena je cjelobrojna vrijednost!");
        }

    }

    static boolean numDec(Float input) {
        String num = String.valueOf(input);
        num = num.substring(num.indexOf(".") + 1);
        if (Integer.parseInt(num) == 0) {
            return false;
        } else {
            return true;
        }
    }
}