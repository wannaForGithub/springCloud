package com.example.userserver.sys.service.impl;

import com.example.userserver.sys.entity.Product;
import com.example.userserver.sys.mapper.ProductMapper;
import com.example.userserver.sys.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author wangdh
 * @since 2020-12-15
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
