package com.example.productserver.sys.service.impl;

import com.example.productserver.sys.entity.Product;
import com.example.productserver.sys.mapper.ProductMapper;
import com.example.productserver.sys.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author wangdh
 * @since 2020-12-16
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
