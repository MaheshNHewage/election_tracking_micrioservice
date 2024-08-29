package com.election.customer.service;


import com.election.customer.models.CandidateRequest;
import org.springframework.stereotype.Service;

@Service
public class CandidateService  {
    public String candidateRegistration(CandidateRequest candidateRequest){
        if("SriLanka".equalsIgnoreCase(candidateRequest.getCandidates().getCountyOfBirth())){
            return "you are selected";

        }else {
            return "you are NOT selected";

        }


    }

}
