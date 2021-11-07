package rest.cluster.create.model;

import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CreateClusterResponse {
    JsonObject mapConfigs;
    JsonObject jcacheConfigs;
    JsonObject listConfigs;
    JsonObject setConfigs;
    JsonObject multiMapConfigs;
    JsonObject replicatedMapConfigs;
    JsonObject queueConfigs;
    JsonObject ringBufferConfigs;
    JsonObject reliableTopicConfigs;
    JsonObject topicConfigs;
    JsonObject ClusterTypeObject;
    JsonObject cloudProviders;
    JsonObject DefaultCloudProviderObject;
    JsonObject regions;
    JsonObject availabilityZones;
    JsonObject kubernetesClusters;
    private int id;
    private int customerId;
    private int memory;
    private int port;
    private String name;
    private String releaseName;
    private String mancenterInternalUrl;
    private int clientCount;
    private int memoryUsage;
    private int creationTime;
    private int startTime;
    private String hazelcastVersion;
    private String managementCenterVersion;
    private String managementCenterAlias;
    private String clusterPassword;
    private String clusterPasswordSalt;
    private String state;
    private String desiredState;
}
