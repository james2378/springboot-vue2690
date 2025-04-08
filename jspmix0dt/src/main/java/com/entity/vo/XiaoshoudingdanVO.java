package com.entity.vo;

import com.entity.XiaoshoudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 销售订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public class XiaoshoudingdanVO  implements Serializable {
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
	 * 销售价格
	 */
	
	private Integer xiaoshoujiage;
		
	/**
	 * 家具数量
	 */
	
	private Integer jiajushuliang;
		
	/**
	 * 销售金额
	 */
	
	private Integer xiaoshoujine;
		
	/**
	 * 客户姓名
	 */
	
	private String kehuxingming;
		
	/**
	 * 客户类型
	 */
	
	private String kehuleixing;
		
	/**
	 * 客户电话
	 */
	
	private String kehudianhua;
		
	/**
	 * 销售日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiaoshouriqi;
		
	/**
	 * 信息备注
	 */
	
	private String xinxibeizhu;
				
	
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
	 * 设置：销售金额
	 */
	 
	public void setXiaoshoujine(Integer xiaoshoujine) {
		this.xiaoshoujine = xiaoshoujine;
	}
	
	/**
	 * 获取：销售金额
	 */
	public Integer getXiaoshoujine() {
		return xiaoshoujine;
	}
				
	
	/**
	 * 设置：客户姓名
	 */
	 
	public void setKehuxingming(String kehuxingming) {
		this.kehuxingming = kehuxingming;
	}
	
	/**
	 * 获取：客户姓名
	 */
	public String getKehuxingming() {
		return kehuxingming;
	}
				
	
	/**
	 * 设置：客户类型
	 */
	 
	public void setKehuleixing(String kehuleixing) {
		this.kehuleixing = kehuleixing;
	}
	
	/**
	 * 获取：客户类型
	 */
	public String getKehuleixing() {
		return kehuleixing;
	}
				
	
	/**
	 * 设置：客户电话
	 */
	 
	public void setKehudianhua(String kehudianhua) {
		this.kehudianhua = kehudianhua;
	}
	
	/**
	 * 获取：客户电话
	 */
	public String getKehudianhua() {
		return kehudianhua;
	}
				
	
	/**
	 * 设置：销售日期
	 */
	 
	public void setXiaoshouriqi(Date xiaoshouriqi) {
		this.xiaoshouriqi = xiaoshouriqi;
	}
	
	/**
	 * 获取：销售日期
	 */
	public Date getXiaoshouriqi() {
		return xiaoshouriqi;
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
			
}
