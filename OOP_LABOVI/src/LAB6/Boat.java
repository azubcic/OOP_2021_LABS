package LAB6;

import java.util.ArrayList;

/**
 * Class Boat that receives boat name and needs to
 * populate crew members list
 * @author sit
 * @version 1.1
 */


public class Boat {

    private static  int cbt = 10;
    private int id;
    private String boatName;
    private ArrayList<String> crew;


    /**
     * Constructor for the class Boat
     * @param name String name for the boat
     */
    public Boat(String name){
        boatName = name;
        id = cbt;
        cbt++;
        crew = new ArrayList<String>();
    }

    /**
     * Method that ads members to the boat crew list
     * @param member String name of the member
     */
    public void addCrewMember(String member){
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
}
