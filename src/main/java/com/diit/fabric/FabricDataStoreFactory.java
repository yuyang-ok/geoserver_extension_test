package com.diit.fabric;

import org.geotools.data.DataStore;
import org.geotools.data.DataStoreFactorySpi;


import java.awt.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

public class FabricDataStoreFactory implements DataStoreFactorySpi {

    @Override
    public DataStore createDataStore(Map<String, Serializable> map) throws IOException {
        return null;
    }

    @Override
    public String getDisplayName() {
        return "Fabric";
    }


    @Override
    public String getDescription() {
        return "Fabric geo tools driver";
    }

    @Override
    public Param[] getParametersInfo() {
        Param[] x = {
                new Param("host", String.class),
                new Param("port", Integer.class),
                new Param("username", String.class),
                new Param("password", String.class),
        };

        return x;
    }

    @Override
    public boolean canProcess(Map<String, Serializable> map) {
        return true;
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public DataStore createNewDataStore(Map<String, Serializable> map) throws IOException {
        return null;
    }

    @Override
    public Map<RenderingHints.Key, ?> getImplementationHints() {
        return null;
    }
}
