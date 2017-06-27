package io.nuun.kernel.samples.translate.fr;

import io.nuun.kernel.api.annotations.Topology;
import io.nuun.kernel.samples.translate.api.TranslateService;

import java.util.Optional;

@Topology(overriding = true)
public interface ConfFr
{
    /**
     * This will inject an Optional<TranslateService>
     */
    Optional<TranslateService> translateService = Optional.of(new TranslateServiceFr());
}
