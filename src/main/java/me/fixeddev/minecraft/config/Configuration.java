package me.fixeddev.minecraft.config;

import java.util.Collection;

public interface Configuration {

    /**
     * Gets an integer from the specified path.
     *
     * @param path the path to retrieve the integer from
     * @param def the default value
     * @return the retrieved integer
     */
    int getInt(String path, int def);

    /**
     * Gets a string from the specified path.
     *
     * @param path the path to retrieve the string from.
     * @param def the default value
     * @return the retrieved string
     */
    String getString(String path, String def);

    /**
     * Gets a boolean from the specified path.
     *
     * @param path the path to retrieve the boolean form.
     * @param def the default value
     * @return the retrieved boolean
     */
    boolean getBoolean(String path, boolean def);

    /**
     * Get a list from the specified path.
     *
     * @param path the path to retrieve the list form.
     * @param def the default value
     * @return the retrieved list
     */
    Collection<?> getList(String path, Collection<?> def);

}
