package com.example.metadataapi.service;

public class MetadataServiceImpl implements MetadataService {

    @Override
    public void registerMetadata(MetadataRegisterCommand metadataRegisterCommand) {

        metadataRegisterCommand.getMetadata();
    }
}
