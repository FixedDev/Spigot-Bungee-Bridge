package me.fixeddev.minecraft.player;

import me.fixeddev.minecraft.CommandSender;

import java.net.InetSocketAddress;
import java.util.UUID;

public interface Player extends CommandSender {

    /**
     * Get this player's UUID.
     *
     * @return the UUID
     */
    UUID getUniqueId();

    /**
     * Gets the "friendly" name to display of this player. This may include
     * color.
     * <p>
     * Note that this name will not be displayed in game, only in chat and
     * places defined by plugins.
     *
     * @return the friendly name
     */
     String getDisplayName();

    /**
     * Sets the "friendly" name to display of this player. This may include
     * color.
     * <p>
     * Note that this name will not be displayed in game, only in chat and
     * places defined by plugins.
     *
     * @param name The new display name.
     */
     void setDisplayName(String name);

    /**
     * Gets the remote address of this connection.
     *
     * @return the remote address
     */
    InetSocketAddress getAddress();


    /**
     * Says a message (or runs a command).
     *
     * @param msg message to print
     */
    void chat(String msg);

}
