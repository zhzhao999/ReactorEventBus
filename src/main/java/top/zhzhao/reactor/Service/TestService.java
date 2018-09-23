package top.zhzhao.reactor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.bus.EventBus;
import top.zhzhao.reactor.EventBus.EventBean;

/**
 * @Author zhzhao
 * @Date 2018/9/23 14:37
 */
@Service
public class TestService {
    @Autowired
    private EventBus eventBus;

    public void test(){
        EventBean eventBean = new EventBean();
        eventBean.setName("Jim");
        eventBean.setAge("18");
        eventBus.notify("eventHandler", Event.wrap(eventBean));
    }

}
