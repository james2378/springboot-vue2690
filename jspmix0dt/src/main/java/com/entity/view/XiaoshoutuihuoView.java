package com.entity.view;

import com.entity.XiaoshoutuihuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 销售退货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
@TableName("xiaoshoutuihuo")
public class XiaoshoutuihuoView  extends XiaoshoutuihuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoshoutuihuoView(){
	}
 
 	public XiaoshoutuihuoView(XiaoshoutuihuoEntity xiaoshoutuihuoEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoshoutuihuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
