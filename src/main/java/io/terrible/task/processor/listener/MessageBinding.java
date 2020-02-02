package io.terrible.task.processor.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageBinding {

    String DIRECTORY_CHANNEL = "directoryChannel";

    @Input(DIRECTORY_CHANNEL)
    SubscribableChannel subscription();

}
