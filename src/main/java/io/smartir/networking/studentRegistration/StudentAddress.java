package io.smartir.networking.studentRegistration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class StudentAddress implements Serializable {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
}
