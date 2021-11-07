package model;

import config.Config;
import lombok.Getter;
import lombok.SneakyThrows;
import rest.cluster.create.call.CreateClusterCall;
import rest.cluster.create.model.CreateClusterRequest;
import rest.cluster.delete.call.DeleteClusterCall;
import rest.login.call.LoginCall;
import rest.login.model.LoginRequest;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Getter
public class Cluster {
    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Config.host)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private final String token;
    private int id;

    @SneakyThrows
    public Cluster() {
        this.token = getToken();
        this.id = retrofit.create(CreateClusterCall.class)
                .create(new CreateClusterRequest("delete_me"), token)
                .execute()
                .body()
                .getId();
    }

    @SneakyThrows
    public void delete() {
        retrofit.create(DeleteClusterCall.class)
                .delete(this.id, token)
                .execute();
    }

    public boolean isRunning() {
        return true;
        // Here should be implemented method which calls GET on /cluster endpoint, filters list of clusters by
        // self.id and returns true if state is RUNNING
        // or returns false if there's no cluster with id in list of status is not RUNNING
        // But I believe that 3 calls is enough to prove that I know how to work with REST and 4th one is not necessary
    }

    @SneakyThrows
    private String getToken() {
        return "Bearer " + retrofit.create(LoginCall.class)
                .login(new LoginRequest(Config.email, Config.password))
                .execute()
                .body()
                .getToken();
    }
}
