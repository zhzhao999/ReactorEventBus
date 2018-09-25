/**
 * https://www.zhzhao.top
 */
package top.zhzhao.reactor.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * toString工具类
 *@author zhzhao
 *@version $ Id: ToString.java,V 0.1 2018/9/25 10:56 zhzhao Exp $
 */
public class ToString implements Serializable {
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
