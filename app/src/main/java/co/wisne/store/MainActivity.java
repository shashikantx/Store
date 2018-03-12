package co.wisne.store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.wisne.store.core.Authentication;

public class MainActivity extends AppCompatActivity {

    Authentication authentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        authentication = Authentication.getAuthentication(getApplicationContext());

        if(!authentication.hasApiKey()){
            Intent loginIntent = new Intent(this,LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
