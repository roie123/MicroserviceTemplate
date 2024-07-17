package com.roie.f.CONTROLLERS;

import com.roie.f.client.SomeGenericClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feature-name") //TODO change this to the feature name
@RequiredArgsConstructor
public class SomeGenericController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(SomeGenericController.class);

    @Autowired
    private SomeGenericClient someGenericClient;


}
