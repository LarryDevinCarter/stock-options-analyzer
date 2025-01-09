package com.larrydevincarter.stockanalysis.services.impl;

import com.larrydevincarter.stockanalysis.dtos.AlphaVantageIncomeStatementReturnDto;
import com.larrydevincarter.stockanalysis.services.StartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class StartServiceImpl implements StartService {

    private String symbol = "TSLA";
    @Override
    public AlphaVantageIncomeStatementReturnDto start(){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<AlphaVantageIncomeStatementReturnDto> response = new RestTemplate().exchange("https://www.alphavantage.co/query?function=INCOME_STATEMENT&symbol=" + symbol + "&apikey=UBE69VEKRS3DTFZE", HttpMethod.GET, entity, AlphaVantageIncomeStatementReturnDto.class);

        return response.getBody();
    }
}
