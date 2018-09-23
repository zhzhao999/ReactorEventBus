package top.zhzhao.reactor.EventBus;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.EventBus;

import static reactor.bus.selector.Selectors.$;

/**
 * 将发送的事件绑定到指定的监听器
 * @Author zhzhao
 * @Date 2018/9/23 13:06
 */
@Service
public class EventBindingService implements InitializingBean {

    @Autowired
    private MySubscriber subscriber;
    @Autowired
    private EventBus eventBus;

    @Override
    public void afterPropertiesSet() throws Exception {
        eventBus.on($("eventHandler"), subscriber);
    }
}
