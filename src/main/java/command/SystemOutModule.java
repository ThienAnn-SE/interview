package command;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class SystemOutModule {
    @Provides
    static CommandOutputter textOutputter(){
        return System.out::println;
    }
}
