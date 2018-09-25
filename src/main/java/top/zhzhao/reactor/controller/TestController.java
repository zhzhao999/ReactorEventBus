package top.zhzhao.reactor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zhzhao.reactor.service.TestService;

/**
 * @Author zhzhao
 * @Date 2018/9/22 17:55
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        testService.test();
        return "请求开始";
    }
}
