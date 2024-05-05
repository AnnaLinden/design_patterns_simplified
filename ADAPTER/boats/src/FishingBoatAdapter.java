public class FishingBoatAdapter implements Boat {

    private final FishingBoat fishingBoat;

    public FishingBoatAdapter() {
        fishingBoat = new FishingBoat();
    }

    @Override
    public void row() {
        fishingBoat.sail();

    }

}
