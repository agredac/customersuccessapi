package com.ubitslearning.customersuccessapi;

import com.ubitslearning.customersuccessapi.nodel.Request;
import com.ubitslearning.customersuccessapi.nodel.Response;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@Component
public class Hello implements Function<Request, Response> {

    @Override
    public Response apply(Request s) {

        Response response = Response.builder().response("hello class" + s.getName()).build();
        return response;
    }
}
