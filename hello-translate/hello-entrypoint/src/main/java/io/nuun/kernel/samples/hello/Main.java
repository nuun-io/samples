package io.nuun.kernel.samples.hello;

import io.nuun.kernel.api.annotations.Entrypoint;
import io.nuun.kernel.core.NuunRunner;
import io.nuun.kernel.messagevalue.MessageValue;
import io.nuun.kernel.samples.hello.api.HelloWorldService;

import javax.inject.Inject;
import javax.inject.Named;

@Entrypoint
public class Main implements Runnable
{
    @Inject
    @Named("en")
    MessageValue      messageEn;

    @Inject
    HelloWorldService helloWorldService;

    @Override
    public void run()
    {
        System.out.println(helloWorldService.say(messageEn));
    }

    public static void main(String[] args)
    {
        NuunRunner.entrypoint(Main.class).execute(args);
    }
}