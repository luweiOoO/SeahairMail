package com.luwei.seahairmail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * �Ż�ȯ�������
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:30:18
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

