package top.zhzhao.reactor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.bus.EventBus;
import top.zhzhao.reactor.bean.CommonEvent;
import top.zhzhao.reactor.bean.Person;
import top.zhzhao.reactor.bean.enums.TopicEnum;

/**
 * @Author zhzhao
 * @Date 2018/9/23 14:37
 */
@Service
public class TestService {
    @Autowired
    private EventBus eventBus;

    public void test(){
        CommonEvent eventBean = new CommonEvent(TopicEnum.AAA.getCode());
        eventBean.getProperties().setProperty("woca","wocaca");
        eventBean.setPayload(new Person("Jim","18"));
        //发送通知
        eventBus.notify(TopicEnum.AAA.getCode(), Event.wrap(eventBean));
        System.out.println("当前时间:"+System.currentTimeMillis());
    }

}
