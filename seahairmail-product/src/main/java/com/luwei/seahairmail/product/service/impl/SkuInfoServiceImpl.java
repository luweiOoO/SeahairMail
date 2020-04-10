package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.SkuInfoDao;
import com.luwei.seahairmail.product.entity.SkuInfoEntity;
import com.luwei.seahairmail.product.service.SkuInfoService;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<SkuInfoEntity> page = this.page(
//                new Query<SkuInfoEntity>().getPage(params),
//                new QueryWrapper<SkuInfoEntity>()
//        );
//
//        return new PageUtils(page);
    }

}