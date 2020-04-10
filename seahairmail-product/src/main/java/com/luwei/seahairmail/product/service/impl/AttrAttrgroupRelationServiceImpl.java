package com.luwei.seahairmail.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.AttrAttrgroupRelationDao;
import com.luwei.seahairmail.product.entity.AttrAttrgroupRelationEntity;
import com.luwei.seahairmail.product.service.AttrAttrgroupRelationService;

@Slf4j
@Service
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelationEntity> implements AttrAttrgroupRelationService {

    @Autowired
    private AttrAttrgroupRelationDao attrgroupRelationDao;

//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<AttrAttrgroupRelationEntity> page = this.page(
//                new Query<AttrAttrgroupRelationEntity>().getPage(params),
//                new QueryWrapper<AttrAttrgroupRelationEntity>()
//        );
//
//        return new PageUtils(page);
//    }
    @Autowired
    private AttrAttrgroupRelationService iService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        int pageSize = (int)(params.get("pageSize"));
        int pageNum = (int)(params.get("pageNum"));

        Page<AttrAttrgroupRelationEntity> page = new Page<>(pageSize,pageNum);
        AttrAttrgroupRelationEntity entity = new AttrAttrgroupRelationEntity();
        QueryWrapper<AttrAttrgroupRelationEntity> queryWrapper = new QueryWrapper<>();

        List<AttrAttrgroupRelationEntity> list = attrgroupRelationDao.getAll(page,entity);
       page.setRecords(list);
        IPage<AttrAttrgroupRelationEntity> result = iService.page(page,queryWrapper);
        return new PageUtils(result.getRecords(),1,1,1);

//        AttrAttrgroupRelationEntity entity = (AttrAttrgroupRelationEntity)params.get("entity");
//
//        QueryWrapper<AttrAttrgroupRelationEntity> queryWrapper = new QueryWrapper<>();
//        IPage<AttrAttrgroupRelationEntity> iPage = new Page<>(1,1);
//        iPage.setSize(pageSize);
//        iPage.setCurrent(pageNum);
//        List<AttrAttrgroupRelationEntity> listAll = attrgroupRelationDao.selectPage(queryWrapper);
//        iPage.setRecords(listAll);
//        IPage<AttrAttrgroupRelationEntity> list = attrgroupRelationDao.selectPage(iPage,queryWrapper);
//        log.info("fenye--------------------------->{}",list.getRecords());
//        return new PageUtils(list.getRecords(),(int)list
//                .getTotal(),pageSize,pageNum);
    }

}