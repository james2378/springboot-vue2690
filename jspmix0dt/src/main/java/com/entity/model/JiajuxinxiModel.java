package com.entity.model;

import com.entity.JiajuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 家具信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
public class JiajuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 家具材料
	 */
	
	private String jiajucailiao;
		
	/**
	 * 家具产地
	 */
	
	private String jiajuchandi;
		
	/**
	 * 家具品牌
	 */
	
	private String jiajupinpai;
		
	/**
	 * 采购价格
	 */
	
	private Integer caigoujiage;
		
	/**
	 * 销售价格
	 */
	
	private Integer xiaoshoujiage;
		
	/**
	 * 家具数量
	 */
	
	private Integer jiajushuliang;
		
	/**
	 * 信息备注
	 */
	
	private String xinxibeizhu;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
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
	 * 设置：家具材料
	 */
	 
	public void setJiajucailiao(String jiajucailiao) {
		this.jiajucailiao = jiajucailiao;
	}
	
	/**
	 * 获取：家具材料
	 */
	public String getJiajucailiao() {
		return jiajucailiao;
	}
				
	
	/**
	 * 设置：家具产地
	 */
	 
	public void setJiajuchandi(String jiajuchandi) {
		this.jiajuchandi = jiajuchandi;
	}
	
	/**
	 * 获取：家具产地
	 */
	public String getJiajuchandi() {
		return jiajuchandi;
	}
				
	
	/**
	 * 设置：家具品牌
	 */
	 
	public void setJiajupinpai(String jiajupinpai) {
		this.jiajupinpai = jiajupinpai;
	}
	
	/**
	 * 获取：家具品牌
	 */
	public String getJiajupinpai() {
		return jiajupinpai;
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
	 * 设置：销售价格
	 */
	 
	public void setXiaoshoujiage(Integer xiaoshoujiage) {
		this.xiaoshoujiage = xiaoshoujiage;
	}
	
	/**
	 * 获取：销售价格
	 */
	public Integer getXiaoshoujiage() {
		return xiaoshoujiage;
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
	 * 设置：信息备注
	 */
	 
	public void setXinxibeizhu(String xinxibeizhu) {
		this.xinxibeizhu = xinxibeizhu;
	}
	
	/**
	 * 获取：信息备注
	 */
	public String getXinxibeizhu() {
		return xinxibeizhu;
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
