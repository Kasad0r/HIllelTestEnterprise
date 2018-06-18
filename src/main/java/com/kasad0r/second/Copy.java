package com.kasad0r.second;


import java.util.Arrays;
import java.util.Collection;

public class Copy<T> {
    /**
     * @param array      input array of Object`s
     * @param collection collection where we put array objects
     * @return objects in collection from array.
     * Throw NullPointerException when one of the objects was null
     */
    private Collection<T> insert(T[] array, Collection<T> collection) {
        if (array != null && collection != null) {
            collection.addAll(Arrays.asList(array));
            return collection;
        } else throw new NullPointerException();
    }
}
