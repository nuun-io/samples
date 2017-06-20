package io.nuun.kernel.samples.configuration;

import io.nuun.kernel.api.annotations.Topology;
import io.nuun.kernel.samples.api.HelloWorldService;
import io.nuun.kernel.samples.api.TranslateService;
import io.nuun.kernel.samples.internal.InternalHelloWorldService;

import java.util.Optional;

@Topology(propertySources = "classpath:message.properties")
public interface SampleConfiguration
{

    /**
     * This tells : InternalHelloworldService will be injected on the key HelloworldService
     */
    InternalHelloWorldService injects(HelloWorldService key);

    /**
     * This will inject an emtpy Optional<TranslateService>
     */
    Optional<TranslateService> translateService = Optional.empty();

}
