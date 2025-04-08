package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaigouzhangdanDao;
import com.entity.CaigouzhangdanEntity;
import com.service.CaigouzhangdanService;
import com.entity.vo.CaigouzhangdanVO;
import com.entity.view.CaigouzhangdanView;

@Service("caigouzhangdanService")
public class CaigouzhangdanServiceImpl extends ServiceImpl<CaigouzhangdanDao, CaigouzhangdanEntity> implements CaigouzhangdanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigouzhangdanEntity> page = this.selectPage(
                new Query<CaigouzhangdanEntity>(params).getPage(),
                new EntityWrapper<CaigouzhangdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigouzhangdanEntity> wrapper) {
		  Page<CaigouzhangdanView> page =new Query<CaigouzhangdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigouzhangdanVO> selectListVO(Wrapper<CaigouzhangdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigouzhangdanVO selectVO(Wrapper<CaigouzhangdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigouzhangdanView> selectListView(Wrapper<CaigouzhangdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigouzhangdanView selectView(Wrapper<CaigouzhangdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CaigouzhangdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CaigouzhangdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CaigouzhangdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
