package com.example.metadataapi.api.validation;

import org.springframework.validation.BindingResult;

public interface ApiParameterValidator<T> {

    void validate(T request, BindingResult bindingResult);

}
