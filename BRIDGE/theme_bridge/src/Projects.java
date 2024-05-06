public class Projects extends WebPage {

    protected Projects(BridgeTheme bridge) {
        super(bridge);
    }

    @Override
    public void getContent() {
        System.out.println("Projects page in " + bridge.getColor());
    }

}
