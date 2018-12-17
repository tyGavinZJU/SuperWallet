package com.superwallet.service;

import com.superwallet.common.BasicWalletInfo;
import com.superwallet.common.EOSWalletInfo;
import com.superwallet.pojo.Lockwarehouse;

import java.util.List;

public interface DWalletService {
    public List<BasicWalletInfo> listWalletInfo(String UID);

    public boolean transferMoney(String UID, Integer tokenType, Double tokenAmount, String addressTo, String description);

    public boolean lock(String UID, Integer tokenType, Double tokenAmount, Integer period);

    public List<Lockwarehouse> listOrders(String UID, String timeStampLeft, String timeStampRight);

    public boolean buyOrSellEOSCPUNET(String UID, Double cpuAmount, Double netAmount, Integer actionType);

    public boolean buyOrSellRAM(String UID, Double ramAmount, Integer actionType);

    public EOSWalletInfo listEOSBasic(String UID);
}
