package com.luwei.seahairmail.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luwei.common.utils.PageUtils;
import com.luwei.common.utils.Query;

import com.luwei.seahairmail.product.dao.CommentReplayDao;
import com.luwei.seahairmail.product.entity.CommentReplayEntity;
import com.luwei.seahairmail.product.service.CommentReplayService;


@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplayEntity> implements CommentReplayService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        return null;
//        IPage<CommentReplayEntity> page = this.page(
//                new Query<CommentReplayEntity>().getPage(params),
//                new QueryWrapper<CommentReplayEntity>()
//        );
//
//        return new PageUtils(page);
    }

}