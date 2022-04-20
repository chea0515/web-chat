package com.ccfond.webchat.core.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ccfond.webchat.core.dao.UserMapper;
import com.ccfond.webchat.core.entity.User;
import com.ccfond.webchat.core.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author chea0515@163.com
 */

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
