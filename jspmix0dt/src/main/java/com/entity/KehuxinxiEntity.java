package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 客户信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
@TableName("kehuxinxi")
public class KehuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KehuxinxiEntity() {
		
	}
	
	public KehuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 客户名称
	 */
					
	private String kehumingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：客户名称
	 */
	public void setKehumingcheng(String kehumingcheng) {
		this.kehumingcheng = kehumingcheng;
	}
	/**
	 * 获取：客户名称
	 */
	public String getKehumingcheng() {
		return kehumingcheng;
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
