package com.larrydevincarter.stockanalysis.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.larrydevincarter.stockanalysis.dtos.AlphaVantageIncomeStatementReturnDto;
import com.larrydevincarter.stockanalysis.services.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/start")
public class StartController {

    @Autowired
    private StartService startService;

    @GetMapping
    public AlphaVantageIncomeStatementReturnDto startProgram() throws JsonProcessingException {
        return startService.start();
    }
}
