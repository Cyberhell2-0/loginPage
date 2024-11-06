public class Main {
    public static void main(String[] args) {
        IDandPassword x = new IDandPassword();
        loginPage y = new loginPage(x.getLoginInfo());
    }

}