package com.luwei.seahairmail.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.order.dao.OrderReturnApplyDao;
import com.luwei.seahairmail.order.entity.OrderReturnApplyEntity;
import com.luwei.seahairmail.order.service.OrderReturnApplyService;


@Service("orderReturnApplyService")
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyDao, OrderReturnApplyEntity> implements OrderReturnApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
    }

}