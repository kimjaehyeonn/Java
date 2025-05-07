package practice.advanced.ch15.sec05.exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
    @Getter
    @Setter
    @AllArgsConstructor
public class Student implements Comparable<Student>{
        private int num;
        private String name;
        private String email;
        private String url;

        @Override
        public int compareTo(Student o) {
            return this.name.compareTo(o.name);
        }
    }


