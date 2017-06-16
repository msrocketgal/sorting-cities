package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by msroc on 6/15/2017.
 */
public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return Integer.compare(o1.getPopulation(), o2.getPopulation());
    }
}
