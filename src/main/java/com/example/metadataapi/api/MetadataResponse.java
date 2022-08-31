package com.example.metadataapi.api;

import java.util.Map;
import lombok.Data;

@Data
public class MetadataResponse {

    private String id;
    private Map<String, String> metadata;
}
