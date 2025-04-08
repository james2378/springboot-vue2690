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


import com.dao.JiajufenleiDao;
import com.entity.JiajufenleiEntity;
import com.service.JiajufenleiService;
import com.entity.vo.JiajufenleiVO;
import com.entity.view.JiajufenleiView;

@Service("jiajufenleiService")
public class JiajufenleiServiceImpl extends ServiceImpl<JiajufenleiDao, JiajufenleiEntity> implements JiajufenleiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiajufenleiEntity> page = this.selectPage(
                new Query<JiajufenleiEntity>(params).getPage(),
                new EntityWrapper<JiajufenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiajufenleiEntity> wrapper) {
		  Page<JiajufenleiView> page =new Query<JiajufenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiajufenleiVO> selectListVO(Wrapper<JiajufenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiajufenleiVO selectVO(Wrapper<JiajufenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiajufenleiView> selectListView(Wrapper<JiajufenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiajufenleiView selectView(Wrapper<JiajufenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
