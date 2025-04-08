package com.dao;

import com.entity.CaigouzhangdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaigouzhangdanVO;
import com.entity.view.CaigouzhangdanView;


/**
 * 采购账单
 * 
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public interface CaigouzhangdanDao extends BaseMapper<CaigouzhangdanEntity> {
	
	List<CaigouzhangdanVO> selectListVO(@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
	
	CaigouzhangdanVO selectVO(@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
	
	List<CaigouzhangdanView> selectListView(@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);

	List<CaigouzhangdanView> selectListView(Pagination page,@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
	
	CaigouzhangdanView selectView(@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
}
