package com.flipkart.mc;

public class CryptoInfo {


    private int id;
    private double btcprice;
    private double privatemarketTradeVolume;
    private double intradayHighPrice;
    private double marketcap;

    public CryptoInfo(int id, double btcprice, double privatemarketTradeVolume, double intradayHighPrice, double marketcap) {
        this.id = id;
        this.btcprice = btcprice;
        this.privatemarketTradeVolume = privatemarketTradeVolume;
        this.intradayHighPrice = intradayHighPrice;
        this.marketcap = marketcap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBtcprice() {
        return btcprice;
    }

    public void setBtcprice(double btcprice) {
        this.btcprice = btcprice;
    }

    public double getPrivatemarketTradeVolume() {
        return privatemarketTradeVolume;
    }

    public void setPrivatemarketTradeVolume(double privatemarketTradeVolume) {
        this.privatemarketTradeVolume = privatemarketTradeVolume;
    }

    public double getIntradayHighPrice() {
        return intradayHighPrice;
    }

    public void setIntradayHighPrice(double intradayHighPrice) {
        this.intradayHighPrice = intradayHighPrice;
    }

    public double getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(double marketcap) {
        this.marketcap = marketcap;
    }
}
