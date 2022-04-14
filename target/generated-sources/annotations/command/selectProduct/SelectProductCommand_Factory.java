package command.selectProduct;

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
public final class SelectProductCommand_Factory implements Factory<SelectProductCommand> {
  private final Provider<CommandOutputter> commandOutputterProvider;

  public SelectProductCommand_Factory(Provider<CommandOutputter> commandOutputterProvider) {
    this.commandOutputterProvider = commandOutputterProvider;
  }

  @Override
  public SelectProductCommand get() {
    return newInstance(commandOutputterProvider.get());
  }

  public static SelectProductCommand_Factory create(
      Provider<CommandOutputter> commandOutputterProvider) {
    return new SelectProductCommand_Factory(commandOutputterProvider);
  }

  public static SelectProductCommand newInstance(CommandOutputter commandOutputter) {
    return new SelectProductCommand(commandOutputter);
  }
}
