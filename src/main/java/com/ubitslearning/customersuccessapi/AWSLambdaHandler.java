package com.ubitslearning.customersuccessapi;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.ubitslearning.customersuccessapi.model.Request;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class AWSLambdaHandler extends SpringBootRequestHandler<Request, APIGatewayProxyResponseEvent> {
}
