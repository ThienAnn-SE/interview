package command;

import com.google.common.collect.ImmutableMap;
import command.insertMoney.InsertMoneyCommand;
import command.selectProduct.SelectProductCommand;
import dagger.internal.DaggerGenerated;
import java.util.Map;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerCommandRouterFactory implements CommandRouterFactory {
  private final DaggerCommandRouterFactory commandRouterFactory = this;

  private DaggerCommandRouterFactory() {


  }

  public static Builder builder() {
    return new Builder();
  }

  public static CommandRouterFactory create() {
    return new Builder().build();
  }

  private SelectProductCommand selectProductCommand() {
    return new SelectProductCommand(SystemOutModule_TextOutputterFactory.textOutputter());
  }

  private InsertMoneyCommand insertMoneyCommand() {
    return new InsertMoneyCommand(SystemOutModule_TextOutputterFactory.textOutputter());
  }

  private Map<String, Command> mapOfStringAndCommand() {
    return ImmutableMap.<String, Command>of("select", selectProductCommand(), "insert", insertMoneyCommand());
  }

  @Override
  public CommandRouter router() {
    return new CommandRouter(mapOfStringAndCommand());
  }

  public static final class Builder {
    private Builder() {
    }

    public CommandRouterFactory build() {
      return new DaggerCommandRouterFactory();
    }
  }
}
