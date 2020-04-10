package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.CategoryBrandRelationDao;
import com.luwei.seahairmail.product.entity.CategoryBrandRelationEntity;
import com.luwei.seahairmail.product.service.CategoryBrandRelationService;


@Service("categoryBrandRelationService")
public class CategoryBrandRelationServiceImpl extends ServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity> implements CategoryBrandRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<CategoryBrandRelationEntity> page = this.page(
//                new Query<CategoryBrandRelationEntity>().getPage(params),
//                new QueryWrapper<CategoryBrandRelationEntity>()
//        );
//
//        return new PageUtils(page);
    }

}