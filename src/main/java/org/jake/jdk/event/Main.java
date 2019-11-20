package org.jake.jdk.event;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.addListeners(new SendMsmListener());
        User user = new User("foo", "123456", "注册成功啦");
        userService.register(user);
    }
}
