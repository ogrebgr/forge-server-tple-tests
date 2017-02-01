package com.bolyartech.forge.server.tple.tests;

import com.bolyartech.forge.server.jetty.ForgeJetty;
import com.bolyartech.forge.server.jetty.ForgeJettyConfigurationLoader;
import com.bolyartech.forge.server.jetty.ForgeJettyConfigurationLoaderImpl;

import javax.servlet.http.HttpServlet;


public class TpleTestsJettyServer extends ForgeJetty {

    public TpleTestsJettyServer(ForgeJettyConfigurationLoader forgeJettyConfigurationLoader) {
        super(forgeJettyConfigurationLoader);
    }


    public static void main(String[] args) {
        TpleTestsJettyServer server = new TpleTestsJettyServer(new ForgeJettyConfigurationLoaderImpl());
        server.start();
    }

    public HttpServlet createMainServlet() {
        return new TpleTestMainServlet();
    }
}
