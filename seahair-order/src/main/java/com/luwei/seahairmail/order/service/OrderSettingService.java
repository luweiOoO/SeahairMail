package com.luwei.seahairmail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * ����������Ϣ
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:54:26
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

