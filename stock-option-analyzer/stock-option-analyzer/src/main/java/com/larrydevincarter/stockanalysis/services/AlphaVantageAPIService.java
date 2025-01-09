package com.larrydevincarter.stockanalysis.services;

import com.larrydevincarter.stockanalysis.dtos.AlphaVantageCompanyOverviewReturnDto;
import com.larrydevincarter.stockanalysis.dtos.AlphaVantageIncomeStatementReturnDto;

public interface AlphaVantageAPIService {

    public AlphaVantageCompanyOverviewReturnDto getAlphaVantageCompanyOverviewData(String symbol);
    public AlphaVantageIncomeStatementReturnDto getAlphaVantageIncomeStatementData(String symbol);
}
