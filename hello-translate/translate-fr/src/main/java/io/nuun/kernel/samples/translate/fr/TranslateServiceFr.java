package io.nuun.kernel.samples.translate.fr;

import io.nuun.kernel.messagevalue.MessageValue;
import io.nuun.kernel.samples.translate.api.TranslateService;

public class TranslateServiceFr implements TranslateService
{

    @Override
    public void translate(MessageValue message)
    {
        if (message.containsKey("en"))
        {
            String from = message.value("en");

            if (from.toLowerCase().contains("hello"))
            {
                message.addMessage("fr", "Salutations Monde !");
            }
        }
    }
}