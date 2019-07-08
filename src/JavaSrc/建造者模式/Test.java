package JavaSrc.建造者模式;

public class Test {
    public static void main(String[] args) {

        System.out.println(getStudent());

    }

    private static Student getStudent() {
        return new Student.StudentBuilder(1,"xiaoming")
                .setAge(125)
                .setGender(3)
                .build();
    }
}
