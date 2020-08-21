package com.a.b;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "My Project", shortName = "my--project")
public class AppShell implements AppShellConfigurator {    
}
