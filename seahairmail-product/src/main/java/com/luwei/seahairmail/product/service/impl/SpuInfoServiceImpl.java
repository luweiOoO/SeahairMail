package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.SpuInfoDao;
import com.luwei.seahairmail.product.entity.SpuInfoEntity;
import com.luwei.seahairmail.product.service.SpuInfoService;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<SpuInfoEntity> page = this.page(
//                new Query<SpuInfoEntity>().getPage(params),
//                new QueryWrapper<SpuInfoEntity>()
//        );
//
//        return new PageUtils(page);
    }

}