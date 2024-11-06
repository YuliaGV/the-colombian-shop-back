package com.yuliagv.the_colombian_shop_back.dao;

import com.yuliagv.the_colombian_shop_back.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository  extends JpaRepository<Product, Long> {
}
