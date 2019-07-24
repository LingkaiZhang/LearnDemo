package JavaSrc.建造者模式.Builder模式详解;

/**
 * @Auther: lingkai
 * @Date: 2019/7/24 13:42
 * @Description:
 */
public class User {
    private final String mFirstName;
    private final String mLastName;
    private final String mGender;
    private final int mAAge;
    private final String mPhonoNo;

    public User(UserBuilder userBuilder) {

        this.mFirstName = userBuilder.mFirstName;
        this.mLastName = userBuilder.mLastName;
        this.mGender = userBuilder.mGender;
        this.mAAge = userBuilder.mAAge;
        this.mPhonoNo = userBuilder.mPhonoNo;


    }

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public String getmGender() {
        return mGender;
    }

    public int getmAAge() {
        return mAAge;
    }

    public String getmPhonoNo() {
        return mPhonoNo;
    }

    public static class UserBuilder {
        private final String mFirstName;
        private final String mLastName;

        private String mGender;
        private int mAAge;
        private String mPhonoNo;

        public UserBuilder(String mFirstName, String mLastName) {
            this.mFirstName = mFirstName;
            this.mLastName = mLastName;
        }


        public UserBuilder setmGender(String mGender) {
            this.mGender = mGender;
            return this;
        }


        public UserBuilder setmAAge(int mAAge) {
            this.mAAge = mAAge;
            return this;
        }


        public UserBuilder setmPhonoNo(String mPhonoNo) {
            this.mPhonoNo = mPhonoNo;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
