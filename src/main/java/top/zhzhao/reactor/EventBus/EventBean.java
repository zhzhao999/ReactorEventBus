package top.zhzhao.reactor.EventBus;

/**
 * 事件实体
 * @Author zhzhao
 * @Date 2018/9/23 12:38
 */
public class EventBean {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EventBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
