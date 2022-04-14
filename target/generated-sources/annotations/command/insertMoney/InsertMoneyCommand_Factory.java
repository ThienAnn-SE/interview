package command.insertMoney;

import command.CommandOutputter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class InsertMoneyCommand_Factory implements Factory<InsertMoneyCommand> {
  private final Provider<CommandOutputter> commandOutputterProvider;

  public InsertMoneyCommand_Factory(Provider<CommandOutputter> commandOutputterProvider) {
    this.commandOutputterProvider = commandOutputterProvider;
  }

  @Override
  public InsertMoneyCommand get() {
    return newInstance(commandOutputterProvider.get());
  }

  public static InsertMoneyCommand_Factory create(
      Provider<CommandOutputter> commandOutputterProvider) {
    return new InsertMoneyCommand_Factory(commandOutputterProvider);
  }

  public static InsertMoneyCommand newInstance(CommandOutputter commandOutputter) {
    return new InsertMoneyCommand(commandOutputter);
  }
}
