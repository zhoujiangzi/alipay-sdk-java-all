package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品虚拟类目菜品同步简化接口
 *
 * @author auto create
 * @since 1.0, 2020-09-02 11:48:26
 */
public class KoubeiCateringDishVirtualcategorySyncModel extends AlipayObject {

	private static final long serialVersionUID = 7742834219797876327L;

	/**
	 * 类目信息
	 */
	@ApiField("catetory_info")
	private KbdishVirtualCatetorySimplifyInfo catetoryInfo;

	public KbdishVirtualCatetorySimplifyInfo getCatetoryInfo() {
		return this.catetoryInfo;
	}
	public void setCatetoryInfo(KbdishVirtualCatetorySimplifyInfo catetoryInfo) {
		this.catetoryInfo = catetoryInfo;
	}

}
