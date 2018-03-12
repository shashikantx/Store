package co.wisne.store.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Shashikant on 12-03-2018.
 */

public class ApiService {

    static ApiService apiService;

    static String BASE_API_URL;

    Retrofit retrofit;

    private ApiService(){

    }

    public static ApiInterface getApiService(){

        if(apiService == null){
            apiService = new ApiService();
            apiService.retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_API_URL).build();
        }

        return apiService.retrofit.create(ApiInterface.class);
    }
}
