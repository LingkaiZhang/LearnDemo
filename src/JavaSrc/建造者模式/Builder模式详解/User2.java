package JavaSrc.建造者模式.Builder模式详解;


/**
 * @Auther: lingkai
 * @Date: 2019/7/24 14:29
 * @Description: 使用插件InnerBuilder生成的建造者模式代码
 */
public class User2 {

    private final String mFirstName;
    private final String mLastName;
    private final String mGender;
    private final int mAAge;
    private final String mPhonoNo;

    private User2(Builder builder) {
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mGender = builder.mGender;
        mAAge = builder.mAAge;
        mPhonoNo = builder.mPhonoNo;
    }


    public static final class Builder {
        private String mFirstName;
        private String mLastName;
        private String mGender;
        private int mAAge;
        private String mPhonoNo;

        public Builder() {
        }

        public Builder mFirstName(String val) {
            mFirstName = val;
            return this;
        }

        public Builder mLastName(String val) {
            mLastName = val;
            return this;
        }

        public Builder mGender(String val) {
            mGender = val;
            return this;
        }

        public Builder mAAge(int val) {
            mAAge = val;
            return this;
        }

        public Builder mPhonoNo(String val) {
            mPhonoNo = val;
            return this;
        }

        public User2 build() {
            return new User2(this);
        }
    }
}
