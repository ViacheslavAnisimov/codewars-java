package kyu8;

import java.util.*;

public class UnfinishedLoopBugFixing1 {
    public static List CreateList(int number) {
        List list = new ArrayList();

        for(int count = 1; count <= number; count++) {
            list.add(count);
        }

        return list;
    }
}
