package factoryPattern;

public final class User {

    private String username;
    private int age;

    private User(final String username, final int age) {
        this.username = username;
        this.age = age;
    }

    public static User newInstance(final String username, final int age) {
        return new User(username, age);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }
}
