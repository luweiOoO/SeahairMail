package com.luwei.seahairmail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * �ֿ���Ϣ
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:41:22
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

