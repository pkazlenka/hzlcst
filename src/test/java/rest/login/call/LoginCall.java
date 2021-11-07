package rest.login.call;

import rest.login.model.LoginRequest;
import rest.login.model.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginCall {
    @POST("/customers/login")
    public Call<LoginResponse> login(@Body LoginRequest loginRequest);
}
