package com.luwei.seahairmail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.order.entity.OrderEntity;

import java.util.Map;

/**
 * ����
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:54:26
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

