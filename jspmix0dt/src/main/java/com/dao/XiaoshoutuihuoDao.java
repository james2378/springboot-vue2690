package com.dao;

import com.entity.XiaoshoutuihuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshoutuihuoVO;
import com.entity.view.XiaoshoutuihuoView;


/**
 * 销售退货
 * 
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public interface XiaoshoutuihuoDao extends BaseMapper<XiaoshoutuihuoEntity> {
	
	List<XiaoshoutuihuoVO> selectListVO(@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
	
	XiaoshoutuihuoVO selectVO(@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
	
	List<XiaoshoutuihuoView> selectListView(@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);

	List<XiaoshoutuihuoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
	
	XiaoshoutuihuoView selectView(@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<XiaoshoutuihuoEntity> wrapper);
}
