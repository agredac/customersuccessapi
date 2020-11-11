package com.ubitslearning.customersuccessapi;

import com.ubitslearning.customersuccessapi.model.Request;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class Goodbye implements Consumer<Request> {


    @Override
    public void accept(Request request) {

        log.info("goood by: {} ", request.getName());

    }
}
