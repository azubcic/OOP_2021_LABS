// OOP LAB 3 3/3 - Antonio Zubcic
package LAB3;

public class Device {

    private static int serialNum = 1;
    private int id;

    public Device() {
        id = serialNum;
        serialNum += 1;
    }

    @Override
    public String toString() {
        return "Device: " +
                "id= " + id;
    }
}
