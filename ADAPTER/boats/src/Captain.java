public class Captain {
    private final Boat boat;

    public Captain(Boat boat) {
        this.boat = boat;
    }

    public void row() {
        boat.row();
    }

}
