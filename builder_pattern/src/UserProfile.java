class UserProfile {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;

    private UserProfile(UserProfileBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class UserProfileBuilder {
        private String name;
        private int age;
        private String address;
        private String email;
        private String phone;

        public UserProfileBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserProfileBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserProfileBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserProfileBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserProfileBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this);
        }
    }
}