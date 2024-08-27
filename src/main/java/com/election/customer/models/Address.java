package com.election.customer.models;


import lombok.Data;

@Data
public class Address {
    private String addressLine;
    private String City;
    private String district;
    private String postalCode;
    private String Country;
}
