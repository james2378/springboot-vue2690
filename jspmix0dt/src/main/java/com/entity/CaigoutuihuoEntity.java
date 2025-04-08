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
 * 采购退货
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
@TableName("caigoutuihuo")
public class CaigoutuihuoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CaigoutuihuoEntity() {
		
	}
	
	public CaigoutuihuoEntity(T t) {
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
	 * 退货金额
	 */
					
	private Integer tuihuojine;
	
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
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	
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
