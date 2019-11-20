package org.jake.jdk.event;

import java.util.EventListener;

public interface UserListener extends EventListener {
    void onRegister(UserEvent userEvent);
}
