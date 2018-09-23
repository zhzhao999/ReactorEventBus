package top.zhzhao.reactor.EventBus;

import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.fn.Consumer;

/**
 * 事件订阅者（接收者,监听者）
 * @Author zhzhao
 * @Date 2018/9/23 12:33
 */
@Service
public class MySubscriber implements Consumer<Event<EventBean>> {
    @Override
    public void accept(Event<EventBean> integerEvent) {
        System.out.println("接收者---接收到---：" + integerEvent.getData());
    }
}
