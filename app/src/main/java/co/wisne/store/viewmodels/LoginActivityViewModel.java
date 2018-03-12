package co.wisne.store.viewmodels;

import android.arch.lifecycle.ViewModel;

import co.wisne.store.LoginActivity;
import co.wisne.store.models.LoginStatus;
import co.wisne.store.network.ApiInterface;
import co.wisne.store.network.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Shashikant on 12-03-2018.
 */

public class LoginActivityViewModel extends ViewModel {

    ApiInterface apiInterface;

    public LoginActivityViewModel(){

        apiInterface = ApiService.getApiService();

    }

    public String UserLogin(String username, String password){

        Call<LoginStatus> status = apiInterface.userLogin(username,password);



        status.enqueue(new Callback<LoginStatus>() {
            @Override
            public void onResponse(Call<LoginStatus> call, Response<LoginStatus> response) {
                              
            }

            @Override
            public void onFailure(Call<LoginStatus> call, Throwable t) {
                return;
            }
        });

        return null;
    }

}
