/**
 * https://www.zhzhao.top
 */
package top.zhzhao.reactor.eventbus.subscriber;

import reactor.bus.Event;
import reactor.fn.Consumer;
import top.zhzhao.reactor.bean.CommonEvent;
import top.zhzhao.reactor.eventbus.MessageBindingContainer;

/**
 *事件订阅者（接收者,监听者）
 *@author zhzhao
 *@version $ Id: AbstractSubscriber.java,V 0.1 2018/9/25 14:53 zhzhao Exp $
 */

public abstract class AbstractSubscriber implements Consumer<Event<CommonEvent>> {

    public final String topic;
    public final String subscriberName;

    public AbstractSubscriber(MessageBindingContainer messageBindingContainer,String topic, String subscriberName) {
        this.topic = topic;
        this.subscriberName = subscriberName;
        messageBindingContainer.locaRegister(this);
    }

    @Override
    public void accept(Event<CommonEvent> event) {
        //进行通用业务逻辑处理
        //...

        CommonEvent eventData = event.getData();
        this.onReceived(eventData);
    }

    public abstract void onReceived(CommonEvent commonEvent);
}
