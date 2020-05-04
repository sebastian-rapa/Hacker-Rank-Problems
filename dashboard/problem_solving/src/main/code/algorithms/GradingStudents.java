package main.code.algorithms;

import java.util.List;
import java.util.stream.Collectors;

class GradingStudents {

    static List<Integer> gradingStudents(List<Integer> grades) {

        return grades
                .stream()
                .map(integer ->
                        integer % 5 < 3 || integer < 38 ?
                        integer :
                        integer + (5 - (integer % 5))
                )
                .collect(Collectors.toList());
    }
}
