package io.nuun.kernel.samples.hello.internal;

import io.nuun.kernel.messagevalue.MessageValue;
import io.nuun.kernel.samples.hello.api.HelloWorldService;
import io.nuun.kernel.samples.translate.api.TranslateService;

import java.util.Optional;

import javax.inject.Inject;

public class InternalHelloWorldService implements HelloWorldService
{

    @Inject
    Optional<TranslateService> translateService;

    @Override
    public String say(MessageValue message)
    {
        if (translateService.isPresent())
        {
            translateService.get().translate(message);
        }

        return String.format("This is my message to the world → \"%s\"", message);
    }

}