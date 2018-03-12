package co.wisne.store.core;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/**
 * Created by Shashikant on 12-03-2018.
 */

public class Authentication {

    private static Authentication authentication;

    Context context;

    private Authentication(){

    }

    public static Authentication getAuthentication(Context context){

        if(null == authentication) {
            authentication = new Authentication();
            authentication.context = context;
        }
        return authentication;
    }

    //if user has logged in then we have already saved the api key
    //return true if logged in,
    //else false
    public boolean hasApiKey(){

        SharedPreferences sharedPreferences = context.getSharedPreferences("api",Context.MODE_PRIVATE);
        String key = sharedPreferences.getString("key",null);

        if (TextUtils.isEmpty(key)) {
            return false;
        }
        return true;
    }

}
