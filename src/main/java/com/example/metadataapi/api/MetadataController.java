package com.example.metadataapi.api;

import static com.example.metadataapi.api.path.ApiPath.METADATA_PATH;
import static com.example.metadataapi.api.path.ApiPath.VERSION_1;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(VERSION_1)
public class MetadataController {

    @PostMapping(METADATA_PATH)
    public ResponseEntity<MetadataResponse> registerMetadata(
        @Valid @RequestBody MetadataRequest metadataRequest, BindingResult bindingResult,
        HttpServletRequest httpServletRequest) {

        // validate

        // save data

        MetadataResponse response = new MetadataResponse();

        return ResponseEntity.ok(response);
    }

}
