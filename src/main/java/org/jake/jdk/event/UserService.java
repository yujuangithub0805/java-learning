package org.jake.jdk.event;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<UserListener> listenerList = new ArrayList<>();

    public void register(User user) {

        System.out.println("user=" + user.getUserName() + " , password=" + user.getPassword() + " ,注册成功");
        publishEvent(new SendSmsEvent(user));
    }

    private void publishEvent(UserEvent event) {
        for (UserListener userListener : listenerList) {
            userListener.onRegister(event);
        }
    }

    public void addListeners(UserListener userListener) {
        this.listenerList.add(userListener);
    }
}
