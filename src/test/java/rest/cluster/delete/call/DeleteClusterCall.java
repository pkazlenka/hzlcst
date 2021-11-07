package rest.cluster.delete.call;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface DeleteClusterCall {
    @DELETE("/cluster/{id}")
    public Call<Void> delete(@Path("id") int id, @Header("Authorization") String token);
}
