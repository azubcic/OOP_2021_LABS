// OOP LAB 3 2/3 - Antonio Zubcic

package LAB3;

public class ARR_AUX {

    public static <T> void arrayInfo(T[] array) {
        // pozvati pomoćnu metodu u uvjetnom izrazu
        if (isAllNull(array)) {
            System.out.println("Class of an array: " + array.getClass().getSimpleName());
            System.out.println("The array is empty!");
        } else {
            System.out.println("Class info of the input array: " + array.getClass().getSimpleName());
            System.out.println("Number of elements in an array: " + array.length);
            System.out.println("-----------------------------------------------");
            for (T el : array) {
                System.out.println("Element - " + el);
            }
        }

    }

    private static <T> boolean isAllNull(T[] array) {
        for (T element : array) {
            if (element != null) {
                return false;
            }
        }
        return true;
    }

}
