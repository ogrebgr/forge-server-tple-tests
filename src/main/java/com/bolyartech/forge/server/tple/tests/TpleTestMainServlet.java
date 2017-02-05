package com.bolyartech.forge.server.tple.tests;

import com.bolyartech.forge.server.MainServlet;
import com.bolyartech.forge.server.config.ForgeServerConfiguration;
import com.bolyartech.forge.server.module.HttpModule;
import com.bolyartech.forge.server.tple.tests.modules.main.MainModule;
import com.bolyartech.forge.server.tple.tests.modules.tests.TestsModule;

import java.util.ArrayList;
import java.util.List;


public class TpleTestMainServlet extends MainServlet {
    private final ForgeServerConfiguration mForgeServerConfig;


    public TpleTestMainServlet(ForgeServerConfiguration forgeServerConfig) {
        mForgeServerConfig = forgeServerConfig;
    }


    @Override
    protected List<HttpModule> getModules() {
        List<HttpModule> ret = new ArrayList<>();

        ret.add(new MainModule());
        ret.add(new TestsModule(mForgeServerConfig.getStaticFilesDir()));

        return ret;
    }
}
