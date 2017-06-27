package io.nuun.kernel.samples.hello.conf;

import io.nuun.kernel.api.annotations.Topology;
import io.nuun.kernel.messagevalue.MessageValue;
import io.nuun.kernel.samples.hello.api.HelloWorldService;
import io.nuun.kernel.samples.hello.internal.InternalHelloWorldService;
import io.nuun.kernel.samples.translate.api.TranslateService;

import java.util.Optional;

import javax.inject.Named;

@Topology(propertySources = "classpath:message.properties")
public interface HelloConfiguration
{

    /**
     * This tells : InternalHelloworldService will be injected on the key HelloworldService
     */
    InternalHelloWorldService injects(HelloWorldService key);

    /**
     * This will inject an emtpy Optional<TranslateService>
     */
    Optional<TranslateService> translateService = Optional.empty();

    MessageProvider provides(@Named("en") MessageValue key);

}
