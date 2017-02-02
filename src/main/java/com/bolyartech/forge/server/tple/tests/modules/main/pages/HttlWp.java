package com.bolyartech.forge.server.tple.tests.modules.main.pages;

import com.bolyartech.forge.server.handler.WebPage;
import com.bolyartech.forge.server.misc.TemplateEngine;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;
import com.bolyartech.forge.server.route.RequestContext;


public class HttlWp extends WebPage {
    public HttlWp(TemplateEngineFactory templateEngineFactory) {
        super(templateEngineFactory);
    }


    @Override
    public String produceHtml(RequestContext ctx, TemplateEngine tple) {
        tple.assign("from", "HTTL template engine");

        return tple.render("httl.html");
    }
}
