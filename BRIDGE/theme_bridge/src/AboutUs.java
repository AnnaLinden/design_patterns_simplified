public class AboutUs extends WebPage {

    protected AboutUs(BridgeTheme bridge) {
        super(bridge);
    }

    @Override
    public void getContent() {
        System.out.println("About us page in " + bridge.getColor());
    }

}
