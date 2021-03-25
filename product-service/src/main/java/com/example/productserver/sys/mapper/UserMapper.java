package com.example.productserver.sys.mapper;

import com.example.productserver.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author wangdh
 * @since 2020-12-16
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
