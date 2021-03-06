package dev.lone.itemsadder.api.Events;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Please use the other event (this one will work anyway)
 */
@Deprecated
public class ItemsAdderFirstLoadEvent extends Event
{
    public ItemsAdderFirstLoadEvent()
    {
        throw new NotActuallyItemsAdderException();
    }

    @NotNull
    @Override
    public HandlerList getHandlers()
    {
        throw new NotActuallyItemsAdderException();
    }

    public static HandlerList getHandlerList()
    {
        throw new NotActuallyItemsAdderException();
    }

    public String getMessage()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setMessage(String message)
    {
        throw new NotActuallyItemsAdderException();
    }
}