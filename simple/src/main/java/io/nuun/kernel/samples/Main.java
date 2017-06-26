package io.nuun.kernel.samples;

import javax.inject.Inject;
import javax.inject.Named;

import io.nuun.kernel.api.annotations.Entrypoint;
import io.nuun.kernel.core.NuunRunner;
import io.nuun.kernel.samples.api.HelloWorldService;

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
        System.out.println( helloWorldService.say(message));
    }

    public static void main(String[] args)
    {
        NuunRunner.entrypoint(Main.class).execute(args);
    }
}
