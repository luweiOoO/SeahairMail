package com.luwei.seahairmail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luwei.common.utils.PageUtils;
import com.luwei.seahairmail.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * ��Ա�ȼ�
 *
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-10 09:59:35
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

