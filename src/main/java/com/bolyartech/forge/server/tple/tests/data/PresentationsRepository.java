package com.bolyartech.forge.server.tple.tests.data;

public interface PresentationsRepository {

    Iterable<Presentation> findAll();

    Presentation findPresentation(Long id);

}