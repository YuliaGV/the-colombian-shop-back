package com.yuliagv.the_colombian_shop_back.dao;

import com.yuliagv.the_colombian_shop_back.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path="product_category")
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long>{
}
