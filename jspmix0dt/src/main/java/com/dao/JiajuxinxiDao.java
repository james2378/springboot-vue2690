package com.dao;

import com.entity.JiajuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiajuxinxiVO;
import com.entity.view.JiajuxinxiView;


/**
 * 家具信息
 * 
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
public interface JiajuxinxiDao extends BaseMapper<JiajuxinxiEntity> {
	
	List<JiajuxinxiVO> selectListVO(@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
	
	JiajuxinxiVO selectVO(@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
	
	List<JiajuxinxiView> selectListView(@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);

	List<JiajuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
	
	JiajuxinxiView selectView(@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
}
