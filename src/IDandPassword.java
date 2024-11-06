import java.util.HashMap;

public class IDandPassword {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    IDandPassword(){
        logininfo.put("Blessing","1234");
        logininfo.put("Ahmed","PASSWORD");
        logininfo.put("Cadi","Password");
        logininfo.put("Goldy","CyberHell");
        logininfo.put("Akuac","Harry");
    }
    public  HashMap<String,String> getLoginInfo(){
        return logininfo;
    }

}

