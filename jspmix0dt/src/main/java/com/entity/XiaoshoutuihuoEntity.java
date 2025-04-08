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
 * 销售退货
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
@TableName("xiaoshoutuihuo")
public class XiaoshoutuihuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoshoutuihuoEntity() {
		
	}
	
	public XiaoshoutuihuoEntity(T t) {
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
	 * 退货单号
	 */
					
	private String tuihuodanhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tuihuoriqi;
	
	/**
	 * 退货备注
	 */
					
	private String tuihuobeizhu;
	
	
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
	 * 设置：退货单号
	 */
	public void setTuihuodanhao(String tuihuodanhao) {
		this.tuihuodanhao = tuihuodanhao;
	}
	/**
	 * 获取：退货单号
	 */
	public String getTuihuodanhao() {
		return tuihuodanhao;
	}
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
