package objects;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;
import utilities.RandomUtil;

import java.util.Locale;

@Getter
@Setter
public class User {

    private String fullName;
    private String preferredName;
    private String email;
    private int mobileNumber;

    public User(String fullName, String preferredName, String email, int mobileNumber) {
        this.fullName = fullName;
        this.preferredName = preferredName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public User() {
    }

    public User randomInitial() {
        Faker faker = new Faker();
        this.setFullName(faker.name().fullName().replaceAll("[.']+", ""));
        this.setPreferredName(faker.name().fullName());
        this.setEmail(RandomUtil.nextString(10).toLowerCase() + "@gmail.com");
        this.setMobileNumber(906022833);
        return this;
    }

}
