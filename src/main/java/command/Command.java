package command;

import java.util.List;

public interface Command {

    String key();

    /** Process the rest of the command's words and do something. */
    Status handleCommand(List<String> input);

    enum Status {
        INVALID,
        SUCCESS
    }
}
