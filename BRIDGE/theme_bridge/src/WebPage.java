public abstract class WebPage {
    protected BridgeTheme bridge;

    protected WebPage(BridgeTheme bridge) {
        this.bridge = bridge;
    }

    public abstract void getContent();

}
