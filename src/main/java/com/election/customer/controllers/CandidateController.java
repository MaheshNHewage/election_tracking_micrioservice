package com.election.customer.controllers;

import com.election.customer.models.CandidateRequest;
import com.election.customer.service.CandidateService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("election/candidate")
public class CandidateController {

    String aa = "20";

    @PostMapping("registration")
    public String candidateRegistration(@RequestBody CandidateRequest candidateRequest){
        CandidateService candidateService = new CandidateService();
     String result =   candidateService.candidateRegistration(candidateRequest);
        return result;
    }

}










