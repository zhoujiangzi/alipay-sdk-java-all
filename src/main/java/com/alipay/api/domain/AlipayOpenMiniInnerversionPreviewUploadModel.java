package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 多端小程序-真机预览接口
 *
 * @author auto create
 * @since 1.0, 2019-05-13 11:00:27
 */
public class AlipayOpenMiniInnerversionPreviewUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7869562956954115425L;

	/**
	 * 构建参数- JSAPI 权限文件, JSON 字符串
	 */
	@ApiField("build_js_permission")
	private String buildJsPermission;

	/**
	 * 构建参数-IDE 构建好的包地址
	 */
	@ApiField("build_pkg_url")
	private String buildPkgUrl;

	/**
	 * 一个端的标识，用于区分不同的客户端，每接入一个客户端，都需要向小程序应用中心申请bundelId入驻
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 业务扩展属性
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 上传调试版的接入租户类型。
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序主入口
	 */
	@ApiField("main_url")
	private String mainUrl;

	/**
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 预览类型，目前分为“DEBUG(调试版)、TRIAL(试用版)”
	 */
	@ApiField("scene")
	private String scene;

	public String getBuildJsPermission() {
		return this.buildJsPermission;
	}
	public void setBuildJsPermission(String buildJsPermission) {
		this.buildJsPermission = buildJsPermission;
	}

	public String getBuildPkgUrl() {
		return this.buildPkgUrl;
	}
	public void setBuildPkgUrl(String buildPkgUrl) {
		this.buildPkgUrl = buildPkgUrl;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
	}

	public String getMainUrl() {
		return this.mainUrl;
	}
	public void setMainUrl(String mainUrl) {
		this.mainUrl = mainUrl;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}