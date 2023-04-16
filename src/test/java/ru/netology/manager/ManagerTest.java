package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    @Test

    public void test() {

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";

        Manager manager = new Manager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = { "Film I", "Film II", "Film III" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test2() {

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";

        Manager manager = new Manager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);

        String[] expected = { "Film I", "Film II", "Film III", "Film IV" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test3() {

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";


        Manager manager = new Manager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);


        String[] expected = { "Film I", "Film II", "Film III", "Film IV", "Film V", "Film VI", "Film VII", "Film VIII" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test4() {

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";

        Manager manager = new Manager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = { "Film III", "Film II", "Film I" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test5() {

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";

        Manager manager = new Manager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);

        String[] expected = { "Film V", "Film IV", "Film III", "Film II", "Film I" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test6() {

        String film1 = "Film A";
        String film2 = "Film B";
        String film3 = "Film C";
        String film4 = "Film D";
        String film5 = "Film E";
        String film6 = "Film F";
        String film7 = "Film G";
        String film8 = "Film H";
        String film9 = "Film I";
        String film10 = "Film J";

        Manager manager = new Manager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = { "Film J", "Film I", "Film H", "Film G", "Film F", "Film E", "Film D", "Film C", "Film B", "Film A" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void test7() {

        String film1 = "Film A";
        String film2 = "Film B";
        String film3 = "Film C";
        String film4 = "Film D";
        String film5 = "Film E";
        String film6 = "Film F";
        String film7 = "Film G";
        String film8 = "Film H";
        String film9 = "Film I";
        String film10 = "Film J";
        String film11 = "Film K";

        Manager manager = new Manager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);

        String[] expected = { "Film K", "Film J", "Film I", "Film H", "Film G", "Film F", "Film E", "Film D", "Film C", "Film B" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}