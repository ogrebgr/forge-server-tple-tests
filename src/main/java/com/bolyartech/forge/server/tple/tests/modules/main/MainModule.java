package com.bolyartech.forge.server.tple.tests.modules.main;

import com.bolyartech.forge.server.HttpMethod;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;
import com.bolyartech.forge.server.module.HttpModule;
import com.bolyartech.forge.server.route.Route;
import com.bolyartech.forge.server.route.RouteImpl;
import com.bolyartech.forge.server.tple.freemarker.FreemarkerTemplateEngineFactory;
import com.bolyartech.forge.server.tple.handlebars.HandlebarsTemplateEngineFactory;
import com.bolyartech.forge.server.tple.httl.HttlTemplateEngineFactory;
import com.bolyartech.forge.server.tple.jade.JadeTemplateEngineFactory;
import com.bolyartech.forge.server.tple.jetbrick.JetbrickTemplateEngineFactory;
import com.bolyartech.forge.server.tple.jinjava.JinjavaTemplateEngineFactory;
import com.bolyartech.forge.server.tple.jtwig.JtwigTemplateEngineFactory;
import com.bolyartech.forge.server.tple.mustache.MustacheTemplateEngineFactory;
import com.bolyartech.forge.server.tple.pebble.PebbleTemplateEngineFactory;
import com.bolyartech.forge.server.tple.tests.modules.main.pages.*;
import com.bolyartech.forge.server.tple.thymeleaf.ThymeleafTemplateEngineFactory;
import com.bolyartech.forge.server.tple.trimou.TrimouTemplateEngineFactory;
import com.bolyartech.forge.server.tple.velocity.VelocityTemplateEngineFactory;

import java.util.ArrayList;
import java.util.List;


public class MainModule implements HttpModule {
    private static final String MODULE_SYSTEM_NAME = "main";
    private static final int MODULE_VERSION_CODE = 1;
    private static final String MODULE_VERSION_NAME = "1.0.0";


    @Override
    public List<Route> createRoutes() {
        List<Route> ret = new ArrayList<>();

        TemplateEngineFactory vf = new VelocityTemplateEngineFactory("/templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/velocity", new VelocityWp(vf)));

        TemplateEngineFactory fmf = new FreemarkerTemplateEngineFactory("/templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/freemarker", new FreemarkerWp(fmf)));

        TemplateEngineFactory mf = new MustacheTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/mustache", new MustacheWp(mf)));

        TemplateEngineFactory hbf = new HandlebarsTemplateEngineFactory("/templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/handlebars", new HandlebarsWp(hbf)));

        TemplateEngineFactory jf = new JadeTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/jade", new JadeWp(jf)));

        TemplateEngineFactory tlf = new ThymeleafTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/thymeleaf", new ThymeleafWp(tlf)));

        TemplateEngineFactory jbf = new JetbrickTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/jetbrick", new JetbrickWp(jbf)));

        TemplateEngineFactory pf = new PebbleTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/pebble", new PebbleWp(pf)));

        TemplateEngineFactory jtf = new JtwigTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/jtwig", new JtwigWp(jtf)));


        TemplateEngineFactory jjf = new JinjavaTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/jinjava", new JinjavaWp(jjf)));

//        TemplateEngineFactory rf = new RythmTemplateEngineFactory("templates/modules/main/");
//        ret.add(new RouteImpl(HttpMethod.GET, "/rythm", new RythmWp(rf)));

        TemplateEngineFactory tf = new TrimouTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/trimou", new TrimouWp(tf)));

        TemplateEngineFactory htf = new HttlTemplateEngineFactory("templates/modules/main/");
        ret.add(new RouteImpl(HttpMethod.GET, "/httl", new HttlWp(htf)));

        return ret;
    }


    @Override
    public String getSystemName() {
        return MODULE_SYSTEM_NAME;
    }


    @Override
    public String getShortDescription() {
        return "";
    }


    @Override
    public int getVersionCode() {
        return MODULE_VERSION_CODE;
    }


    @Override
    public String getVersionName() {
        return MODULE_VERSION_NAME;
    }
}
