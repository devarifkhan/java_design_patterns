//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile.UserProfileBuilder()
                .setName("Md Ariful Islam")
                .setAge(30)
                .setAddress("Dhaka, Bangladesh")
                .setEmail("ariful@example.com")
                .setPhone("0123456789")
                .build();

        System.out.println(userProfile);
    }
}
