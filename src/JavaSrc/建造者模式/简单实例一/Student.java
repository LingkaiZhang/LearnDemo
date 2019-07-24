package JavaSrc.建造者模式.简单实例一;

public class Student {
    private final int stuId;  //必须
    private final String name;      //必须
    private final int age;      //可选
    private final int gender;       //可选
    private final String address;   //可选


    private Student(StudentBuilder studentBuilder) {
        this.stuId = studentBuilder.stuId;
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
        this.address = studentBuilder.address;
    }

    public int getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                '}';
    }

    public static class StudentBuilder{
        private final int stuId;  //必须
        private final String name;      //必须
        private int age;      //可选
        private int gender;       //可选
        private  String address;   //可选

        public StudentBuilder(int stuId, String name) {
            this.stuId = stuId;
            this.name = name;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setGender(int gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            Student student = new Student(this);
            if (student.getAge() > 120) {
                throw  new IllegalStateException("年龄超出限制。");
            }
            return student;
        }
    }
}
