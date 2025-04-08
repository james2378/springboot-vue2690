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


import com.dao.CaigoutuihuoDao;
import com.entity.CaigoutuihuoEntity;
import com.service.CaigoutuihuoService;
import com.entity.vo.CaigoutuihuoVO;
import com.entity.view.CaigoutuihuoView;

@Service("caigoutuihuoService")
public class CaigoutuihuoServiceImpl extends ServiceImpl<CaigoutuihuoDao, CaigoutuihuoEntity> implements CaigoutuihuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaigoutuihuoEntity> page = this.selectPage(
                new Query<CaigoutuihuoEntity>(params).getPage(),
                new EntityWrapper<CaigoutuihuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaigoutuihuoEntity> wrapper) {
		  Page<CaigoutuihuoView> page =new Query<CaigoutuihuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaigoutuihuoVO> selectListVO(Wrapper<CaigoutuihuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaigoutuihuoVO selectVO(Wrapper<CaigoutuihuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaigoutuihuoView> selectListView(Wrapper<CaigoutuihuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaigoutuihuoView selectView(Wrapper<CaigoutuihuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CaigoutuihuoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CaigoutuihuoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CaigoutuihuoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
