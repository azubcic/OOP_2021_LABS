package LAB7;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Boat that receives boat name and needs to
 * populate crew members list
 *
 * @author ap
 * @version 1.1
 */


public class Boat {

    // Boat attributes
    // see LAB-06
    private static int cbt = 10;
    private int id;
    private String boatName;
    private ArrayList<String> crew = new ArrayList<>();


    /**
     * Constructor for the class Boat
     *
     * @param name String name for the boat
     */
    public Boat(String name) {
        boatName = name;
        id = cbt;
        cbt += 3;
    }


    /**
     * Method that ads members to the boat crew list
     *
     * @param member String name of the member
     */
    public void addCrewMember(String member) {
        crew.add(member);
    }


    /**
     * Method that lists all crew members
     */
    public void listAllMembers() {
        for (String name : crew) {
            System.out.println("Crew member: " + name);
        }
    }


    @Override
    public String toString() {
        return "Boat{" +
                "id=" + id +
                ", boatName='" + boatName + '\'' +
                ", crew=" + crew +
                '}';
    }

    /**
     * new method
     * Getters for boat's id
     *
     * @return id identification number of the boat
     */
    public int getId() {
        return id;
    }

    /**
     * new method
     * Adds all members from an array to the
     * crew's list
     * @param members String array - crew members names
     */
    public void addAllMembers(String[] members) {
        for (String member : members) {
            crew.add(member);
        }
    }

}