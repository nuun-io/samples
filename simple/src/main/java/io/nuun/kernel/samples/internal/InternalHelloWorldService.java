package io.nuun.kernel.samples.internal;

import io.nuun.kernel.samples.api.HelloWorldService;
import io.nuun.kernel.samples.api.TranslateService;

import java.util.Optional;

import javax.inject.Inject;

public class InternalHelloWorldService implements HelloWorldService
{

    @Inject
    Optional<TranslateService> translateService;

    @Override
    public String say(String message)
    {
        if (translateService.isPresent())
        {
            return String.format("This is my message to the world \"%s\"", translateService.get().translate(message));
        }

        return String.format("This is my message to the world \"%s\"", message);
    }

}
