package com.sample.service0;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.cloud.client.serviceregistry.Registration;
@RestController
@RequestMapping("/api")
public class HelloController {
    protected static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @ApiOperation(value="获取用户列表", notes="dddddddd")
    @RequestMapping("/hello")
    public String index () {

        ServiceInstance instance = client.getLocalServiceInstance();

        logger.info("/hello,host: {} ,service_id: {}",instance.getHost(),instance.getServiceId());

        return "helleo world";
    }
}
