package com.luwei.seahairmail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:41:22
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

