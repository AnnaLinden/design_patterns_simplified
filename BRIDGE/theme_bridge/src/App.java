public class App {
    public static void main(String[] args) throws Exception {
        WebPage aboutUs = new AboutUs(new DarkTheme());
        WebPage projects = new Projects(new LightTheme());
        aboutUs.getContent();
        projects.getContent();
    }
}
