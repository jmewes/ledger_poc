package io.github.jmewes;

import com.google.inject.AbstractModule;

public class LedgerModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GreetingService.class).to(GreetingServiceImpl.class);
    }
}
