package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.SkuImagesDao;
import com.luwei.seahairmail.product.entity.SkuImagesEntity;
import com.luwei.seahairmail.product.service.SkuImagesService;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements SkuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<SkuImagesEntity> page = this.page(
//                new Query<SkuImagesEntity>().getPage(params),
//                new QueryWrapper<SkuImagesEntity>()
//        );
//
//        return new PageUtils(page);
    }

}