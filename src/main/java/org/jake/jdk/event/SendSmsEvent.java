package org.jake.jdk.event;

public class SendSmsEvent extends UserEvent{
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public SendSmsEvent(Object source) {
        super(source);
    }
}
