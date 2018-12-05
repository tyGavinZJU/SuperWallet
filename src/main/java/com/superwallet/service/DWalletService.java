package com.superwallet.service;

import com.superwallet.common.WalletInfo;
import com.superwallet.pojo.Lockwarehouse;

import java.util.List;

public interface DWalletService {
    public List<WalletInfo> listWalletInfo(String UID);

    public boolean transferMoney(String UID, Integer tokenType, Double tokenAmount, String addressTo, String description);

    public boolean lock(String UID, Integer tokenType, Double tokenAmount, Integer period);

    public List<Lockwarehouse> listOrders(String UID, String timeStampLeft, String timeStampRight);
}