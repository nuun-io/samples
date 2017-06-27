package io.nuun.kernel.samples.translate.api;

import io.nuun.kernel.messagevalue.MessageValue;

@FunctionalInterface
public interface TranslateService
{
    void translate(MessageValue message);
}
