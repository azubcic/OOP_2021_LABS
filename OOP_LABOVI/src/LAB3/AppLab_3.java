// OOP LAB 3 1/2 - Antonio Zubcic
package LAB3;

public class AppLab_3 {

    public static void main(String[] args) {
        String[] arr = {"FST", "SND", "TRD", "FRTH", "FFTH"};
        ARR_AUX.arrayInfo(arr);
        Device[] arrDev = {new Device(), new Device(), new Device()};
        ARR_AUX.arrayInfo(arrDev);
        Integer[] intArr = new Integer[5];
        ARR_AUX.arrayInfo(intArr);
    }
}
