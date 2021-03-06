package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 焕旭科技聚合支付产品支付指令关闭接口
 *
 * @author auto create
 * @since 1.0, 2020-08-17 11:48:55
 */
public class HuanxuTradeOrderCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5655699826272711155L;

	/**
	 * 支付id，支付宝针对每一笔支付请求生成的唯一支付凭证
	 */
	@ApiField("payment_id")
	private String paymentId;

	public String getPaymentId() {
		return this.paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

}
