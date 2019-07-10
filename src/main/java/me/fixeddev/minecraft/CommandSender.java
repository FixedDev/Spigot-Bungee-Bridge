package me.fixeddev.minecraft;

public interface CommandSender {

    /**
     * Gets the name of this command sender
     *
     * @return Name of the sender
     */
    String getName();

    /**
     * Sends this sender a message
     *
     * @param message Message to be displayed
     */
    void sendMessage(String message);

    /**
     * Sends this sender multiple messages
     *
     * @param messages An array of messages to be displayed
     */
    void sendMessage(String[] messages);

    /**
     * Sends the component to the player
     *
     * @param component the components to send
     */
    void sendMessage(net.md_5.bungee.api.chat.BaseComponent component);

    /**
     * Sends an array of components as a single message to the player
     *
     * @param components the components to send
     */
    void sendMessage(net.md_5.bungee.api.chat.BaseComponent... components);

    /**
     * Gets the value of the specified permission, if set.
     * <p>
     * If a permission override is not set on this object, the default value
     * of the permission will be returned.
     *
     * @param name Name of the permission
     * @return Value of the permission
     */
    boolean hasPermission(String name);

}
