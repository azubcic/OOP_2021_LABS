package LAB7;

public class Test {

    //ispis je drukciji na merlinovoj provjeri! PRIPAZITI
    public static void main(String[] args) {
        // create three objects Boat
        Boat boat1 = new Boat("BT - 1");
        Boat boat2 = new Boat("BT - 2");
        Boat boat3 = new Boat("BT - 3");


        // define arrays for the members
        String[] mbrs1 = {"MEMB-11", "MEMB-12", "MEMB-13"};
        String[] mbrs2 = {"MEMB-21", "MEMB-22", "MEMB-23", "MEMB-24"};
        String[] mbrs3 = {"MEMB-31", "MEMB-32", "MEMB-33", "MEMB-34", "MEMB-35"};
        // add particular array to boat's crew
        boat1.addAllMembers(mbrs1);
        boat2.addAllMembers(mbrs2);
        boat3.addAllMembers(mbrs3);


        // Create object Fleet
        Fleet fleet1 = new Fleet("FST-Fleet");
        // add boats to the fleet
        fleet1.addBoat2Fleet(boat1);
        fleet1.addBoat2Fleet(boat2);
        fleet1.addBoat2Fleet(boat3);


        // list all boats in the fleet
        fleet1.allBoats4Fleet();

        Boat boat4 = new Boat("BT-4");
        boat4.addCrewMember("Captain");
        // check is the boat in the fleet
        fleet1.boatInFleet(boat4);


    }
}
