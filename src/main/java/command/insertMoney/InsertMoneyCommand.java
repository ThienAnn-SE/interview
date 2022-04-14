package command.insertMoney;

import command.Command;
import command.CommandConstant;
import command.CommandOutputter;

import javax.inject.Inject;
import java.util.List;

public class InsertMoneyCommand implements Command {

    private CommandOutputter commandOutputter;

    @Inject
    public InsertMoneyCommand(CommandOutputter commandOutputter){
        this.commandOutputter = commandOutputter;
    }
    @Override
    public String key() {
        return CommandConstant.INSERT_MONEY_COMMAND_KEY;
    }

    @Override
    public Status handleCommand(List<String> input) {
        //insert money action
        return null;
    }
}
