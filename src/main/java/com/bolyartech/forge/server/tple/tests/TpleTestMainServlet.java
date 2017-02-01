package com.bolyartech.forge.server.tple.tests;

import com.bolyartech.forge.server.MainServlet;
import com.bolyartech.forge.server.module.HttpModule;

import java.util.ArrayList;
import java.util.List;


public class TpleTestMainServlet extends MainServlet {
    @Override
    protected List<HttpModule> getModules() {
        List<HttpModule> ret = new ArrayList<>();

        ret.add(new MainModule());

        return ret;
    }
}
