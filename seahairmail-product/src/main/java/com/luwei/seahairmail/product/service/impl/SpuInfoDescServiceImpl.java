package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.SpuInfoDescDao;
import com.luwei.seahairmail.product.entity.SpuInfoDescEntity;
import com.luwei.seahairmail.product.service.SpuInfoDescService;


@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<SpuInfoDescEntity> page = this.page(
//                new Query<SpuInfoDescEntity>().getPage(params),
//                new QueryWrapper<SpuInfoDescEntity>()
//        );
//
//        return new PageUtils(page);
    }

}