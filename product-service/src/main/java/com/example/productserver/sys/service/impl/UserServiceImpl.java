package com.example.productserver.sys.service.impl;

import com.example.productserver.sys.entity.User;
import com.example.productserver.sys.mapper.UserMapper;
import com.example.productserver.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wangdh
 * @since 2020-12-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
