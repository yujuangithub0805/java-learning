package org.jake.jdk.event;


public class SendMsmListener implements UserListener {

    public void onRegister(UserEvent userEvent) {
        if (userEvent instanceof SendSmsEvent) {
            Object source = userEvent.getSource();
            User user = (User) source;
            System.out.println("send sms to " + user.getUserName());
        }
    }
}
