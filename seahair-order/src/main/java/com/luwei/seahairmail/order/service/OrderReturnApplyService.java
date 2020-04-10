package com.luwei.seahairmail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * �����˻�����
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:54:26
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

