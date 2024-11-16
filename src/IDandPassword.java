import java.util.HashMap;


public class IDandPassword   {
    String [] NameHash = new String [10];
    String [] PasswordHash = new String [10];


    HashMap<String,String> loginInfo = new HashMap<>();

    public IDandPassword() {
        loginInfo.put("Blessing","1234");
        loginInfo.put("Ahmed","PASSWORD");
        loginInfo.put("Cadi","Password");
        loginInfo.put("Goldy","CyberHell");
        loginInfo.put("","");
    }

    public  HashMap<String,String> getLoginInfo(){
        return loginInfo;
    }

    public void setLoginInfo(String username, String password){
        this.loginInfo.put(username, password);
    }
}
