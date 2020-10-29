package com.ziyin.tongxinmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ziyin.common.utils.PageUtils;
import com.ziyin.tongxinmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ziyin
 * @email ****
 * @date 2020-10-29 21:13:17
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

