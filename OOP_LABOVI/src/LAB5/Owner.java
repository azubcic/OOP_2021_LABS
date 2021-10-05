package LAB5;

public class Owner {

    private String name;

    public Owner(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}