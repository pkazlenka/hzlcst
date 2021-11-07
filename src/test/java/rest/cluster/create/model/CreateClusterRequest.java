package rest.cluster.create.model;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CreateClusterRequest {
    private final List<String> zones = List.of();
    private final List<Integer> cloudProviders = List.of(1);
    private final List<Integer> regions = List.of(1);
    private final String hazelcastVersion = "4.2";
    private final float memory = 0;
    private final boolean tlsEnabled = false;
    private final boolean autoScalingEnabled = false;
    private final boolean hotRestartEnabled = false;
    private final boolean hotBackupEnabled = false;
    private final boolean ipWhitelistEnabled = false;
    private final List<String> clusterIpWhiteList = List.of();
    private final int clusterTypeId = 1;
    private final List<String> mapConfigs = List.of();
    private final List<String> jcacheConfigs = List.of();
    private final List<String> replicatedMapConfigs = List.of();
    private final List<String> queueConfigs = List.of();
    private final List<String> setConfigs = List.of();
    private final List<String> listConfigs = List.of();
    private final List<String> topicConfigs = List.of();
    private final List<String> multiMapConfigs = List.of();
    private final List<String> ringBufferConfigs = List.of();
    private final List<String> reliableTopicConfigs = List.of();
    private String name;
}
