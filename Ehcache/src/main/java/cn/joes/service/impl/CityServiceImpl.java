package cn.joes.service.impl;

import cn.joes.domain.City;
import cn.joes.service.CityService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by myijoes on 2019/4/19.
 *
 * @author wanqiao
 */
@Service
public class CityServiceImpl implements CityService{

    @Override
    @Cacheable(value="city")
    public City findCity() {
        System.out.println("1111111111111111111111111");
        City city = new City();
        city.setId(40018L);
        city.setCityName("武汉");
        city.setDescription("千湖之城");
        city.setProvinceId(10008L);
        return city;
    }
}
