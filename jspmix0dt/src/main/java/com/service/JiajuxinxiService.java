package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiajuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajuxinxiView;


/**
 * 家具信息
 *
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
public interface JiajuxinxiService extends IService<JiajuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiajuxinxiVO> selectListVO(Wrapper<JiajuxinxiEntity> wrapper);
   	
   	JiajuxinxiVO selectVO(@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
   	
   	List<JiajuxinxiView> selectListView(Wrapper<JiajuxinxiEntity> wrapper);
   	
   	JiajuxinxiView selectView(@Param("ew") Wrapper<JiajuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiajuxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiajuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiajuxinxiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiajuxinxiEntity> wrapper);
}

