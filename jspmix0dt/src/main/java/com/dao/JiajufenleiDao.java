package com.dao;

import com.entity.JiajufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiajufenleiVO;
import com.entity.view.JiajufenleiView;


/**
 * 家具分类
 * 
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
public interface JiajufenleiDao extends BaseMapper<JiajufenleiEntity> {
	
	List<JiajufenleiVO> selectListVO(@Param("ew") Wrapper<JiajufenleiEntity> wrapper);
	
	JiajufenleiVO selectVO(@Param("ew") Wrapper<JiajufenleiEntity> wrapper);
	
	List<JiajufenleiView> selectListView(@Param("ew") Wrapper<JiajufenleiEntity> wrapper);

	List<JiajufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JiajufenleiEntity> wrapper);
	
	JiajufenleiView selectView(@Param("ew") Wrapper<JiajufenleiEntity> wrapper);
	

}
