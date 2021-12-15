package com.fai.jdk17;

public class JDK17_5_SealedClass {

    sealed interface JungleAnimal permits Tiger, Monkey{ }

    static final class Tiger implements JungleAnimal {}

    static non-sealed class Monkey implements JungleAnimal {}

}


