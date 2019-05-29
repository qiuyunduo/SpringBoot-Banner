package cn.qyd.webflux.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qyd
 * @Date 19-5-27 下午6:16
 **/
@RestController
public class BookController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object getList() {
        return "Hello World!!!";
    }
}
