package com.entity.model;

import com.entity.XiaoshoutuihuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 销售退货
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public class XiaoshoutuihuoModel  implements Serializable {
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
	 * 退货金额
	 */
	
	private Integer tuihuojine;
		
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
	 * 退货日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuihuoriqi;
		
	/**
	 * 退货备注
	 */
	
	private String tuihuobeizhu;
				
	
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
	 * 设置：退货金额
	 */
	 
	public void setTuihuojine(Integer tuihuojine) {
		this.tuihuojine = tuihuojine;
	}
	
	/**
	 * 获取：退货金额
	 */
	public Integer getTuihuojine() {
		return tuihuojine;
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
	 * 设置：退货日期
	 */
	 
	public void setTuihuoriqi(Date tuihuoriqi) {
		this.tuihuoriqi = tuihuoriqi;
	}
	
	/**
	 * 获取：退货日期
	 */
	public Date getTuihuoriqi() {
		return tuihuoriqi;
	}
				
	
	/**
	 * 设置：退货备注
	 */
	 
	public void setTuihuobeizhu(String tuihuobeizhu) {
		this.tuihuobeizhu = tuihuobeizhu;
	}
	
	/**
	 * 获取：退货备注
	 */
	public String getTuihuobeizhu() {
		return tuihuobeizhu;
	}
			
}
