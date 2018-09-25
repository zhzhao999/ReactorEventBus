package top.zhzhao.reactor.bean;

import java.util.Date;
import java.util.Properties;
import java.util.UUID;

/**
 * 事件实体
 * @Author zhzhao
 * @Date 2018/9/23 12:38
 */
public class CommonEvent extends ToString{
    private String eventId = UUID.randomUUID().toString();
    private String topic;
    private Object payload;//负载对象
    private Properties properties = new Properties();//其他参数
    private Date gmtOccur;

    public CommonEvent() {
    }

    public CommonEvent(String topic) {
        this.topic = topic;
        this.gmtOccur = new Date();
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Date getGmtOccur() {
        return gmtOccur;
    }

    public void setGmtOccur(Date gmtOccur) {
        this.gmtOccur = gmtOccur;
    }
}
