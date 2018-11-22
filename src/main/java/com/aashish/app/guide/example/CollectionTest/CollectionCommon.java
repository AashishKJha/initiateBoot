package com.aashish.app.guide.example.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionCommon {
    public <T> Collection getCollectionFromIterable(Iterable<T> it) {
        Collection<T> cln = new ArrayList<T>();

        it.forEach(cln::add);

        return cln;
    }
}
