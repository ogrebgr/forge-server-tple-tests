package com.bolyartech.forge.server.tple.tests.modules.tests;

import com.bolyartech.forge.server.HttpMethod;
import com.bolyartech.forge.server.handler.StaticFileHandler;
import com.bolyartech.forge.server.misc.MimeTypeResolver;
import com.bolyartech.forge.server.misc.MimeTypeResolverImpl;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;
import com.bolyartech.forge.server.module.HttpModule;
import com.bolyartech.forge.server.route.Route;
import com.bolyartech.forge.server.route.RouteImpl;
import com.bolyartech.forge.server.tple.freemarker.FreemarkerTemplateEngineFactory;
import com.bolyartech.forge.server.tple.handlebars.HandlebarsTemplateEngineFactory;
import com.bolyartech.forge.server.tple.httl.HttlTemplateEngineFactory;
import com.bolyartech.forge.server.tple.jade.JadeTemplateEngineFactory;
import com.bolyartech.forge.server.tple.jtwig.JtwigTemplateEngineFactory;
import com.bolyartech.forge.server.tple.mustache.MustacheTemplateEngineFactory;
import com.bolyartech.forge.server.tple.pebble.PebbleTemplateEngineFactory;
import com.bolyartech.forge.server.tple.rythm.RythmTemplateEngineFactory;
import com.bolyartech.forge.server.tple.tests.NotFoundResponse;
import com.bolyartech.forge.server.tple.tests.modules.tests.pages.*;
import com.bolyartech.forge.server.tple.thymeleaf.ThymeleafTemplateEngineFactory;
import com.bolyartech.forge.server.tple.trimou.TrimouTemplateEngineFactory;
import com.bolyartech.forge.server.tple.velocity.VelocityTemplateEngineFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestsModule implements HttpModule {
    private static final String MODULE_SYSTEM_NAME = "tests";
    private static final int MODULE_VERSION_CODE = 1;
    private static final String MODULE_VERSION_NAME = "1.0.0";

    private final String mStaticFilesDir;


    public TestsModule(String staticFilesDir) {
        mStaticFilesDir = staticFilesDir;
    }


    @Override
    public List<Route> createRoutes() {
        List<Route> ret = new ArrayList<>();

        NotFoundResponse notFoundResponse = new NotFoundResponse();
        MimeTypeResolver mimeTypeResolver = new MimeTypeResolverImpl();

        ret.add(new RouteImpl(HttpMethod.GET, "/css", new StaticFileHandler(mStaticFilesDir + "css/", notFoundResponse,
                mimeTypeResolver, true)));
        ret.add(new RouteImpl(HttpMethod.GET, "/js", new StaticFileHandler(mStaticFilesDir + "js/", notFoundResponse,
                mimeTypeResolver, true)));

        Map<String, String> additionalSettings = new HashMap<>();
        additionalSettings.put("velocimacro.library", "/templates/modules/tests/velocity/includes.vm");
        additionalSettings.put("velocimacro.library.autoreload", "false");
        TemplateEngineFactory vf = new VelocityTemplateEngineFactory("/templates/modules/tests/", additionalSettings);
        ret.add(new RouteImpl(HttpMethod.GET, "/test/velocity", new VelocityTestWp(vf)));

        TemplateEngineFactory fmf = new FreemarkerTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/freemarker", new FreemarkerTestWp(fmf)));

        TemplateEngineFactory hbf = new HandlebarsTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/handlebars", new HandlebarsTestWp(hbf)));

        TemplateEngineFactory htf = new HttlTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/httl", new HttlTestWp(htf)));

        TemplateEngineFactory jf = new JadeTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/jade", new JadeTestWp(jf)));

        TemplateEngineFactory jtf = new JtwigTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/jtwig", new JtwigTestWp(jtf)));

        TemplateEngineFactory mf = new MustacheTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/mustache", new MustacheTestWp(mf)));

        TemplateEngineFactory pf = new PebbleTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/pebble", new PebbleTestWp(pf)));

        TemplateEngineFactory rf = new RythmTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/rythm", new RythmTestWp(rf)));

        TemplateEngineFactory tff = new ThymeleafTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/thymeleaf", new ThymeleafTestWp(tff)));

        TemplateEngineFactory tf = new TrimouTemplateEngineFactory("/templates/modules/tests/");
        ret.add(new RouteImpl(HttpMethod.GET, "/test/trimou", new TrimouTestWp(tf)));

        ret.add(new RouteImpl(HttpMethod.GET, "/test/native", new NativeTestWp(tff)));


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
