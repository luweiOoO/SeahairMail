package com.luwei.seahairmail.product;

import com.luwei.seahairmail.product.entity.BrandEntity;
import com.luwei.seahairmail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeahairmailProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("hahaha");
        brandService.updateById(brandEntity);
    }

}
