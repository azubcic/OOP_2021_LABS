package LAB5;

public class Smart_TV extends TV {


        // constructr from the parent
        public Smart_TV(Owner owner) {
                super(owner);
        }


        // playYouTube...
        public void playYouTube() {
                System.out.println(this.getClass().getSimpleName() + " can play youtube ...");
        }

        // override toString

        @Override
        public String toString() {
                return "Smart_TV{" +
                        "id=" + id +
                        ", prs=" + prs +
                        '}';
        }
}