package database;

import dagger.Binds;
import dagger.Module;

@Module
public interface InMemoryDatabaseModule {
    @Binds
    Database inMemoryDataBase(InMemoryDatabase inMemoryDatabase);
}
