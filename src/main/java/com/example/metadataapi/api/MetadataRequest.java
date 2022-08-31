package com.example.metadataapi.api;

import java.util.Map;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class MetadataRequest {

    @Size(max = 2)
    private Map<String, String> metadata;
}
