package com.bolyartech.forge.server.tple.tests.modules.tests.pages;

import com.bolyartech.forge.server.handler.WebPage;
import com.bolyartech.forge.server.misc.TemplateEngine;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;
import com.bolyartech.forge.server.route.RequestContext;
import com.bolyartech.forge.server.tple.tests.data.InMemoryPresentationsRepository;


public class FreemarkerTestWp extends WebPage {
    public FreemarkerTestWp(TemplateEngineFactory templateEngineFactory) {
        super(templateEngineFactory);
    }


    @Override
    public String produceHtml(RequestContext ctx, TemplateEngine tple) {
        InMemoryPresentationsRepository dataRepo = new InMemoryPresentationsRepository();
        tple.assign("presentations", dataRepo.findAll());

        return tple.render("freemarker/index-freemarker.ftl");
    }
}
