package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.bind.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-14 16:37:51
 */
public class AlipayCommerceTransportEtcBindModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5411853722746765695L;

	/** 
	 * 是否更新成功；true成功/false失败
	 */
	@ApiField("update_result")
	private Boolean updateResult;

	public void setUpdateResult(Boolean updateResult) {
		this.updateResult = updateResult;
	}
	public Boolean getUpdateResult( ) {
		return this.updateResult;
	}

}
