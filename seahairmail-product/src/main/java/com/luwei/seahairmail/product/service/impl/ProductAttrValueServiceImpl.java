package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.ProductAttrValueDao;
import com.luwei.seahairmail.product.entity.ProductAttrValueEntity;
import com.luwei.seahairmail.product.service.ProductAttrValueService;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity> implements ProductAttrValueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<ProductAttrValueEntity> page = this.page(
//                new Query<ProductAttrValueEntity>().getPage(params),
//                new QueryWrapper<ProductAttrValueEntity>()
//        );
//
//        return new PageUtils(page);
    }

}