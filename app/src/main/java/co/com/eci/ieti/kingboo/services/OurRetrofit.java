package co.com.eci.ieti.kingboo.services;

import co.com.eci.ieti.kingboo.RegistrarActivity;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.Call;

public interface OurRetrofit {

    @POST("/newuser")
    Call<RegistrarActivity> PostData(@Body RegistrarActivity registrarActivity);
}
