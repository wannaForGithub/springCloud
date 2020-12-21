package com.example.userserver.sys.mapper;

import com.example.userserver.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author wangdh
 * @since 2020-12-15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
