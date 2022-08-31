package com.example.metadataapi.service;

import java.util.Map;
import lombok.Data;

@Data
public class MetadataRegisterCommand {

    private Map<String, String> metadata;
    private String sourceIp;
    private String userAgent;
}
