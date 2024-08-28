package com.election.customer.controllers;

import com.election.customer.models.CandidateRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("election/candidate")
public class CandidateController {

    @PostMapping("registration")
    public String candidateRegistration(@RequestBody CandidateRequest candidateRequest){
        return "registration successful";
    }

}










