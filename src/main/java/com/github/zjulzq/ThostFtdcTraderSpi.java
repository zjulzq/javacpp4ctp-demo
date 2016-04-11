package com.github.zjulzq;

import java.util.concurrent.atomic.AtomicInteger;

import org.bytedeco.javacpp.Ctp.CThostFtdcAccountregisterField;
import org.bytedeco.javacpp.Ctp.CThostFtdcBrokerTradingAlgosField;
import org.bytedeco.javacpp.Ctp.CThostFtdcBrokerTradingParamsField;
import org.bytedeco.javacpp.Ctp.CThostFtdcCFMMCTradingAccountKeyField;
import org.bytedeco.javacpp.Ctp.CThostFtdcCFMMCTradingAccountTokenField;
import org.bytedeco.javacpp.Ctp.CThostFtdcCancelAccountField;
import org.bytedeco.javacpp.Ctp.CThostFtdcChangeAccountField;
import org.bytedeco.javacpp.Ctp.CThostFtdcCombActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcCombInstrumentGuardField;
import org.bytedeco.javacpp.Ctp.CThostFtdcContractBankField;
import org.bytedeco.javacpp.Ctp.CThostFtdcDepthMarketDataField;
import org.bytedeco.javacpp.Ctp.CThostFtdcEWarrantOffsetField;
import org.bytedeco.javacpp.Ctp.CThostFtdcErrorConditionalOrderField;
import org.bytedeco.javacpp.Ctp.CThostFtdcExchangeField;
import org.bytedeco.javacpp.Ctp.CThostFtdcExchangeMarginRateAdjustField;
import org.bytedeco.javacpp.Ctp.CThostFtdcExchangeMarginRateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcExchangeRateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcExecOrderActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcExecOrderField;
import org.bytedeco.javacpp.Ctp.CThostFtdcForQuoteField;
import org.bytedeco.javacpp.Ctp.CThostFtdcForQuoteRspField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputCombActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputExecOrderActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputExecOrderField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputForQuoteField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputOrderActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputOrderField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputQuoteActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInputQuoteField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInstrumentCommissionRateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInstrumentField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInstrumentMarginRateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInstrumentOrderCommRateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInstrumentStatusField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInvestorField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInvestorPositionCombineDetailField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInvestorPositionDetailField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInvestorPositionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcInvestorProductGroupMarginField;
import org.bytedeco.javacpp.Ctp.CThostFtdcNoticeField;
import org.bytedeco.javacpp.Ctp.CThostFtdcNotifyQueryAccountField;
import org.bytedeco.javacpp.Ctp.CThostFtdcOpenAccountField;
import org.bytedeco.javacpp.Ctp.CThostFtdcOptionInstrCommRateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcOptionInstrTradeCostField;
import org.bytedeco.javacpp.Ctp.CThostFtdcOrderActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcOrderField;
import org.bytedeco.javacpp.Ctp.CThostFtdcParkedOrderActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcParkedOrderField;
import org.bytedeco.javacpp.Ctp.CThostFtdcProductField;
import org.bytedeco.javacpp.Ctp.CThostFtdcProductGroupField;
import org.bytedeco.javacpp.Ctp.CThostFtdcQryInvestorPositionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcQueryCFMMCTradingAccountTokenField;
import org.bytedeco.javacpp.Ctp.CThostFtdcQueryMaxOrderVolumeField;
import org.bytedeco.javacpp.Ctp.CThostFtdcQuoteActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcQuoteField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRemoveParkedOrderActionField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRemoveParkedOrderField;
import org.bytedeco.javacpp.Ctp.CThostFtdcReqAuthenticateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcReqQueryAccountField;
import org.bytedeco.javacpp.Ctp.CThostFtdcReqRepealField;
import org.bytedeco.javacpp.Ctp.CThostFtdcReqTransferField;
import org.bytedeco.javacpp.Ctp.CThostFtdcReqUserLoginField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRspAuthenticateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRspInfoField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRspRepealField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRspTransferField;
import org.bytedeco.javacpp.Ctp.CThostFtdcRspUserLoginField;
import org.bytedeco.javacpp.Ctp.CThostFtdcSecAgentACIDMapField;
import org.bytedeco.javacpp.Ctp.CThostFtdcSettlementInfoConfirmField;
import org.bytedeco.javacpp.Ctp.CThostFtdcSettlementInfoField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTradeField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTraderApi;
import org.bytedeco.javacpp.Ctp.CThostFtdcTraderSpi;
import org.bytedeco.javacpp.Ctp.CThostFtdcTradingAccountField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTradingAccountPasswordUpdateField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTradingCodeField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTradingNoticeField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTradingNoticeInfoField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTransferBankField;
import org.bytedeco.javacpp.Ctp.CThostFtdcTransferSerialField;
import org.bytedeco.javacpp.Ctp.CThostFtdcUserLogoutField;
import org.bytedeco.javacpp.Ctp.CThostFtdcUserPasswordUpdateField;

public class ThostFtdcTraderSpi extends CThostFtdcTraderSpi {
	private CThostFtdcTraderApi tdApi;
	private AtomicInteger requestId;

	public ThostFtdcTraderSpi(CThostFtdcTraderApi tdApi, AtomicInteger requestId) {
		this.tdApi = tdApi;
		this.requestId = requestId;
	}

	@Override
	public void OnFrontConnected() {
		System.out.println("on trade api connect");
		CThostFtdcReqUserLoginField reqUserLoginField = new CThostFtdcReqUserLoginField();
		reqUserLoginField.BrokerID().putString("9999");
		reqUserLoginField.UserID().putString("044392");
		reqUserLoginField.Password().putString("123456");
		reqUserLoginField.UserProductInfo().putString("javacpp4ctp");
		tdApi.ReqUserLogin(reqUserLoginField, requestId.incrementAndGet());
	}

	@Override
	public void OnFrontDisconnected(int nReason) {
		System.out.println("td OnFrontDisconnected");
	}

	@Override
	public void OnHeartBeatWarning(int nTimeLapse) {
		// TODO Auto-generated method stub
		super.OnHeartBeatWarning(nTimeLapse);
	}

	@Override
	public void OnRspAuthenticate(CThostFtdcRspAuthenticateField pRspAuthenticateField, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		System.out.println("trade OnRspAuthenticate");
		if (pRspInfo.ErrorID() == 0) {
			CThostFtdcReqUserLoginField reqUserLoginField = new CThostFtdcReqUserLoginField();
			reqUserLoginField.BrokerID().putString("9999");
			reqUserLoginField.UserID().putString("044392");
			reqUserLoginField.Password().putString("123456");
			reqUserLoginField.UserProductInfo().putString("javacpp4ctp");
			tdApi.ReqUserLogin(reqUserLoginField, requestId.incrementAndGet());
		} else {
			CThostFtdcReqAuthenticateField reqAuthenticateField = new CThostFtdcReqAuthenticateField();
			reqAuthenticateField.BrokerID().putString("9999");
			reqAuthenticateField.UserID().putString("044392");
			reqAuthenticateField.UserProductInfo().putString("javacpp4ctp");
			reqAuthenticateField.AuthCode().putString("");
			tdApi.ReqAuthenticate(reqAuthenticateField, requestId.incrementAndGet());
		}
	}

	@Override
	public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		String msg = pRspInfo.ErrorMsg().getString();
		System.out.println("trade OnRspUserLogin, nRequestId=" + nRequestID + ", bIsLast=" + bIsLast + ", errorId="
				+ pRspInfo.ErrorID() + ", errorMsg=" + msg);

		CThostFtdcQryInvestorPositionField qryInvestorPositionField = new CThostFtdcQryInvestorPositionField();
		qryInvestorPositionField.BrokerID().putString("9999");
		qryInvestorPositionField.InvestorID().putString("044392");
		qryInvestorPositionField.InstrumentID().putString("");
		tdApi.ReqQryInvestorPosition(qryInvestorPositionField, requestId.incrementAndGet());
		// CThostFtdcQryTradeField qryTradeField = new
		// CThostFtdcQryTradeField();
		// qryTradeField.BrokerID().putString("9999");
		// qryTradeField.InvestorID().putString("044392");
		// tdApi.ReqQryTrade(qryTradeField, requestId.incrementAndGet());
	}

	@Override
	public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspUserLogout(pUserLogout, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspUserPasswordUpdate(pUserPasswordUpdate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspTradingAccountPasswordUpdate(
			CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspTradingAccountPasswordUpdate(pTradingAccountPasswordUpdate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspOrderInsert(pInputOrder, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspParkedOrderInsert(pParkedOrder, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspParkedOrderAction(pParkedOrderAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspOrderAction(pInputOrderAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQueryMaxOrderVolume(pQueryMaxOrderVolume, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspSettlementInfoConfirm(pSettlementInfoConfirm, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspRemoveParkedOrder(pRemoveParkedOrder, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspRemoveParkedOrderAction(pRemoveParkedOrderAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspExecOrderInsert(CThostFtdcInputExecOrderField pInputExecOrder, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspExecOrderInsert(pInputExecOrder, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspExecOrderAction(CThostFtdcInputExecOrderActionField pInputExecOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspExecOrderAction(pInputExecOrderAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspForQuoteInsert(CThostFtdcInputForQuoteField pInputForQuote, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspForQuoteInsert(pInputForQuote, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQuoteInsert(CThostFtdcInputQuoteField pInputQuote, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQuoteInsert(pInputQuote, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQuoteAction(CThostFtdcInputQuoteActionField pInputQuoteAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQuoteAction(pInputQuoteAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspCombActionInsert(CThostFtdcInputCombActionField pInputCombAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspCombActionInsert(pInputCombAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryOrder(CThostFtdcOrderField pOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryOrder(pOrder, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryTrade(CThostFtdcTradeField pTrade, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		System.out.println("bIsLast=" + bIsLast + ", instrumentId=" + pTrade.InstrumentID().getString() + ", tradeId="
				+ pTrade.TradeID().getString());
	}

	@Override
	public void OnRspQryInvestorPosition(CThostFtdcInvestorPositionField pInvestorPosition,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		System.out.println("isLast=" + bIsLast + ", instrumentId=" + pInvestorPosition.InstrumentID().getString()
				+ ", position=" + pInvestorPosition.Position());
	}

	@Override
	public void OnRspQryTradingAccount(CThostFtdcTradingAccountField pTradingAccount, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryTradingAccount(pTradingAccount, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInvestor(CThostFtdcInvestorField pInvestor, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInvestor(pInvestor, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryTradingCode(CThostFtdcTradingCodeField pTradingCode, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryTradingCode(pTradingCode, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInstrumentMarginRate(CThostFtdcInstrumentMarginRateField pInstrumentMarginRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInstrumentMarginRate(pInstrumentMarginRate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInstrumentCommissionRate(CThostFtdcInstrumentCommissionRateField pInstrumentCommissionRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInstrumentCommissionRate(pInstrumentCommissionRate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryExchange(CThostFtdcExchangeField pExchange, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryExchange(pExchange, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryProduct(CThostFtdcProductField pProduct, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryProduct(pProduct, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInstrument(CThostFtdcInstrumentField pInstrument, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInstrument(pInstrument, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryDepthMarketData(pDepthMarketData, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQrySettlementInfo(CThostFtdcSettlementInfoField pSettlementInfo, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQrySettlementInfo(pSettlementInfo, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryTransferBank(CThostFtdcTransferBankField pTransferBank, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryTransferBank(pTransferBank, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInvestorPositionDetail(CThostFtdcInvestorPositionDetailField pInvestorPositionDetail,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInvestorPositionDetail(pInvestorPositionDetail, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryNotice(CThostFtdcNoticeField pNotice, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryNotice(pNotice, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQrySettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQrySettlementInfoConfirm(pSettlementInfoConfirm, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInvestorPositionCombineDetail(
			CThostFtdcInvestorPositionCombineDetailField pInvestorPositionCombineDetail,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInvestorPositionCombineDetail(pInvestorPositionCombineDetail, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryCFMMCTradingAccountKey(CThostFtdcCFMMCTradingAccountKeyField pCFMMCTradingAccountKey,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryCFMMCTradingAccountKey(pCFMMCTradingAccountKey, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryEWarrantOffset(CThostFtdcEWarrantOffsetField pEWarrantOffset, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryEWarrantOffset(pEWarrantOffset, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInvestorProductGroupMargin(
			CThostFtdcInvestorProductGroupMarginField pInvestorProductGroupMargin, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInvestorProductGroupMargin(pInvestorProductGroupMargin, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryExchangeMarginRate(CThostFtdcExchangeMarginRateField pExchangeMarginRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryExchangeMarginRate(pExchangeMarginRate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryExchangeMarginRateAdjust(CThostFtdcExchangeMarginRateAdjustField pExchangeMarginRateAdjust,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryExchangeMarginRateAdjust(pExchangeMarginRateAdjust, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryExchangeRate(CThostFtdcExchangeRateField pExchangeRate, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryExchangeRate(pExchangeRate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQrySecAgentACIDMap(CThostFtdcSecAgentACIDMapField pSecAgentACIDMap,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQrySecAgentACIDMap(pSecAgentACIDMap, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryProductGroup(CThostFtdcProductGroupField pProductGroup, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryProductGroup(pProductGroup, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryInstrumentOrderCommRate(CThostFtdcInstrumentOrderCommRateField pInstrumentOrderCommRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryInstrumentOrderCommRate(pInstrumentOrderCommRate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryOptionInstrTradeCost(CThostFtdcOptionInstrTradeCostField pOptionInstrTradeCost,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryOptionInstrTradeCost(pOptionInstrTradeCost, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryOptionInstrCommRate(CThostFtdcOptionInstrCommRateField pOptionInstrCommRate,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryOptionInstrCommRate(pOptionInstrCommRate, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryExecOrder(CThostFtdcExecOrderField pExecOrder, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryExecOrder(pExecOrder, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryForQuote(CThostFtdcForQuoteField pForQuote, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryForQuote(pForQuote, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryQuote(CThostFtdcQuoteField pQuote, CThostFtdcRspInfoField pRspInfo, int nRequestID,
			boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryQuote(pQuote, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryCombInstrumentGuard(CThostFtdcCombInstrumentGuardField pCombInstrumentGuard,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryCombInstrumentGuard(pCombInstrumentGuard, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryCombAction(CThostFtdcCombActionField pCombAction, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryCombAction(pCombAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryTransferSerial(CThostFtdcTransferSerialField pTransferSerial, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryTransferSerial(pTransferSerial, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryAccountregister(CThostFtdcAccountregisterField pAccountregister,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryAccountregister(pAccountregister, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspError(pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRtnOrder(CThostFtdcOrderField pOrder) {
		// TODO Auto-generated method stub
		super.OnRtnOrder(pOrder);
	}

	@Override
	public void OnRtnTrade(CThostFtdcTradeField pTrade) {
		// TODO Auto-generated method stub
		super.OnRtnTrade(pTrade);
	}

	@Override
	public void OnErrRtnOrderInsert(CThostFtdcInputOrderField pInputOrder, CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnOrderInsert(pInputOrder, pRspInfo);
	}

	@Override
	public void OnErrRtnOrderAction(CThostFtdcOrderActionField pOrderAction, CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnOrderAction(pOrderAction, pRspInfo);
	}

	@Override
	public void OnRtnInstrumentStatus(CThostFtdcInstrumentStatusField pInstrumentStatus) {
		// TODO Auto-generated method stub
		super.OnRtnInstrumentStatus(pInstrumentStatus);
	}

	@Override
	public void OnRtnTradingNotice(CThostFtdcTradingNoticeInfoField pTradingNoticeInfo) {
		// TODO Auto-generated method stub
		super.OnRtnTradingNotice(pTradingNoticeInfo);
	}

	@Override
	public void OnRtnErrorConditionalOrder(CThostFtdcErrorConditionalOrderField pErrorConditionalOrder) {
		// TODO Auto-generated method stub
		super.OnRtnErrorConditionalOrder(pErrorConditionalOrder);
	}

	@Override
	public void OnRtnExecOrder(CThostFtdcExecOrderField pExecOrder) {
		// TODO Auto-generated method stub
		super.OnRtnExecOrder(pExecOrder);
	}

	@Override
	public void OnErrRtnExecOrderInsert(CThostFtdcInputExecOrderField pInputExecOrder,
			CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnExecOrderInsert(pInputExecOrder, pRspInfo);
	}

	@Override
	public void OnErrRtnExecOrderAction(CThostFtdcExecOrderActionField pExecOrderAction,
			CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnExecOrderAction(pExecOrderAction, pRspInfo);
	}

	@Override
	public void OnErrRtnForQuoteInsert(CThostFtdcInputForQuoteField pInputForQuote, CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnForQuoteInsert(pInputForQuote, pRspInfo);
	}

	@Override
	public void OnRtnQuote(CThostFtdcQuoteField pQuote) {
		// TODO Auto-generated method stub
		super.OnRtnQuote(pQuote);
	}

	@Override
	public void OnErrRtnQuoteInsert(CThostFtdcInputQuoteField pInputQuote, CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnQuoteInsert(pInputQuote, pRspInfo);
	}

	@Override
	public void OnErrRtnQuoteAction(CThostFtdcQuoteActionField pQuoteAction, CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnQuoteAction(pQuoteAction, pRspInfo);
	}

	@Override
	public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
		// TODO Auto-generated method stub
		super.OnRtnForQuoteRsp(pForQuoteRsp);
	}

	@Override
	public void OnRtnCFMMCTradingAccountToken(CThostFtdcCFMMCTradingAccountTokenField pCFMMCTradingAccountToken) {
		// TODO Auto-generated method stub
		super.OnRtnCFMMCTradingAccountToken(pCFMMCTradingAccountToken);
	}

	@Override
	public void OnRtnCombAction(CThostFtdcCombActionField pCombAction) {
		// TODO Auto-generated method stub
		super.OnRtnCombAction(pCombAction);
	}

	@Override
	public void OnErrRtnCombActionInsert(CThostFtdcInputCombActionField pInputCombAction,
			CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnCombActionInsert(pInputCombAction, pRspInfo);
	}

	@Override
	public void OnRspQryContractBank(CThostFtdcContractBankField pContractBank, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryContractBank(pContractBank, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryParkedOrder(CThostFtdcParkedOrderField pParkedOrder, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryParkedOrder(pParkedOrder, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryParkedOrderAction(pParkedOrderAction, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryTradingNotice(CThostFtdcTradingNoticeField pTradingNotice, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryTradingNotice(pTradingNotice, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryBrokerTradingParams(CThostFtdcBrokerTradingParamsField pBrokerTradingParams,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryBrokerTradingParams(pBrokerTradingParams, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQryBrokerTradingAlgos(CThostFtdcBrokerTradingAlgosField pBrokerTradingAlgos,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQryBrokerTradingAlgos(pBrokerTradingAlgos, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQueryCFMMCTradingAccountToken(
			CThostFtdcQueryCFMMCTradingAccountTokenField pQueryCFMMCTradingAccountToken,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQueryCFMMCTradingAccountToken(pQueryCFMMCTradingAccountToken, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRtnFromBankToFutureByBank(CThostFtdcRspTransferField pRspTransfer) {
		// TODO Auto-generated method stub
		super.OnRtnFromBankToFutureByBank(pRspTransfer);
	}

	@Override
	public void OnRtnFromFutureToBankByBank(CThostFtdcRspTransferField pRspTransfer) {
		// TODO Auto-generated method stub
		super.OnRtnFromFutureToBankByBank(pRspTransfer);
	}

	@Override
	public void OnRtnRepealFromBankToFutureByBank(CThostFtdcRspRepealField pRspRepeal) {
		// TODO Auto-generated method stub
		super.OnRtnRepealFromBankToFutureByBank(pRspRepeal);
	}

	@Override
	public void OnRtnRepealFromFutureToBankByBank(CThostFtdcRspRepealField pRspRepeal) {
		// TODO Auto-generated method stub
		super.OnRtnRepealFromFutureToBankByBank(pRspRepeal);
	}

	@Override
	public void OnRtnFromBankToFutureByFuture(CThostFtdcRspTransferField pRspTransfer) {
		// TODO Auto-generated method stub
		super.OnRtnFromBankToFutureByFuture(pRspTransfer);
	}

	@Override
	public void OnRtnFromFutureToBankByFuture(CThostFtdcRspTransferField pRspTransfer) {
		// TODO Auto-generated method stub
		super.OnRtnFromFutureToBankByFuture(pRspTransfer);
	}

	@Override
	public void OnRtnRepealFromBankToFutureByFutureManual(CThostFtdcRspRepealField pRspRepeal) {
		// TODO Auto-generated method stub
		super.OnRtnRepealFromBankToFutureByFutureManual(pRspRepeal);
	}

	@Override
	public void OnRtnRepealFromFutureToBankByFutureManual(CThostFtdcRspRepealField pRspRepeal) {
		// TODO Auto-generated method stub
		super.OnRtnRepealFromFutureToBankByFutureManual(pRspRepeal);
	}

	@Override
	public void OnRtnQueryBankBalanceByFuture(CThostFtdcNotifyQueryAccountField pNotifyQueryAccount) {
		// TODO Auto-generated method stub
		super.OnRtnQueryBankBalanceByFuture(pNotifyQueryAccount);
	}

	@Override
	public void OnErrRtnBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnBankToFutureByFuture(pReqTransfer, pRspInfo);
	}

	@Override
	public void OnErrRtnFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnFutureToBankByFuture(pReqTransfer, pRspInfo);
	}

	@Override
	public void OnErrRtnRepealBankToFutureByFutureManual(CThostFtdcReqRepealField pReqRepeal,
			CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnRepealBankToFutureByFutureManual(pReqRepeal, pRspInfo);
	}

	@Override
	public void OnErrRtnRepealFutureToBankByFutureManual(CThostFtdcReqRepealField pReqRepeal,
			CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnRepealFutureToBankByFutureManual(pReqRepeal, pRspInfo);
	}

	@Override
	public void OnErrRtnQueryBankBalanceByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount,
			CThostFtdcRspInfoField pRspInfo) {
		// TODO Auto-generated method stub
		super.OnErrRtnQueryBankBalanceByFuture(pReqQueryAccount, pRspInfo);
	}

	@Override
	public void OnRtnRepealFromBankToFutureByFuture(CThostFtdcRspRepealField pRspRepeal) {
		// TODO Auto-generated method stub
		super.OnRtnRepealFromBankToFutureByFuture(pRspRepeal);
	}

	@Override
	public void OnRtnRepealFromFutureToBankByFuture(CThostFtdcRspRepealField pRspRepeal) {
		// TODO Auto-generated method stub
		super.OnRtnRepealFromFutureToBankByFuture(pRspRepeal);
	}

	@Override
	public void OnRspFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspFromBankToFutureByFuture(pReqTransfer, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, CThostFtdcRspInfoField pRspInfo,
			int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspFromFutureToBankByFuture(pReqTransfer, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRspQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount,
			CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
		// TODO Auto-generated method stub
		super.OnRspQueryBankAccountMoneyByFuture(pReqQueryAccount, pRspInfo, nRequestID, bIsLast);
	}

	@Override
	public void OnRtnOpenAccountByBank(CThostFtdcOpenAccountField pOpenAccount) {
		// TODO Auto-generated method stub
		super.OnRtnOpenAccountByBank(pOpenAccount);
	}

	@Override
	public void OnRtnCancelAccountByBank(CThostFtdcCancelAccountField pCancelAccount) {
		// TODO Auto-generated method stub
		super.OnRtnCancelAccountByBank(pCancelAccount);
	}

	@Override
	public void OnRtnChangeAccountByBank(CThostFtdcChangeAccountField pChangeAccount) {
		// TODO Auto-generated method stub
		super.OnRtnChangeAccountByBank(pChangeAccount);
	}

}
