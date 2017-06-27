package io.nuun.kernel.samples.hello.conf;

import io.nuun.kernel.messagevalue.MessageValue;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

public class MessageProvider implements Provider<MessageValue>
{

    @Inject
    @Named("message.en")
    String message;

    @Override
    public MessageValue get()
    {
        // TODO Auto-generated method stub
        return new MessageValue("en", message);
    }

}
