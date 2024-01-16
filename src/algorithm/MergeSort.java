package algorithm;

public class MergeSort {
    public int[] Algorithm(int[] tab) {
        return mergeSort(tab);
    }

    public int[] mergeSort(int[] tab) {
        if (tab.length <= 1) return tab;

        int middle = tab.length / 2;
        int[] lTab = new int[middle];
        int[] rTab = new int[tab.length - middle];

        int i = 0;
        int j = 0;

        for (; i < tab.length; i++) {
            if (i < middle) {
                lTab[i] = tab[i];
            } else {
                rTab[j] = tab[i];
                j++;
            }
        }

        mergeSort(lTab);
        mergeSort(rTab);

        merge(lTab, rTab, tab);

        return tab;
    }


    public void merge(int[] lTab, int[] rTab, int[] tab) {
        int lSize = tab.length / 2;
        int rSize = tab.length - lSize;

        int i = 0, l = 0, r = 0;

        while(l < lSize && r < rSize) {
            if (lTab[l] < rTab[r]) {
                tab[i] = lTab[l];
                i++;
                l++;
            } else {
                tab[i] = rTab[r];
                i++;
                r++;
            }
        }

        while(l < lTab.length) {
            tab[i] = lTab[l];
            i++;
            l++;
        }

        while(r < rTab.length) {
            tab[i] = rTab[r];
            i++;
            r++;
        }
    }
}
