package ro.ctrln.builder;

import java.util.ArrayList;

public class Team {

    public static void main(String[] args) {

        ArrayList<Programmer> programmers = new ArrayList<>();
//        Programmer programmerOne = new Programmer();
        programmers.add(Programmer.builder()
                        .name("John")
                        .programmingLanguage("Java")
                .build());

        programmers.add(Programmer.builder()
                        .lastName("Eva")
                        .programmingLanguage("Scala")
                        .skillLevel(9)
                .build());

        programmers.add(Programmer.builder()
                        .name("John")
                        .lastName("Doe")
                .build());

        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(Developer.builder()
                        .name("Erica")
                        .lastName("Jane")
                        .programmingLanguage("Python")
                .build());

        developers.add(Developer.builder()
                        .name("Io")
                        .programmingLanguage("C++")
                        .skillLevel(10)
                .build());
    }
}
