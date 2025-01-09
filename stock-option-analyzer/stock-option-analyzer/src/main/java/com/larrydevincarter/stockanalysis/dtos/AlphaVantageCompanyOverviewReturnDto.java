package com.larrydevincarter.stockanalysis.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

//TODO - Get Project Lombok working
public class AlphaVantageCompanyOverviewReturnDto {
    public AlphaVantageCompanyOverviewReturnDto() {
    }

    public AlphaVantageCompanyOverviewReturnDto(String symbol, String assetType, String name, String description, String cik, String exchange, String currency, String country, String sector, String industry, String address, String officialSite, String fiscalYearEnd, String latestQuarter, String marketCapitalization, String ebitda, String peRatio, String pegRatio, String bookValue, String dividendPerShare, String dividendYield, String eps, String revenuePerShareTTM, String profitMargin, String operatingMarginTTM, String returnOnAssetsTTM, String returnOnEquityTTM, String revenueTTM, String grossProfitTTM, String dilutedEPSTTM, String quarterlyEarningsGrowthYOY, String quarterlyRevenueGrowthYOY, String analystTargetPrice, String analystRatingStrongBuy, String analystRatingBuy, String analystRatingHold, String analystRatingSell, String analystRatingStrongSell, String trailingPE, String forwardPE, String priceToSalesRatioTTM, String priceToBookRatio, String evToRevenue, String evToEBITDA, String beta, String week52High, String week52Low, String movingAverage50Day, String movingAverage200Day, String sharesOutstanding, String dividendDate, String exDividendDate) {
        this.symbol = symbol;
        this.assetType = assetType;
        this.name = name;
        this.description = description;
        this.cik = cik;
        this.exchange = exchange;
        this.currency = currency;
        this.country = country;
        this.sector = sector;
        this.industry = industry;
        this.address = address;
        this.officialSite = officialSite;
        this.fiscalYearEnd = fiscalYearEnd;
        this.latestQuarter = latestQuarter;
        this.marketCapitalization = marketCapitalization;
        this.ebitda = ebitda;
        this.peRatio = peRatio;
        this.pegRatio = pegRatio;
        this.bookValue = bookValue;
        this.dividendPerShare = dividendPerShare;
        this.dividendYield = dividendYield;
        this.eps = eps;
        this.revenuePerShareTTM = revenuePerShareTTM;
        this.profitMargin = profitMargin;
        this.operatingMarginTTM = operatingMarginTTM;
        this.returnOnAssetsTTM = returnOnAssetsTTM;
        this.returnOnEquityTTM = returnOnEquityTTM;
        this.revenueTTM = revenueTTM;
        this.grossProfitTTM = grossProfitTTM;
        this.dilutedEPSTTM = dilutedEPSTTM;
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
        this.analystTargetPrice = analystTargetPrice;
        this.analystRatingStrongBuy = analystRatingStrongBuy;
        this.analystRatingBuy = analystRatingBuy;
        this.analystRatingHold = analystRatingHold;
        this.analystRatingSell = analystRatingSell;
        this.analystRatingStrongSell = analystRatingStrongSell;
        this.trailingPE = trailingPE;
        this.forwardPE = forwardPE;
        this.priceToSalesRatioTTM = priceToSalesRatioTTM;
        this.priceToBookRatio = priceToBookRatio;
        this.evToRevenue = evToRevenue;
        this.evToEBITDA = evToEBITDA;
        this.beta = beta;
        this.week52High = week52High;
        this.week52Low = week52Low;
        this.movingAverage50Day = movingAverage50Day;
        this.movingAverage200Day = movingAverage200Day;
        this.sharesOutstanding = sharesOutstanding;
        this.dividendDate = dividendDate;
        this.exDividendDate = exDividendDate;
    }

    @JsonProperty("Symbol")
    private String symbol;

    @JsonProperty("AssetType")
    private String assetType;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("CIK")
    private String cik;

    @JsonProperty("Exchange")
    private String exchange;

    @JsonProperty("Currency")
    private String currency;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("Sector")
    private String sector;

    @JsonProperty("Industry")
    private String industry;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("OfficialSite")
    private String officialSite;

    @JsonProperty("FiscalYearEnd")
    private String fiscalYearEnd;

    @JsonProperty("LatestQuarter")
    private String latestQuarter;

    @JsonProperty("MarketCapitalization")
    private String marketCapitalization;

    @JsonProperty("EBITDA")
    private String ebitda;

    @JsonProperty("PERatio")
    private String peRatio;

    @JsonProperty("PEGRatio")
    private String pegRatio;

    @JsonProperty("BookValue")
    private String bookValue;

    @JsonProperty("DividendPerShare")
    private String dividendPerShare;

    @JsonProperty("DividendYield")
    private String dividendYield;

    @JsonProperty("EPS")
    private String eps;

    @JsonProperty("RevenuePerShareTTM")
    private String revenuePerShareTTM;

    @JsonProperty("ProfitMargin")
    private String profitMargin;

    @JsonProperty("OperatingMarginTTM")
    private String operatingMarginTTM;

    @JsonProperty("ReturnOnAssetsTTM")
    private String returnOnAssetsTTM;

    @JsonProperty("ReturnOnEquityTTM")
    private String returnOnEquityTTM;

    @JsonProperty("RevenueTTM")
    private String revenueTTM;

    @JsonProperty("GrossProfitTTM")
    private String grossProfitTTM;

    @JsonProperty("DilutedEPSTTM")
    private String dilutedEPSTTM;

    @JsonProperty("QuarterlyEarningsGrowthYOY")
    private String quarterlyEarningsGrowthYOY;

    @JsonProperty("QuarterlyRevenueGrowthYOY")
    private String quarterlyRevenueGrowthYOY;

    @JsonProperty("AnalystTargetPrice")
    private String analystTargetPrice;

    @JsonProperty("AnalystRatingStrongBuy")
    private String analystRatingStrongBuy;

    @JsonProperty("AnalystRatingBuy")
    private String analystRatingBuy;

    @JsonProperty("AnalystRatingHold")
    private String analystRatingHold;

    @JsonProperty("AnalystRatingSell")
    private String analystRatingSell;

    @JsonProperty("AnalystRatingStrongSell")
    private String analystRatingStrongSell;

    @JsonProperty("TrailingPE")
    private String trailingPE;

    @JsonProperty("ForwardPE")
    private String forwardPE;

    @JsonProperty("PriceToSalesRatioTTM")
    private String priceToSalesRatioTTM;

    @JsonProperty("PriceToBookRatio")
    private String priceToBookRatio;

    @JsonProperty("EVToRevenue")
    private String evToRevenue;

    @JsonProperty("EVToEBITDA")
    private String evToEBITDA;

    @JsonProperty("Beta")
    private String beta;

    @JsonProperty("52WeekHigh")
    private String week52High;

    @JsonProperty("52WeekLow")
    private String week52Low;

    @JsonProperty("50DayMovingAverage")
    private String movingAverage50Day;

    @JsonProperty("200DayMovingAverage")
    private String movingAverage200Day;

    @JsonProperty("SharesOutstanding")
    private String sharesOutstanding;

    @JsonProperty("DividendDate")
    private String dividendDate;

    @JsonProperty("ExDividendDate")
    private String exDividendDate;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public String getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    public void setFiscalYearEnd(String fiscalYearEnd) {
        this.fiscalYearEnd = fiscalYearEnd;
    }

    public String getLatestQuarter() {
        return latestQuarter;
    }

    public void setLatestQuarter(String latestQuarter) {
        this.latestQuarter = latestQuarter;
    }

    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public String getEbitda() {
        return ebitda;
    }

    public void setEbitda(String ebitda) {
        this.ebitda = ebitda;
    }

    public String getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(String peRatio) {
        this.peRatio = peRatio;
    }

    public String getPegRatio() {
        return pegRatio;
    }

    public void setPegRatio(String pegRatio) {
        this.pegRatio = pegRatio;
    }

    public String getBookValue() {
        return bookValue;
    }

    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    public String getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(String dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }

    public String getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getRevenuePerShareTTM() {
        return revenuePerShareTTM;
    }

    public void setRevenuePerShareTTM(String revenuePerShareTTM) {
        this.revenuePerShareTTM = revenuePerShareTTM;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getOperatingMarginTTM() {
        return operatingMarginTTM;
    }

    public void setOperatingMarginTTM(String operatingMarginTTM) {
        this.operatingMarginTTM = operatingMarginTTM;
    }

    public String getReturnOnAssetsTTM() {
        return returnOnAssetsTTM;
    }

    public void setReturnOnAssetsTTM(String returnOnAssetsTTM) {
        this.returnOnAssetsTTM = returnOnAssetsTTM;
    }

    public String getReturnOnEquityTTM() {
        return returnOnEquityTTM;
    }

    public void setReturnOnEquityTTM(String returnOnEquityTTM) {
        this.returnOnEquityTTM = returnOnEquityTTM;
    }

    public String getRevenueTTM() {
        return revenueTTM;
    }

    public void setRevenueTTM(String revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    public String getGrossProfitTTM() {
        return grossProfitTTM;
    }

    public void setGrossProfitTTM(String grossProfitTTM) {
        this.grossProfitTTM = grossProfitTTM;
    }

    public String getDilutedEPSTTM() {
        return dilutedEPSTTM;
    }

    public void setDilutedEPSTTM(String dilutedEPSTTM) {
        this.dilutedEPSTTM = dilutedEPSTTM;
    }

    public String getQuarterlyEarningsGrowthYOY() {
        return quarterlyEarningsGrowthYOY;
    }

    public void setQuarterlyEarningsGrowthYOY(String quarterlyEarningsGrowthYOY) {
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    public String getQuarterlyRevenueGrowthYOY() {
        return quarterlyRevenueGrowthYOY;
    }

    public void setQuarterlyRevenueGrowthYOY(String quarterlyRevenueGrowthYOY) {
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

    public String getAnalystTargetPrice() {
        return analystTargetPrice;
    }

    public void setAnalystTargetPrice(String analystTargetPrice) {
        this.analystTargetPrice = analystTargetPrice;
    }

    public String getAnalystRatingStrongBuy() {
        return analystRatingStrongBuy;
    }

    public void setAnalystRatingStrongBuy(String analystRatingStrongBuy) {
        this.analystRatingStrongBuy = analystRatingStrongBuy;
    }

    public String getAnalystRatingBuy() {
        return analystRatingBuy;
    }

    public void setAnalystRatingBuy(String analystRatingBuy) {
        this.analystRatingBuy = analystRatingBuy;
    }

    public String getAnalystRatingHold() {
        return analystRatingHold;
    }

    public void setAnalystRatingHold(String analystRatingHold) {
        this.analystRatingHold = analystRatingHold;
    }

    public String getAnalystRatingSell() {
        return analystRatingSell;
    }

    public void setAnalystRatingSell(String analystRatingSell) {
        this.analystRatingSell = analystRatingSell;
    }

    public String getAnalystRatingStrongSell() {
        return analystRatingStrongSell;
    }

    public void setAnalystRatingStrongSell(String analystRatingStrongSell) {
        this.analystRatingStrongSell = analystRatingStrongSell;
    }

    public String getTrailingPE() {
        return trailingPE;
    }

    public void setTrailingPE(String trailingPE) {
        this.trailingPE = trailingPE;
    }

    public String getForwardPE() {
        return forwardPE;
    }

    public void setForwardPE(String forwardPE) {
        this.forwardPE = forwardPE;
    }

    public String getPriceToSalesRatioTTM() {
        return priceToSalesRatioTTM;
    }

    public void setPriceToSalesRatioTTM(String priceToSalesRatioTTM) {
        this.priceToSalesRatioTTM = priceToSalesRatioTTM;
    }

    public String getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(String priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public String getEvToRevenue() {
        return evToRevenue;
    }

    public void setEvToRevenue(String evToRevenue) {
        this.evToRevenue = evToRevenue;
    }

    public String getEvToEBITDA() {
        return evToEBITDA;
    }

    public void setEvToEBITDA(String evToEBITDA) {
        this.evToEBITDA = evToEBITDA;
    }

    public String getBeta() {
        return beta;
    }

    public void setBeta(String beta) {
        this.beta = beta;
    }

    public String getWeek52High() {
        return week52High;
    }

    public void setWeek52High(String week52High) {
        this.week52High = week52High;
    }

    public String getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(String week52Low) {
        this.week52Low = week52Low;
    }

    public String getMovingAverage50Day() {
        return movingAverage50Day;
    }

    public void setMovingAverage50Day(String movingAverage50Day) {
        this.movingAverage50Day = movingAverage50Day;
    }

    public String getMovingAverage200Day() {
        return movingAverage200Day;
    }

    public void setMovingAverage200Day(String movingAverage200Day) {
        this.movingAverage200Day = movingAverage200Day;
    }

    public String getSharesOutstanding() {
        return sharesOutstanding;
    }

    public void setSharesOutstanding(String sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    public String getDividendDate() {
        return dividendDate;
    }

    public void setDividendDate(String dividendDate) {
        this.dividendDate = dividendDate;
    }

    public String getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }
}
