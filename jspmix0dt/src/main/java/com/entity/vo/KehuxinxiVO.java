package com.entity.vo;

import com.entity.KehuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 客户信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
public class KehuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户类型
	 */
	
	private String kehuleixing;
		
	/**
	 * 客户电话
	 */
	
	private String kehudianhua;
		
	/**
	 * 联系邮箱
	 */
	
	private String lianxiyouxiang;
		
	/**
	 * 收货地址
	 */
	
	private String shouhuodizhi;
				
	
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
	 * 设置：联系邮箱
	 */
	 
	public void setLianxiyouxiang(String lianxiyouxiang) {
		this.lianxiyouxiang = lianxiyouxiang;
	}
	
	/**
	 * 获取：联系邮箱
	 */
	public String getLianxiyouxiang() {
		return lianxiyouxiang;
	}
				
	
	/**
	 * 设置：收货地址
	 */
	 
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
			
}
