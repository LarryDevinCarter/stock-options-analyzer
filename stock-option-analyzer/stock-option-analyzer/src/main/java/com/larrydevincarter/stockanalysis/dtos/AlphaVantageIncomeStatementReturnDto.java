package com.larrydevincarter.stockanalysis.dtos;

import java.util.List;

public class AlphaVantageIncomeStatementReturnDto {
    public AlphaVantageIncomeStatementReturnDto() {
    }

    public AlphaVantageIncomeStatementReturnDto(String symbol, List<AnnualReport> annualReports, List<QuarterlyReport> quarterlyReports) {
        this.symbol = symbol;
        this.annualReports = annualReports;
        this.quarterlyReports = quarterlyReports;
    }

    private String symbol;
    private List<AnnualReport> annualReports;
    private List<QuarterlyReport> quarterlyReports;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<AnnualReport> getAnnualReports() {
        return annualReports;
    }

    public void setAnnualReports(List<AnnualReport> annualReports) {
        this.annualReports = annualReports;
    }

    public List<QuarterlyReport> getQuarterlyReports() {
        return quarterlyReports;
    }

    public void setQuarterlyReports(List<QuarterlyReport> quarterlyReports) {
        this.quarterlyReports = quarterlyReports;
    }
}
