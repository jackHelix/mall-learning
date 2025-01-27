package com.macro.mall.tiny.service;

import com.macro.mall.tiny.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by macro on 2018/8/3.
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);


    /**
     *生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateVerifyCode(String telephone);

    /**
     * 判断手机号和验证码是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyCode(String telephone, String authCode);
}
