package com.github.zjulzq;

import java.util.concurrent.atomic.AtomicInteger;

import org.bytedeco.javacpp.Ctp.CThostFtdcDepthMarketDataField;
import org.bytedeco.javacpp.Ctp.CThostFtdcForQuoteRspField;
import org.bytedeco.javacpp.Ctp.CThostFtdcMdApi;
import org.bytedeco.javacpp.Ctp.CThostFtdcMdSpi;
import org.bytedeco.javacpp.Ctp.CThostFtdcReqUserLoginField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRspInfoField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRspUserLoginField;
import org.bytedeco.javacpp.Ctp.CThostFtdcSpecificInstrumentField;
import org.bytedeco.javacpp.Ctp.CThostFtdcUserLogoutField;

public class ThostFtdcMdSpi extends CThostFtdcMdSpi {
	private CThostFtdcMdApi mdApi;
	private AtomicInteger requestId;

	public ThostFtdcMdSpi(CThostFtdcMdApi mdApi, AtomicInteger requestId) {
		this.mdApi = mdApi;
		this.requestId = requestId;
	}

	@Override
	public void OnFrontConnected() {
		System.out.println("on md api connect");

		CThostFtdcReqUserLoginField reqUserLoginField = new CThostFtdcReqUserLoginField();
		reqUserLoginField.BrokerID().putString("9999");
		reqUserLoginField.UserID().putString("044392");
		reqUserLoginField.Password().putString("123456");
		mdApi.ReqUserLogin(reqUserLoginField, requestId.incrementAndGet());
	}

	@Override
	public void OnFrontDisconnected(int nReason) {
		System.out.println("md OnFrontDisconnected");
		super.OnFrontDisconnected(nReason);
	}

	@Override
	public void OnHeartBeatWarning(int nTimeLapse) {
		System.out.println("OnHeartBeatWarning");
		super.OnHeartBeatWarning(nTimeLapse);
	}

	@Override
	public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		System.out.println("md OnRspUserLogin, nRequestID=" + nRequestID + ", bIsLast=" + bIsLast + ", errorId="
				+ pRspInfo.ErrorID() + ", errorMsg=" + pRspInfo.ErrorMsg().getString() + ", frontId="
				+ pRspUserLogin.FrontID() + ", sessionId=" + pRspUserLogin.SessionID() + ", brokerId="
				+ pRspUserLogin.BrokerID().getString() + ", maxOrderRef=" + pRspUserLogin.MaxOrderRef().getString());

		if (mdApi != null) {
			mdApi.SubscribeMarketData("IF1604".getBytes(), 1);
		}
	}

	@Override
	public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		System.out.println("OnRspUserLogout");
		super.OnRspUserLogout(pUserLogout, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("OnRspError");
		super.OnRspError(pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("OnRspSubMarketData");
		super.OnRspSubMarketData(pSpecificInstrument, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("OnRspUnSubMarketData");
		super.OnRspUnSubMarketData(pSpecificInstrument, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("OnRspSubForQuoteRsp");
		super.OnRspSubForQuoteRsp(pSpecificInstrument, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("OnRspUnSubForQuoteRsp");
		super.OnRspUnSubForQuoteRsp(pSpecificInstrument, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
		System.out.println("instrumentId=" + pDepthMarketData.InstrumentID().getString() + ", lastPrice="
				+ pDepthMarketData.LastPrice());
		super.OnRtnDepthMarketData(pDepthMarketData);
	}

	@Override
	public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
		System.out.println("OnRtnForQuoteRsp");
		super.OnRtnForQuoteRsp(pForQuoteRsp);
	}

}
