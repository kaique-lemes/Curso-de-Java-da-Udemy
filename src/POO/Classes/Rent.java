package POO.Classes;

public class Rent {

        private String name;
        private String email;
        private int room;

        public Rent(String name, String email, int room) {
            this.name = name;
            this.email = email;
            this.room = room;
        }

        public int getRoom() {
            return room;
        }

        @Override
        public String toString() {
            return room + ": " + name + ", " + email;
        }



}
