package com.superwallet.response;

import java.io.Serializable;

public class ResponseDWalletSimpleInfo implements Serializable {
    private int tokenType;
    private String tokenName;
    private String tokenAddress;
    private double tokenPrice;
    private double tokenPriceToRMB;
    private double balance;


    public ResponseDWalletSimpleInfo() {
    }

    public ResponseDWalletSimpleInfo(int tokenType, String tokenName, String tokenAddress, double tokenPrice, double tokenPriceToRMB, double balance) {
        this.tokenType = tokenType;
        this.tokenName = tokenName;
        this.tokenAddress = tokenAddress;
        this.tokenPrice = tokenPrice;
        this.tokenPriceToRMB = tokenPriceToRMB;
        this.balance = balance;
    }

    public void setTokenPrice(double tokenPrice) {
        this.tokenPrice = tokenPrice;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTokenPrice() {
        return tokenPrice;
    }

    public int getTokenType() {
        return tokenType;
    }

    public void setTokenType(int tokenType) {
        this.tokenType = tokenType;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getTokenAddress() {
        return tokenAddress;
    }

    public void setTokenAddress(String tokenAddress) {
        this.tokenAddress = tokenAddress;
    }

    public double getTokenPriceToRMB() {
        return tokenPriceToRMB;
    }

    public void setTokenPriceToRMB(double tokenPriceToRMB) {
        this.tokenPriceToRMB = tokenPriceToRMB;
    }
}
