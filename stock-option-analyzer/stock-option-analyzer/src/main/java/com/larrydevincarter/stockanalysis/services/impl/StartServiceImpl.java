package com.larrydevincarter.stockanalysis.services.impl;

import com.larrydevincarter.stockanalysis.dtos.AlphaVantageCompanyOverviewReturnDto;
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
    public AlphaVantageCompanyOverviewReturnDto start() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<AlphaVantageCompanyOverviewReturnDto> entity = new HttpEntity<>(headers);

        ResponseEntity<AlphaVantageCompanyOverviewReturnDto> response = new RestTemplate().exchange("https://www.alphavantage.co/query?function=OVERVIEW&symbol=TSLA&apikey=UBE69VEKRS3DTFZE", HttpMethod.GET, entity, AlphaVantageCompanyOverviewReturnDto.class);
        AlphaVantageCompanyOverviewReturnDto alphaVantageCompanyOverviewReturnDto = response.getBody();
        System.out.println("Made it here");
        System.out.println(response);

        return alphaVantageCompanyOverviewReturnDto;
    }
}
