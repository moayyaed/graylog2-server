/*
 * Copyright (C) 2020 Graylog, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Server Side Public License, version 1,
 * as published by MongoDB, Inc.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Server Side Public License for more details.
 *
 * You should have received a copy of the Server Side Public License
 * along with this program. If not, see
 * <http://www.mongodb.com/licensing/server-side-public-license>.
 */
package org.graylog2.web;

/**
 * Some plugins may have dynamic data that needs to be made available to the UI at server startup.  This interface
 * provides a mechanism for providing that data via the generated config.js file's pluginUISettings map.  When an
 * instance of this interface is registered via the Graylog2Module.addPluginUISettingsProvider() method, an entry will
 * be added to the pluginUISettings map using the key and JSON data the instance provides.
 */
public interface PluginUISettingsProvider {

    /**
     * @return The key used to store the plugin's UI settings in the pluginUISettings map in config.js
     */
    String pluginSettingsKey();

    /**
     * @return The JSON data to be stored in the pluginUISettings map in config.js
     */
    String pluginSettingsJson();
}
