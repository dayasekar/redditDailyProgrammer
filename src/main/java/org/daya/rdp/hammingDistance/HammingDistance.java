package org.daya.rdp.hammingDistance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class HammingDistance {

    static Logger LOGGER = LoggerFactory.getLogger(HammingDistance.class);

    int computeClosestDistance(String one, String two) {
        char charOne[] = one.toCharArray();
        char charTwo[] = two.toCharArray();
        int difference = 0;
        for (int i = 0; i < charOne.length; i++) {
            if (charOne[i] != charTwo[i])
                difference++;
        }
        return difference;
    }

    List<Integer> computeClosestDistance(List<String> list) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int previousDifference = list.get(i).length();
            int currentDifference = 0;

            for (int j = i + 1; j < list.size(); j++) {
                currentDifference = computeClosestDistance(list.get(i), list.get(j));

                if (currentDifference < previousDifference) {
                    previousDifference = currentDifference;
                }
                LOGGER.trace("{} {} {} {}", list.get(i), list.get(j), currentDifference, previousDifference);
            }
            result.add(previousDifference);
        }
        return result;
    }
}

