package command.selectProduct;

import command.Command;
import command.CommandConstant;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class SelectProductModule {
    @Binds
    @IntoMap
    @StringKey(CommandConstant.SELECT_PRODUCT_COMMAND_KEY)
    public abstract Command selectProductCommand(SelectProductCommand command);
}
