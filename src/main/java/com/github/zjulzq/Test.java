package com.github.zjulzq;

import java.util.concurrent.atomic.AtomicInteger;

import org.bytedeco.javacpp.Ctp.CThostFtdcMdApi;
import org.bytedeco.javacpp.Ctp.CThostFtdcMdSpi;
import org.bytedeco.javacpp.Ctp.CThostFtdcTraderApi;
import org.bytedeco.javacpp.Ctp.CThostFtdcTraderSpi;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		AtomicInteger mdRequestId = new AtomicInteger(1);
		AtomicInteger tdRequestId = new AtomicInteger(1);

		CThostFtdcMdApi mdApi = CThostFtdcMdApi.CreateFtdcMdApi();
		mdApi.RegisterFront("tcp://180.168.146.187:10010".getBytes());
		CThostFtdcMdSpi mdSpi = new ThostFtdcMdSpi(mdApi, mdRequestId);
		mdApi.RegisterSpi(mdSpi);
		mdApi.Init();

		CThostFtdcTraderApi tdApi = CThostFtdcTraderApi.CreateFtdcTraderApi();
		tdApi.RegisterFront("tcp://180.168.146.187:10000".getBytes());
		CThostFtdcTraderSpi tdSpi = new ThostFtdcTraderSpi(tdApi, tdRequestId);
		tdApi.RegisterSpi(tdSpi);
		tdApi.Init();

		Thread.sleep(10000);
		tdApi.Release();
		mdApi.Release();
	}

}
