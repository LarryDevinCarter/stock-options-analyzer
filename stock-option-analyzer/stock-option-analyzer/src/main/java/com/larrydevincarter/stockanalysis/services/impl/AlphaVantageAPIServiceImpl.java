package com.larrydevincarter.stockanalysis.services.impl;

import com.larrydevincarter.stockanalysis.dtos.AlphaVantageCompanyOverviewReturnDto;
import com.larrydevincarter.stockanalysis.dtos.AlphaVantageIncomeStatementReturnDto;
import com.larrydevincarter.stockanalysis.services.AlphaVantageAPIService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class AlphaVantageAPIServiceImpl implements AlphaVantageAPIService {
    @Override
    public AlphaVantageCompanyOverviewReturnDto getAlphaVantageCompanyOverviewData(String symbol) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<AlphaVantageCompanyOverviewReturnDto> entity = new HttpEntity<>(headers);

        ResponseEntity<AlphaVantageCompanyOverviewReturnDto> response = new RestTemplate().exchange("https://www.alphavantage.co/query?function=OVERVIEW&symbol=" + symbol + "&apikey=UBE69VEKRS3DTFZE", HttpMethod.GET, entity, AlphaVantageCompanyOverviewReturnDto.class);

        return response.getBody();
    }

    @Override
    public AlphaVantageIncomeStatementReturnDto getAlphaVantageIncomeStatementData(String symbol) {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<Void> entity = new HttpEntity<>(headers);

            ResponseEntity<AlphaVantageIncomeStatementReturnDto> response = new RestTemplate().exchange("https://www.alphavantage.co/query?function=INCOME_STATEMENT&symbol=" + symbol + "&apikey=UBE69VEKRS3DTFZE", HttpMethod.GET, entity, AlphaVantageIncomeStatementReturnDto.class);

            return response.getBody();
    }
}
