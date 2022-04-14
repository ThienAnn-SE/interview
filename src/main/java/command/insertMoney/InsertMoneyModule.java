package command.insertMoney;

import command.Command;
import command.CommandConstant;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class InsertMoneyModule {
    @Binds
    @IntoMap
    @StringKey(CommandConstant.INSERT_MONEY_COMMAND_KEY)
    public abstract Command insertMoneyCommand(InsertMoneyCommand insertMoneyCommand);
}
