package io.nuun.kernel.samples;

import io.nuun.kernel.api.annotations.Entrypoint;
import io.nuun.kernel.core.NuunRunner;
import io.nuun.kernel.samples.api.HelloWorldService;

import javax.inject.Inject;
import javax.inject.Named;

@Entrypoint
public class Main implements Runnable
{
    @Inject
    @Named("message")
    String            message;

    @Inject
    HelloWorldService helloWorldService;

    @Override
    public void run()
    {
        System.out.println("inside Main sample message is :\n" + helloWorldService.say(message));
    }

    public static void main(String[] args)
    {
        NuunRunner.entrypoint(Main.class).execute(args);
    }
}
