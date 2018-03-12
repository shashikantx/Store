package co.wisne.store.network;

import co.wisne.store.models.LoginStatus;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Shashikant on 12-03-2018.
 */

public interface ApiInterface {

    @FormUrlEncoded
    @POST("alogin")
    Call<LoginStatus> userLogin(@Field("username")String username, @Field("password") String Password);

}
