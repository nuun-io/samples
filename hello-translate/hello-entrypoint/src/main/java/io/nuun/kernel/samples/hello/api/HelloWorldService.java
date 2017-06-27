package io.nuun.kernel.samples.hello.api;

import io.nuun.kernel.messagevalue.MessageValue;

@FunctionalInterface
public interface HelloWorldService
{

    String say(MessageValue message);

}