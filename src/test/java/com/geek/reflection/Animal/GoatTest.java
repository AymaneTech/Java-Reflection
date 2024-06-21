package com.geek.reflection.Animal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class GoatTest {

    private Goat goat;
    private Class<?> clazz;

    @BeforeEach
    void setUp() throws Exception {
        goat = new Goat();
        clazz = goat.getClass();
    }

    @Test
    public void givenObject_whenGetsClassName_thenCorrect() {
        assertEquals("Goat", clazz.getSimpleName());
        assertEquals("com.geek.reflection.Animal.Goat", clazz.getName());
        assertEquals("com.geek.reflection.Animal.Goat", clazz.getCanonicalName());
    }

    @Test
    public void givenClass_whenRecognisesModifiers_thenCorrect() throws ClassNotFoundException {
        Class<?> animalClass = Class.forName("com.geek.reflection.Animal.Animal");

        int goatMods = clazz.getModifiers();
        int animalMods = animalClass.getModifiers();

        assertTrue(Modifier.isPublic(goatMods));
        assertTrue(Modifier.isAbstract(animalMods));
        assertTrue(Modifier.isPublic(animalMods));
    }

    @Test
    public void givenClass_whenGetsPackageInfo_thenCorrect() {
        Package pkg = clazz.getPackage();

        assertEquals("com.geek.reflection.Animal", pkg.getName());
    }

    @Test
    public void testingConstructors() {
        System.out.println("constructors" + Arrays.toString(clazz.getConstructors()));

        assertEquals("Goat", clazz.getSimpleName());
    }

    @Test
    public void testMethods() {
        System.out.println(Arrays.toString(clazz.getMethods()));
        assertEquals("Goat", clazz.getSimpleName());
    }
}

