package com.luwei.seahairmail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ��ҳר����jd��ҳ����ܶ�ר�⣬ÿ��ר�������µ�ҳ�棬չʾר����Ʒ��Ϣ��
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:30:18
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

