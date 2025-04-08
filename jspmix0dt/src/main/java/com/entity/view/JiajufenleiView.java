package com.entity.view;

import com.entity.JiajufenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家具分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
@TableName("jiajufenlei")
public class JiajufenleiView  extends JiajufenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiajufenleiView(){
	}
 
 	public JiajufenleiView(JiajufenleiEntity jiajufenleiEntity){
 	try {
			BeanUtils.copyProperties(this, jiajufenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
