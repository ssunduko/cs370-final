package com.cs370.storemodel.model;

/**
 * Command interface for managing script commands
 *
 * @author Sergey L. Sundukovskiy
 * @version 1.0
 * @since 2021-09-27
 */
public interface CommandAPI {

    /**
     * Method for processing individual CLI commands
     *
     * @param command
     * @throws CommandException
     * @throws StoreModelException
     */
    void processCommand(String command) throws CommandException, StoreModelException;

    /**
     * Method for processing grouped CLI commands in a single file
     *
     * @param fileName
     */
    void processCommandFile(String fileName);

}
