package co.wisne.store;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.wisne.store.core.Authentication;
import co.wisne.store.viewmodels.LoginActivityViewModel;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Authentication authentication;

    LoginActivityViewModel viewModel;

    @BindView(R.id.login_input_username) EditText Username;
    @BindView(R.id.login_input_password) EditText Password;
    @BindView(R.id.login_button_submit)  Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        viewModel = new LoginActivityViewModel();
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.login_button_submit){

        }

    }
}
