package com.diit.fabric;


import org.opengis.feature.simple.SimpleFeature;
import org.opengis.feature.simple.SimpleFeatureType;
import org.opengis.feature.type.Name;

import java.io.IOException;
import java.util.List;

import org.geotools.api.data.DataStore;
import org.geotools.data.DataStore;

public class FabricDataStore implements DataStore {
    @Override
    public void updateSchema(String s, SimpleFeatureType simpleFeatureType) throws IOException {

    }

    @Override
    public void removeSchema(String s) throws IOException {

    }

    @Override
    public String[] getTypeNames() throws IOException {
        return new String[0];
    }

    @Override
    public SimpleFeatureType getSchema(String s) throws IOException {
        return null;
    }

    @Override
    public SimpleFeatureSource getFeatureSource(String s) throws IOException {
        return null;
    }

    @Override
    public ServiceInfo getInfo() {
        return null;
    }

    @Override
    public void createSchema(SimpleFeatureType simpleFeatureType) throws IOException {

    }

    @Override
    public void updateSchema(Name name, SimpleFeatureType simpleFeatureType)
            throws IOException {

    }

    @Override
    public void removeSchema(Name name) throws IOException {

    }

    @Override
    public List<Name> getNames() throws IOException {
        return null;
    }

    @Override
    public SimpleFeatureType getSchema(Name name) throws IOException {
        return null;
    }

    @Override
    public SimpleFeatureSource getFeatureSource(Name name) throws IOException {
        return null;
    }

    @Override
    public void dispose() {

    }

    @Override
    public FeatureReader<SimpleFeatureType, SimpleFeature> getFeatureReader(Query query, Transaction transaction)
            throws IOException {
        return null;
    }

    @Override
    public FeatureWriter<SimpleFeatureType, SimpleFeature> getFeatureWriter(String s, org.opengis.filter.Filter filter,
                                                                            Transaction transaction) throws IOException {
        return null;
    }

    @Override
    public FeatureWriter<SimpleFeatureType, SimpleFeature> getFeatureWriter(String s, Transaction transaction)
            throws IOException {
        return null;
    }

    @Override
    public FeatureWriter<SimpleFeatureType, SimpleFeature> getFeatureWriterAppend(String s, Transaction transaction)
            throws IOException {
        return null;
    }

    @Override
    public LockingManager getLockingManager() {
        return null;
    }
}
