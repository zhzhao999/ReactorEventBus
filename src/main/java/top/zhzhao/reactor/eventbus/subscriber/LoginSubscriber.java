package top.zhzhao.reactor.eventbus.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.bus.Event;
import reactor.fn.Consumer;
import top.zhzhao.reactor.bean.CommonEvent;
import top.zhzhao.reactor.bean.enums.TopicEnum;
import top.zhzhao.reactor.eventbus.MessageBindingContainer;

/**
 * 登录订阅
 * @Author zhzhao
 * @Date 2018/9/23 12:33
 */
@Service
public class LoginSubscriber extends AbstractSubscriber {

    /**
     * 消息注册
     * @param messageBindingContainer
     */
    public LoginSubscriber(MessageBindingContainer messageBindingContainer) {
        super(messageBindingContainer, TopicEnum.AAA.getCode(), "LoginSubscriber");
    }

    @Override
    public void onReceived(CommonEvent commonEvent) {
        // 逻辑处理
        // ...
        System.out.println("登录订阅---：" + commonEvent);
    }
}
