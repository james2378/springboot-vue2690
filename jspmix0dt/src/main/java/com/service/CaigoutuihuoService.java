package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigoutuihuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigoutuihuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigoutuihuoView;


/**
 * 采购退货
 *
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public interface CaigoutuihuoService extends IService<CaigoutuihuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigoutuihuoVO> selectListVO(Wrapper<CaigoutuihuoEntity> wrapper);
   	
   	CaigoutuihuoVO selectVO(@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
   	
   	List<CaigoutuihuoView> selectListView(Wrapper<CaigoutuihuoEntity> wrapper);
   	
   	CaigoutuihuoView selectView(@Param("ew") Wrapper<CaigoutuihuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigoutuihuoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CaigoutuihuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CaigoutuihuoEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CaigoutuihuoEntity> wrapper);
}

