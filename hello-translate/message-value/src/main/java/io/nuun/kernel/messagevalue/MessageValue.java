package io.nuun.kernel.messagevalue;

import java.util.HashMap;
import java.util.Map;

public class MessageValue
{

    private final Map<Object, String> values;

    public MessageValue()
    {
        values = new HashMap<>();
    }

    public MessageValue(Object qualifier, String value)
    {
        this();
        values.put(qualifier, value);
    }

    public void addMessage(Object qualifier, String value)
    {
        values.put(qualifier, value);
    }

    public String value(Object key)
    {
        return values.get(key);
    }

    public boolean containsKey(Object key)
    {
        return values.containsKey(key);
    }

    @Override
    public String toString()
    {
        return values.toString();
    }
}
