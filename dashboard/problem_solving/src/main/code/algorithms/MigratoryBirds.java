package main.code.algorithms;

import java.util.*;

class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (Integer integer : arr) {
            map.putIfAbsent(integer, 0);
            map.put(
                    integer,
                    map.get(integer) + 1
            );
        }

        System.out.println(map);

        // Do this
        Integer birdSightMax = null;
        int index = map.keySet().size();
        for (Integer integer : map.keySet()) {
            if (null == birdSightMax || map.get(integer) >= birdSightMax) {
                birdSightMax = map.get(integer);
            }
        }

        Integer finalBirdSightMax = birdSightMax;

        return map.keySet()
                .stream()
                .filter(key -> map.get(key).equals(finalBirdSightMax))
                .min(Integer::compareTo).get();

    }

    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(
                1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4

        )));
    }
}
