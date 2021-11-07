package test;

import config.Config;
import lombok.SneakyThrows;
import model.Cluster;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClusterTest {

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Config.host)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private String token;
    private Cluster cluster;

    @BeforeAll
    void createCluster() {
        cluster = new Cluster();
    }

    @AfterAll
    void deleteCluster() {
        if (cluster.isRunning()) {
            cluster.delete();
        }
    }

    //Tests are done as E2E ones, so we hide REST calls, response codes and so on 'under the hood'
    //If it was expected tests to verify e.g. response codes or values in body, then Cluster class can be
    // removed and it's methods are moved directly to the tests

    @SneakyThrows
    @Test
    void createClusterTest() {
        assertTrue(cluster.isRunning(), "Cluster is expected to be in running state");
    }

    @Test
    void deleteClusterTest() {
        cluster.delete();
        assertFalse(cluster.isRunning(), "Deleted cluster is expected not to be in running state");
    }
}
