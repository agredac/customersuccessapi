package com.ubitslearning.customersuccessapi;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.ubitslearning.customersuccessapi.model.Request;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Hello implements Function<Request, APIGatewayProxyResponseEvent> {

    @Override
    public APIGatewayProxyResponseEvent apply(Request request) {
        APIGatewayProxyResponseEvent responseEvent = new APIGatewayProxyResponseEvent();
        responseEvent.setStatusCode(200);
        responseEvent.setBody("Hello "+ request.getName());

        return  responseEvent;
    }
}
