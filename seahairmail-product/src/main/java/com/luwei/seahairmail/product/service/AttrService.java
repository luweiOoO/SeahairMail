package com.luwei.seahairmail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.product.entity.AttrEntity;

import java.util.Map;

/**
 * ��Ʒ����
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-09 13:26:18
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

