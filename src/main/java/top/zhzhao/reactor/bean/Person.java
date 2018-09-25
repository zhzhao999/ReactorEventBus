/**
 * https://www.zhzhao.top
 */
package top.zhzhao.reactor.bean;

/**
 *
 *@author zhzhao
 *@version $ Id: Person.java,V 0.1 2018/9/25 14:48 zhzhao Exp $
 */
public class Person extends ToString {
    private String name;
    private String age;

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

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
}
