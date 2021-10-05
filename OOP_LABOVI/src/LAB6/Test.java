package LAB6;

public class Test {
    public static void main(String[] args) {
        // Create object -> name Bonaca
        Boat bonaca = new Boat("Bonaca");
        // add crew members
        bonaca.addCrewMember("Member_1");
        bonaca.addCrewMember("Member_2");
        bonaca.addCrewMember("Member_3");
        bonaca.addCrewMember("Member_4");
        bonaca.addCrewMember("Member_5");
        // list all crew members
        bonaca.listAllMembers();
        System.out.println("-------------------------------------------");
        // print string representation of the object
        System.out.println(bonaca.toString());
    }
}
