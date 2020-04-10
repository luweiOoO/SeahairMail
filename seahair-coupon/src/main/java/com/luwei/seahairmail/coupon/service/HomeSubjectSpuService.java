package com.luwei.seahairmail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * ר����Ʒ
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:30:18
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

