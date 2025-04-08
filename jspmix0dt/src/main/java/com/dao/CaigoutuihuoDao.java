package com.dao;

import com.entity.CaigoutuihuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigoutuihuoVO;
import com.entity.view.CaigoutuihuoView;


/**
 * 采购退货
 * 
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public interface CaigoutuihuoDao extends BaseMapper<CaigoutuihuoEntity> {
	
	List<CaigoutuihuoVO> selectListVO(@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
	
	CaigoutuihuoVO selectVO(@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
	
	List<CaigoutuihuoView> selectListView(@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);

	List<CaigoutuihuoView> selectListView(Pagination page,@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
	
	CaigoutuihuoView selectView(@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
}
