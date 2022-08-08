import JsonAnalysis.*;
import com.google.gson.Gson;

public class Extract {
    public static String getMicrosoftAccessToken(String microsoftLoginBody) {
        Gson gson = new Gson();
        MicrosoftLoginObject microsoftLoginObject = gson.fromJson(microsoftLoginBody,MicrosoftLoginObject.class);
        return microsoftLoginObject.getAccess_token();
    }

    public static String getMicrosoftRefreshToken(String microsoftLoginBody) {
        Gson gson = new Gson();
        MicrosoftLoginObject microsoftLoginObject = gson.fromJson(microsoftLoginBody,MicrosoftLoginObject.class);
        return microsoftLoginObject.getRefresh_token();
    }

    public static String getXboxLiveAuthenticationToken(String xboxLiveAuthenticationBody) {
        Gson gson = new Gson();
        XboxLiveAuthenticationObject xboxLiveAuthenticationObject = gson.fromJson(xboxLiveAuthenticationBody,XboxLiveAuthenticationObject.class);
        return xboxLiveAuthenticationObject.getToken();
    }

    public static String getXboxLiveAuthenticationUserHash(String xboxLiveAuthenticationBody) {
        Gson gson = new Gson();
        XboxLiveAuthenticationObject xboxLiveAuthenticationObject = gson.fromJson(xboxLiveAuthenticationBody,XboxLiveAuthenticationObject.class);
        return xboxLiveAuthenticationObject.getDisplayClaims().getXui()[0].getUserHash();
    }

    public static boolean ifMinecraftOwnership(String checkMinecraftOwnershipBody) {
        Gson gson = new Gson();
        CheckMinecraftOwnershipObject checkMinecraftOwnershipObject = gson.fromJson(checkMinecraftOwnershipBody, CheckMinecraftOwnershipObject.class);
        return checkMinecraftOwnershipObject.getItems().length != 0;
    }
    public static MinecraftInformationObject getMinecraftInformationObject(String MinecraftInformationBody) {
        Gson gson = new Gson();
        MinecraftInformationObject MinecraftInformationObject = gson.fromJson(MinecraftInformationBody, MinecraftInformationObject.class);
        return MinecraftInformationObject;
    }

    public static String getMinecraftAuthenticationToken(String MinecraftAuthenticationBody) {
        Gson gson = new Gson();
        MinecraftAuthenticationObject MinecraftAuthenticationObject = gson.fromJson(MinecraftAuthenticationBody, MinecraftAuthenticationObject.class);
        return MinecraftAuthenticationObject.getAccess_token();
    }
}