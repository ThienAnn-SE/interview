package database;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class InMemoryDatabase_Factory implements Factory<InMemoryDatabase> {
  @Override
  public InMemoryDatabase get() {
    return newInstance();
  }

  public static InMemoryDatabase_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static InMemoryDatabase newInstance() {
    return new InMemoryDatabase();
  }

  private static final class InstanceHolder {
    private static final InMemoryDatabase_Factory INSTANCE = new InMemoryDatabase_Factory();
  }
}
