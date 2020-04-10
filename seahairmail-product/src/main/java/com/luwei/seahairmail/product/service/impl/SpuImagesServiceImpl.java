package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.SpuImagesDao;
import com.luwei.seahairmail.product.entity.SpuImagesEntity;
import com.luwei.seahairmail.product.service.SpuImagesService;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<SpuImagesEntity> page = this.page(
//                new Query<SpuImagesEntity>().getPage(params),
//                new QueryWrapper<SpuImagesEntity>()
//        );
//
//        return new PageUtils(page);
    }

}