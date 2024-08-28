package com.election.customer.models;

import lombok.Data;

import java.io.Serializable;

@Data
public class CandidateRequest implements Serializable {
    private Candidates candidates;


}
