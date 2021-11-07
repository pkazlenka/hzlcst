package rest.cluster.create.call;

import rest.cluster.create.model.CreateClusterRequest;
import rest.cluster.create.model.CreateClusterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface CreateClusterCall {
    @POST("/cluster")
    public Call<CreateClusterResponse> create(@Body CreateClusterRequest createClusterRequest,
                                              @Header("Authorization") String token);
}
