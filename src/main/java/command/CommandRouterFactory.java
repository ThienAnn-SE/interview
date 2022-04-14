package command;

import command.insertMoney.InsertMoneyModule;
import command.selectProduct.SelectProductModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        SelectProductModule.class,
        InsertMoneyModule.class,
        SystemOutModule.class

})
public interface CommandRouterFactory {
    CommandRouter router();
}
