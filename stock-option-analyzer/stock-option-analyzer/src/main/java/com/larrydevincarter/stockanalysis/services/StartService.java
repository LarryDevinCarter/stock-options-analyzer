package com.larrydevincarter.stockanalysis.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.larrydevincarter.stockanalysis.dtos.AlphaVantageIncomeStatementReturnDto;

public interface StartService {

    //This method return Company Overview Data
    AlphaVantageIncomeStatementReturnDto start() throws JsonProcessingException;
}
