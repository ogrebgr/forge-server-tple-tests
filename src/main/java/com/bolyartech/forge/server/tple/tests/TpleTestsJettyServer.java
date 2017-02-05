package com.bolyartech.forge.server.tple.tests;

import com.bolyartech.forge.server.config.FileForgeServerConfigurationLoader;
import com.bolyartech.forge.server.config.ForgeConfigurationException;
import com.bolyartech.forge.server.jetty.ForgeJetty;
import com.bolyartech.forge.server.jetty.ForgeJettyConfiguration;
import com.bolyartech.forge.server.jetty.ForgeJettyConfigurationLoader;
import com.bolyartech.forge.server.jetty.ForgeJettyConfigurationLoaderFile;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServlet;


public class TpleTestsJettyServer extends ForgeJetty {
    private static final org.slf4j.Logger mLogger = LoggerFactory.getLogger(TpleTestsJettyServer.class);


    public TpleTestsJettyServer(ForgeJettyConfiguration forgeJettyConfiguration) {
        super(forgeJettyConfiguration);
    }


    public static void main(String[] args) {
        String jettyConfigPath = ForgeJettyConfigurationLoaderFile.detectJettyConfigFilePath();

        if (jettyConfigPath != null) {
            ForgeJettyConfigurationLoader loader = new ForgeJettyConfigurationLoaderFile(
                    ForgeJettyConfigurationLoaderFile.detectJettyConfigFilePath());

            try {
                TpleTestsJettyServer server = new TpleTestsJettyServer(loader.load());
                server.start();
            } catch (ForgeConfigurationException e) {
                throw new IllegalStateException(e);
            }
        } else {
            mLogger.error("No configuration. Aborting.");
        }
    }


    public HttpServlet createMainServlet(String configDir) {
        FileForgeServerConfigurationLoader forgeConfigLoader = new FileForgeServerConfigurationLoader(configDir);
        try {
            return new TpleTestMainServlet(forgeConfigLoader.load());
        } catch (ForgeConfigurationException e) {
            throw new IllegalStateException(e);
        }
    }
}
