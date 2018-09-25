/**
 * https://www.zhzhao.top
 */
package top.zhzhao.reactor.eventbus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.EventBus;
import top.zhzhao.reactor.eventbus.subscriber.AbstractSubscriber;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static reactor.bus.selector.Selectors.$;

/**
 * 消息绑定的容器(屏蔽订阅者的具体实现)
 *@author zhzhao
 *@version $ Id: MessageBindingContainer.java,V 0.1 2018/9/25 15:34 zhzhao Exp $
 */
@Service
public class MessageBindingContainer {
    private final static Map<String,Map<String,AbstractSubscriber>> SUBSCRIBERS = new ConcurrentHashMap<>();
    protected static EventBus EVENT_BUS;

    @Autowired
    public MessageBindingContainer(EventBus eventBus){
        EVENT_BUS = eventBus;
    }

    /**
     * 消息注册
     */
    public static synchronized void locaRegister(AbstractSubscriber subscriber){
        if (SUBSCRIBERS.containsKey(subscriber.topic)){
            SUBSCRIBERS.get(subscriber.topic).put(subscriber.subscriberName,subscriber);
        }else {
            Map<String,AbstractSubscriber> subscribers = new ConcurrentHashMap<>();
            subscribers.put(subscriber.subscriberName,subscriber);
            SUBSCRIBERS.put(subscriber.topic,subscribers);
        }
        EVENT_BUS.on($(subscriber.topic), subscriber);
    }
}
