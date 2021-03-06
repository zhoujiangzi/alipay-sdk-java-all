package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品简化接口属性组信息
 *
 * @author auto create
 * @since 1.0, 2020-06-21 14:58:17
 */
public class KbdishPropertySimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 5375459652538378647L;

	/**
	 * 属性明细
	 */
	@ApiListField("details")
	@ApiField("string")
	private List<String> details;

	/**
	 * 属性组名称
	 */
	@ApiField("name")
	private String name;

	public List<String> getDetails() {
		return this.details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
