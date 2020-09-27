package com.mcs.gateway.microservices.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    
    public Long id;

    public String firstName;
    
    public String lastName;

    public Integer age;

}
