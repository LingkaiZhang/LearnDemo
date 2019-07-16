package JavaSrc.建造者模式;

public class Test {
    public static void main(String[] args) {

        System.out.println(getStudent());

        Teacher teacher = new Teacher().setAge(26).setName("张三");
        System.out.println(teacher.toString());

    }

    private static Student getStudent() {
        return new Student.StudentBuilder(1,"xiaoming")
                .setAge(18)
                .setGender(3)
                .build();
    }
}
