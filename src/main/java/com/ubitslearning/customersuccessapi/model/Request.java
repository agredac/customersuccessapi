package com.ubitslearning.customersuccessapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Request {

    private String name;
}
