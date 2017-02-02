package com.bolyartech.forge.server.tple.tests.modules.tests.pages;

import com.bolyartech.forge.server.handler.WebPage;
import com.bolyartech.forge.server.misc.TemplateEngine;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;
import com.bolyartech.forge.server.route.RequestContext;


public class NativeTestWp extends WebPage {
    public NativeTestWp(TemplateEngineFactory templateEngineFactory) {
        super(templateEngineFactory);
    }


    @Override
    public String produceHtml(RequestContext ctx, TemplateEngine tple) {
        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\"/>\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
                "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\"/>\n" +
                "<title>native</title>\n" +
                "<link rel=\"stylesheet\" href=\"/css/bootstrap.min.css\" media=\"screen\"/>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "<div class=\"page-header\">\n" +
                "<h1> native</h1>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Shootout! Template engines on the JVM - Jeroen Reijn</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Are you still using JavaServer Pages as your main template language? With the popularity of template engines for other languages like Ruby and Scala and the shift in doing more MVC in the browser there are quite some new and interesting new template languages available for the JVM. During this session we will take index.tpl look at the less known, but quite interesting new template engines and see how they compare with the industries standards. \n" +
                "&lt;br/&gt;\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">HoneySpider Network: index.tpl Java based system to hunt down malicious websites - Niels van Eijck</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Legitimate websites such as news sites happen to get compromised by attackers injecting malicious content. The aim of these so-called &amp;#8220;watering hole attacks&amp;#8221; is to infect as many visitors of index.tpl website as possible, and are sometimes even targeted at index.tpl specific group of individuals. It is increasingly important to detect these infections at an early stage.\n" +
                "&lt;br/&gt;\n" +
                "&lt;br/&gt;HoneySpider Network to the rescue! \n" +
                "&lt;br/&gt;\n" +
                "&lt;br/&gt;It is index.tpl Java based open source framework that automatically scans website urls, analyses the results and reports on any malware detected.\n" +
                "&lt;br/&gt;Attend this talk to gain index.tpl better understanding of malware detection and client honeypots and get an overview of the HoneySpider Network&amp;#8217;s architecture, its code and its plugins it uses. A live demo is also included!\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Building scalable network applications with Netty - Jaap ter Woerds</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Since the introduction of the Java NIO API&amp;apos;s with Java 4, developers have\n" +
                "&lt;br/&gt;access to modern operating system facilities to perform asynchronous IO.\n" +
                "&lt;br/&gt;Using these facilities it is possible to write networking application that that\n" +
                "&lt;br/&gt;serve thousands of connected clients efficiently. Unfortunately, the NIO API&amp;apos;s\n" +
                "&lt;br/&gt;are quite low level and require index.tpl fair share of boilerplate to get started.\n" +
                "&lt;br/&gt;In this presentation, I will introduce the Netty framework and how its\n" +
                "&lt;br/&gt;architecture helps you as index.tpl developer stay focused on the interesting parts\n" +
                "&lt;br/&gt;of your network application. At the end of the presentation I will give some\n" +
                "&lt;br/&gt;real world examples and show how we use Netty in the architecture of our\n" +
                "&lt;br/&gt;mobile messaging platform XMS.\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Opening - Bert Ertman</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "De openingssessie van de conferentie met aandacht voor de dag zelf en nieuws vanuit de NLJUG. De sessie wordt gepresenteerd door Bert Ertman.\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Keynote door ING - Amir Arroni</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Keynote van ING, gepresenteerd door Amir Arooni en Peter Jacobs.\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Keynote door Oracle - Sharat Chander</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Keynote van Oracle, gepresenteerd door Sharat Chander.\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Reactieve applicaties ? klaar voor te toekomst - Allard Buijze</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "De technische eisen aan webapplicaties veranderen in hoog tempo. Enkele jaren geleden nog gebruikten de grootere applicaties enkele tientallen servers en werden response tijden van een seconde en onderhoudsvensters van enkele uren nog geaccepteerd. Tegenwoordig moeten applicaties 100% beschikbaar zijn, terwijl de gebruiker in enkele milliseconden antwoord wil krijgen. Om pieken in gebruik op te kunnen vangen moeten de applicaties op duizenden processoren in een cloud omgeving kunnen draaien.\n" +
                "&lt;br/&gt;De tekortkomingen van de huidige standaard architectuurprincipes kunnen worden opgevangen door een zogenaamde &amp;#8220;reactive architecture&amp;#8221;. Reactieve applicaties bezitten een aantal eigenschappen waardoor ze beter kunnen omgaan met opschalen, bestand zijn tegen fouten en bovendien efficienter gebruik maken van beschikbare server-bronnen.\n" +
                "&lt;br/&gt;In deze presentatie laat Allard zien hoe deze eigenschappen gerealiseerd kunnen worden en welke reeds bekende architectuurpatronen en frameworks hieraan een bijdrage leveren.\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">HTML 5 Geolocation + WebSockets + Scalable JavaEE Backend === Awesome Realtime Location Aware Applications - Shekhar Gulati</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Location Aware apps are everywhere and we use them heavily in our day to day life. You have seen the stuff that Foursquare has done with spatial and you want some of that hotness for your app. But, where to start? In this session, we will build index.tpl location aware app using HTML 5 on the client and scalable JavaEE + MongoDB on the server side. HTML 5 GeoLocation API help us to find user current location and MongoDB offers Geospatial indexing support which provides an easy way to get started and enables index.tpl variety of location-based applications - ranging from field resource management to social check-ins. Next we will add realtime capabilities to our application using Pusher. Pusher provides scalable WebSockets as index.tpl service. The Java EE 6 backend will be built using couple of Java EE 6 technologies -- JAXRS and CDI. Finally , we will deploy our Java EE application on OpenShift -- Red Hat&amp;apos;s public, scalable Platform as index.tpl Service.\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Retro Gaming with Lambdas - Stephen Chin</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Lambda expressions are coming in Java 8 and dramatically change the programming model.  They allow new functional programming patterns that were not possible before, increasing the expressiveness and power of the Java language.\n" +
                "&lt;br/&gt;\n" +
                "&lt;br/&gt;In this university session, you will learn how to take advantage of the new lambda-enabled Java 8 APIs by building out index.tpl retro video game in JavaFX.\n" +
                "&lt;br/&gt;\n" +
                "&lt;br/&gt;Some of the Java 8 features you will learn about include enhanced collections, functional interfaces, simplified event handlers, and the new stream API.  Start using these in your application today leveraging the latest OpenJDK builds so you can prepare for the future Java 8 release.\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"panel panel-default\">\n" +
                "<div class=\"panel-heading\">\n" +
                "<h3 class=\"panel-title\">Data Science with R for Java Developers - Sander Mak</h3>\n" +
                "</div>\n" +
                "<div class=\"panel-body\">\n" +
                "Understanding data is increasingly important to create cutting-edge applications. A whole new data science field is emerging, with the open source R language as index.tpl leading technology. This statistical programming language is specifically designed for analyzing and understanding data. \n" +
                "&lt;br/&gt;\n" +
                "&lt;br/&gt;In this session we approach R from the perspective of Java developers. How do you get up to speed quickly, what are the pitfalls to look out for?  Also we discuss how to bridge the divide between the R language and the JVM. After this session you can use your new skills to explore an exciting world of data analytics and machine learning! \n" +
                "</div>\n" +
                "</div>\n" +
                "\n" +
                "</div>\n" +
                "<script src=\"/js/jquery.min.js\"></script>\n" +
                "<script src=\"/js/bootstrap.min.js\"></script>\n" +
                "</body>\n" +
                "</html>";
    }
}
