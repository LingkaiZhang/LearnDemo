package JavaSrc.建造者模式.Builder模式详解;

/**
 * @Auther: lingkai
 * @Date: 2019/7/24 13:54
 * @Description:
 */
public class TestBuilder {
    public static void main(String[] args) {
        getUser();
    }

    private static User getUser() {
        return new User.UserBuilder("Jaack", "Makie")
                .setmAAge(22).setmGender("三年级").build();
    }
}
