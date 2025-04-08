package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshoutuihuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshoutuihuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshoutuihuoView;


/**
 * 销售退货
 *
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public interface XiaoshoutuihuoService extends IService<XiaoshoutuihuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshoutuihuoVO> selectListVO(Wrapper<XiaoshoutuihuoEntity> wrapper);
   	
   	XiaoshoutuihuoVO selectVO(@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
   	
   	List<XiaoshoutuihuoView> selectListView(Wrapper<XiaoshoutuihuoEntity> wrapper);
   	
   	XiaoshoutuihuoView selectView(@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshoutuihuoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<XiaoshoutuihuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<XiaoshoutuihuoEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<XiaoshoutuihuoEntity> wrapper);
}

