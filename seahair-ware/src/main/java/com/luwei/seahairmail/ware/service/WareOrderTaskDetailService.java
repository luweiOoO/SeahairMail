package com.luwei.seahairmail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * ��湤����
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:41:22
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

