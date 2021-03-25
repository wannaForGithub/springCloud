package com.example.productserver.sys.mapper;

import com.example.productserver.sys.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品表 Mapper 接口
 * </p>
 *
 * @author wangdh
 * @since 2020-12-16
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
