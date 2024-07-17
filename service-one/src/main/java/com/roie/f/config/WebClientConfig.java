package com.roie.f.config;


import com.roie.f.client.SomeGenericClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
@RequiredArgsConstructor
public class WebClientConfig {

    @Autowired
    private LoadBalancedExchangeFilterFunction lbFunction;

    @Bean
    public WebClient someGenericWebClient() {
        return WebClient.builder()
                //TODO change the name of the service to call
                .baseUrl("http://the-name-of-the-service-to-call")
                .filter(lbFunction)
                .build();
    }


    @Bean
    public SomeGenericClient employeeClient() {
        WebClientAdapter webClientAda = WebClientAdapter.create(someGenericWebClient());

        HttpServiceProxyFactory httpServiceProxyFactory
                = HttpServiceProxyFactory.builderFor(webClientAda).build();

        return httpServiceProxyFactory.createClient(SomeGenericClient.class);
    }


}
