package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.AttrGroupDao;
import com.luwei.seahairmail.product.entity.AttrGroupEntity;
import com.luwei.seahairmail.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<AttrGroupEntity> page = this.page(
//                new Query<AttrGroupEntity>().getPage(params),
//                new QueryWrapper<AttrGroupEntity>()
//        );
//
//        return new PageUtils(page.getRecords(),(int)page.getTotal(),(int)page.getSize(),(int)page.getCurrent());
    }


}