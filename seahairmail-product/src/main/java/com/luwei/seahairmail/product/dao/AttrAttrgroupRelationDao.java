package com.luwei.seahairmail.product.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luwei.seahairmail.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ����&���Է������
 * 
 * @author luwei
 * @email 771608610@qq.com
 * @date 2020-04-09 13:26:18
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {
    public List<AttrAttrgroupRelationEntity> getAll(Page<AttrAttrgroupRelationEntity> page,AttrAttrgroupRelationEntity entity);
}
