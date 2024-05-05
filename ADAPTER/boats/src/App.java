public class App {
    public static void main(String[] args) throws Exception {
        Captain captain = new Captain(new RowingBoat());
        captain.row();

        Captain captain2 = new Captain(new FishingBoatAdapter());
        captain2.row();
    }
}
