package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserAdvanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.agreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-20 22:58:25
 */
public class AlipayEcoMycarParkingAgreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7589257879528627138L;

	/** 
	 * 车牌代扣状态: 
-  当不传入uid：
0 车牌支持代扣
1 车牌不支持代扣
-  当传入uid：
0 车牌被指定用户开通代扣
1 车牌不支持代扣
2 车牌被其他用户开通代扣
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 仅当当前车场服务商签约了停车无感垫资产品，且指定车牌被当前传入的支付宝用户开通代扣条件下返回
	 */
	@ApiField("user_advance_info")
	private UserAdvanceInfo userAdvanceInfo;

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setUserAdvanceInfo(UserAdvanceInfo userAdvanceInfo) {
		this.userAdvanceInfo = userAdvanceInfo;
	}
	public UserAdvanceInfo getUserAdvanceInfo( ) {
		return this.userAdvanceInfo;
	}

}