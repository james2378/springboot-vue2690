package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajufenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiajufenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajufenleiView;


/**
 * 家具分类
 *
 * @author 
 * @email 
 * @date 2022-02-17 10:52:39
 */
public interface JiajufenleiService extends IService<JiajufenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiajufenleiVO> selectListVO(Wrapper<JiajufenleiEntity> wrapper);
   	
   	JiajufenleiVO selectVO(@Param("ew") Wrapper<JiajufenleiEntity> wrapper);
   	
   	List<JiajufenleiView> selectListView(Wrapper<JiajufenleiEntity> wrapper);
   	
   	JiajufenleiView selectView(@Param("ew") Wrapper<JiajufenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiajufenleiEntity> wrapper);
   	

}

