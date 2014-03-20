package org.omnirom.music.providers;

import android.content.Context;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ProviderAggregator {

    private List<IProviderUpdateCallback> mUpdateCallbacks;

    private final static ProviderAggregator INSTANCE = new ProviderAggregator();
    public final static ProviderAggregator getDefault() {
        return INSTANCE;
    }

    private ProviderAggregator() {
        mUpdateCallbacks = new ArrayList<IProviderUpdateCallback>();
    }

    public void addUpdateCallback(IProviderUpdateCallback cb) {
        mUpdateCallbacks.add(cb);
    }

    public void removeUpdateCallback(IProviderUpdateCallback cb) {
        mUpdateCallbacks.remove(cb);
    }

    public Iterator<IProviderUpdateCallback> getUpdateCallbacks() {
        return mUpdateCallbacks.iterator();
    }

    public void search(final String query, final ISearchCallback callback) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
