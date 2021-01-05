package com.aitlp.common.core.exception.user;

import com.aitlp.common.core.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author Winbert
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
