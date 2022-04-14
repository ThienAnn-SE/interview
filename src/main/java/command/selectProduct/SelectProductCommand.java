package command.selectProduct;

import command.Command;
import command.CommandConstant;
import command.CommandOutputter;

import javax.inject.Inject;
import java.util.List;

public class SelectProductCommand implements Command {
    private final CommandOutputter commandOutputter;

    @Inject
    public SelectProductCommand(CommandOutputter commandOutputter){
        this.commandOutputter = commandOutputter;
    }

    @Override
    public String key() {
        return CommandConstant.SELECT_PRODUCT_COMMAND_KEY;
    }

    @Override
    public Status handleCommand(List<String> input) {
        //select product action
        return null;
    }
}
