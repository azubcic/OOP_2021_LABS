package LAB7;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Class formed of the Boat objects
 *
 * @author sit
 * @version 1.1
 * @see Boat class Boat
 */

public class Fleet {

    // attributes name and data structure <K,V>
    private HashMap<Boat, Integer> fleet = new HashMap<>();
    private String name;

    /**
     * @param name String name of the fleet
     */
    public Fleet(String name) {
        this.name = name;
    }

    /**
     * Method that adds boats to the fleet
     *
     * @param boat Object of the class Boat
     * @see Boat
     */
    public void addBoat2Fleet(Boat boat) {
        fleet.put(boat, boat.getId());
    }


    /**
     * Method that list all boats in the fleet
     */
    public void allBoats4Fleet() {
        fleet.forEach((boat, id) -> {
            System.out.println("------------------------------------");
            System.out.println(boat);
            System.out.println("Number of missions: " + id);
        });
    }

    /**
     * Method that checks if the boat is in the fleet
     *
     * @param boat Object of the class Boat
     */
    public void boatInFleet(Boat boat) {
        if (fleet.containsKey(boat)) {
            System.out.println("<<<<<<<<<<<< " + boat.getId() + " >>>>>>>>>>>>");
            System.out.println(boat);
            System.out.println("Is in the fleet -> " + true);
        } else {
            System.out.println("<<<<<<<<<<<< " + boat.getId() + " >>>>>>>>>>>>");
            System.out.println(boat);
            System.out.println("Is in the fleet -> " + false);
        }
    }
}