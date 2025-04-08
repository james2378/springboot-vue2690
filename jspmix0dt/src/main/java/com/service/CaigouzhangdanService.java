package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaigouzhangdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaigouzhangdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaigouzhangdanView;


/**
 * 采购账单
 *
 * @author 
 * @email 
 * @date 2022-02-17 10:52:40
 */
public interface CaigouzhangdanService extends IService<CaigouzhangdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaigouzhangdanVO> selectListVO(Wrapper<CaigouzhangdanEntity> wrapper);
   	
   	CaigouzhangdanVO selectVO(@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
   	
   	List<CaigouzhangdanView> selectListView(Wrapper<CaigouzhangdanEntity> wrapper);
   	
   	CaigouzhangdanView selectView(@Param("ew") Wrapper<CaigouzhangdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaigouzhangdanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CaigouzhangdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CaigouzhangdanEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CaigouzhangdanEntity> wrapper);
}

