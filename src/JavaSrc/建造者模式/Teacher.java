package JavaSrc.建造者模式;

/**
 * @Auther: lingkai
 * @Date: 2019/7/13 11:53
 * @Description:  自动生成set/get方法通过建造者模式。
 */
public class Teacher {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Teacher setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
