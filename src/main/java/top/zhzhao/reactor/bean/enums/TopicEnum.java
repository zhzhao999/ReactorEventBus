/**
 * https://www.zhzhao.top
 */
package top.zhzhao.reactor.bean.enums;

/**
 * 消息主题-枚举
 *@author zhzhao
 *@version $ Id: TopicEnum.java,V 0.1 2018/9/25 11:09 zhzhao Exp $
 */
public enum TopicEnum {
    AAA("testA","A类型"),
    BBB("testB","B类型");

    private final String code;
    private final String desc;

    TopicEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据code获取当前枚举类型
     * @return
     */
    public static TopicEnum getByCode(String code){
        for (TopicEnum e: TopicEnum.values()){
            if (e.code.equalsIgnoreCase(code.trim())){
                return e;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
