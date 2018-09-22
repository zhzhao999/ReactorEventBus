package top.zhzhao.reactor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhzhao
 * @Date 2018/9/22 17:55
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "请求开始";
    }
}
