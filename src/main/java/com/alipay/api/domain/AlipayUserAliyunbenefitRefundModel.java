package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员阿里云权益退款接口
 *
 * @author auto create
 * @since 1.0, 2020-08-17 21:13:38
 */
public class AlipayUserAliyunbenefitRefundModel extends AlipayObject {

	private static final long serialVersionUID = 6415268391319538888L;

	/**
	 * 业务流水号，用来映射需要回退积分的订单号，与权益兑换时传入的值一致。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单所属支付宝用户的uid，与兑换接口中传入的值保持一致
	 */
	@ApiField("user_id")
	private String userId;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
