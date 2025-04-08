package com.entity.vo;

import com.entity.CaigouzhangdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 采购账单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public class CaigouzhangdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 家具名称
	 */
	
	private String jiajumingcheng;
		
	/**
	 * 家具分类
	 */
	
	private String jiajufenlei;
		
	/**
	 * 家具风格
	 */
	
	private String jiajufengge;
		
	/**
	 * 家具图片
	 */
	
	private String jiajutupian;
		
	/**
	 * 供应商名称
	 */
	
	private String gongyingshangmingcheng;
		
	/**
	 * 联系人
	 */
	
	private String lianxiren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 采购价格
	 */
	
	private Integer caigoujiage;
		
	/**
	 * 家具数量
	 */
	
	private Integer jiajushuliang;
		
	/**
	 * 订单金额
	 */
	
	private Integer dingdanjine;
		
	/**
	 * 采购日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caigouriqi;
		
	/**
	 * 采购备注
	 */
	
	private String caigoubeizhu;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：家具名称
	 */
	 
	public void setJiajumingcheng(String jiajumingcheng) {
		this.jiajumingcheng = jiajumingcheng;
	}
	
	/**
	 * 获取：家具名称
	 */
	public String getJiajumingcheng() {
		return jiajumingcheng;
	}
				
	
	/**
	 * 设置：家具分类
	 */
	 
	public void setJiajufenlei(String jiajufenlei) {
		this.jiajufenlei = jiajufenlei;
	}
	
	/**
	 * 获取：家具分类
	 */
	public String getJiajufenlei() {
		return jiajufenlei;
	}
				
	
	/**
	 * 设置：家具风格
	 */
	 
	public void setJiajufengge(String jiajufengge) {
		this.jiajufengge = jiajufengge;
	}
	
	/**
	 * 获取：家具风格
	 */
	public String getJiajufengge() {
		return jiajufengge;
	}
				
	
	/**
	 * 设置：家具图片
	 */
	 
	public void setJiajutupian(String jiajutupian) {
		this.jiajutupian = jiajutupian;
	}
	
	/**
	 * 获取：家具图片
	 */
	public String getJiajutupian() {
		return jiajutupian;
	}
				
	
	/**
	 * 设置：供应商名称
	 */
	 
	public void setGongyingshangmingcheng(String gongyingshangmingcheng) {
		this.gongyingshangmingcheng = gongyingshangmingcheng;
	}
	
	/**
	 * 获取：供应商名称
	 */
	public String getGongyingshangmingcheng() {
		return gongyingshangmingcheng;
	}
				
	
	/**
	 * 设置：联系人
	 */
	 
	public void setLianxiren(String lianxiren) {
		this.lianxiren = lianxiren;
	}
	
	/**
	 * 获取：联系人
	 */
	public String getLianxiren() {
		return lianxiren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：采购价格
	 */
	 
	public void setCaigoujiage(Integer caigoujiage) {
		this.caigoujiage = caigoujiage;
	}
	
	/**
	 * 获取：采购价格
	 */
	public Integer getCaigoujiage() {
		return caigoujiage;
	}
				
	
	/**
	 * 设置：家具数量
	 */
	 
	public void setJiajushuliang(Integer jiajushuliang) {
		this.jiajushuliang = jiajushuliang;
	}
	
	/**
	 * 获取：家具数量
	 */
	public Integer getJiajushuliang() {
		return jiajushuliang;
	}
				
	
	/**
	 * 设置：订单金额
	 */
	 
	public void setDingdanjine(Integer dingdanjine) {
		this.dingdanjine = dingdanjine;
	}
	
	/**
	 * 获取：订单金额
	 */
	public Integer getDingdanjine() {
		return dingdanjine;
	}
				
	
	/**
	 * 设置：采购日期
	 */
	 
	public void setCaigouriqi(Date caigouriqi) {
		this.caigouriqi = caigouriqi;
	}
	
	/**
	 * 获取：采购日期
	 */
	public Date getCaigouriqi() {
		return caigouriqi;
	}
				
	
	/**
	 * 设置：采购备注
	 */
	 
	public void setCaigoubeizhu(String caigoubeizhu) {
		this.caigoubeizhu = caigoubeizhu;
	}
	
	/**
	 * 获取：采购备注
	 */
	public String getCaigoubeizhu() {
		return caigoubeizhu;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
