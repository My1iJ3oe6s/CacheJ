package cn.joes.service;

import cn.joes.domain.City;
import org.springframework.stereotype.Component;

/**
 * Created by myijoes on 2019/4/19.
 *
 * @author wanqiao
 */
@Component
public interface CityService {

    City findCity();

}
