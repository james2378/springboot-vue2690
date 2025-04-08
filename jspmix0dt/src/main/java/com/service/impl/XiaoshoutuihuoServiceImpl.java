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


import com.dao.XiaoshoutuihuoDao;
import com.entity.XiaoshoutuihuoEntity;
import com.service.XiaoshoutuihuoService;
import com.entity.vo.XiaoshoutuihuoVO;
import com.entity.view.XiaoshoutuihuoView;

@Service("xiaoshoutuihuoService")
public class XiaoshoutuihuoServiceImpl extends ServiceImpl<XiaoshoutuihuoDao, XiaoshoutuihuoEntity> implements XiaoshoutuihuoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoshoutuihuoEntity> page = this.selectPage(
                new Query<XiaoshoutuihuoEntity>(params).getPage(),
                new EntityWrapper<XiaoshoutuihuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoshoutuihuoEntity> wrapper) {
		  Page<XiaoshoutuihuoView> page =new Query<XiaoshoutuihuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoshoutuihuoVO> selectListVO(Wrapper<XiaoshoutuihuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoshoutuihuoVO selectVO(Wrapper<XiaoshoutuihuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoshoutuihuoView> selectListView(Wrapper<XiaoshoutuihuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoshoutuihuoView selectView(Wrapper<XiaoshoutuihuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<XiaoshoutuihuoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<XiaoshoutuihuoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }
    
    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<XiaoshoutuihuoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
