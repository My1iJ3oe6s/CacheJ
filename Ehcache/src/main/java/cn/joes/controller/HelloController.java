package cn.joes.controller;

import cn.joes.domain.City;
import cn.joes.service.CityService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by myijoes on 2018/12/6.
 *
 * @author wanqiao
 */
@RestController
public class HelloController {

    @Autowired
    CityService cityService;

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String findOneCity() throws JsonProcessingException {
        City city = cityService.findCity();
        ObjectMapper mapper = new ObjectMapper();
        String cityString = mapper.writeValueAsString(city);
        return cityString;
    }


}
