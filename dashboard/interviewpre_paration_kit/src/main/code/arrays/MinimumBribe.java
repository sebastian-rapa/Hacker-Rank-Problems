package main.code.arrays;

import java.util.HashMap;
import java.util.Map;

class MinimumBribe {
    static void minimumBribes(int[] q) {
        int[] qWithNoBribe = getQueueWithNoBribe(q);
        Map<Integer, Integer> bribeMap = new HashMap<>();
        int aux;
        int auxIndex = 0;
        int totalNumberOfBribes = 0;
        for (int i = 0; i < qWithNoBribe.length - 1; i++) {
            if (q[i] == qWithNoBribe[i]) continue;

            // Find index of element  in qWithNoBribe
            for (int j = i + 1; j < qWithNoBribe.length; j++) {
                if (qWithNoBribe[j] == q[i]){
                    auxIndex = j;
                    break;
                }
            }
            if (auxIndex - i > 2) {
                System.out.println("Too chaotic");
                return;
            }
            do {
                if (bribeMap.containsKey(q[i])) {
                    Integer nrOfBribes = bribeMap.get(q[i]);
                    if (nrOfBribes > 2) {
                        System.out.println("Too chaotic");
                        return;
                    }
                    bribeMap.put(q[i], nrOfBribes + 1);
                } else {
                    bribeMap.put(q[i], 1);
                }

                aux = qWithNoBribe[auxIndex];
                qWithNoBribe[auxIndex] = qWithNoBribe[auxIndex - 1];
                qWithNoBribe[auxIndex - 1] = aux;

                totalNumberOfBribes++;
                auxIndex--;
            } while (q[i] != qWithNoBribe[i]);
        }
        System.out.println(totalNumberOfBribes);
    }

    private static int[] getQueueWithNoBribe(int[] q) {
        int[] noBribeQ = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            noBribeQ[i] = i + 1;
        }
        return noBribeQ;
    }
}
