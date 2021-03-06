package command;

import command.Command.Status;

import javax.inject.Inject;
import java.util.*;

public class CommandRouter {
    private final Map<String, Command> commands;

    @Inject
    public CommandRouter(Map<String, Command> commands){
        this.commands = commands;
    }

    public Status route(String input) {
        List<String> splitInput = split(input);
        if (splitInput.isEmpty()) {
            return invalidCommand(input);
        }

        String commandKey = splitInput.get(0);
        Command command = commands.get(commandKey);
        if (command == null) {
            return invalidCommand(input);
        }

        Status status =
                command.handleCommand(splitInput.subList(1, splitInput.size()));
        if (status == Status.INVALID) {
            System.out.println(commandKey + ": invalid arguments");
        }
        return status;
    }

    private Status invalidCommand(String input) {
        System.out.println(
                String.format("couldn't understand \"%s\". please try again.", input));
        return Status.INVALID;
    }

    // Split on whitespace
    private static List<String> split(String string) {
        return Arrays.asList(string.split("\\s+"));
    }
}
