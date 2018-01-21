package ua.pp.darknsoft;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import ua.pp.darknsoft.strategy.SortByAddress;
import ua.pp.darknsoft.strategy.SortByAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingSorts {

  Student st1 = new Student("John1", 12, new Address.Builder("Odessa1").houseNumber(4).build());
  Student st2 = new Student("John", 15, new Address.Builder("Odessa1").houseNumber(3).build());
  Student st3 = new Student("John", 19, new Address.Builder("Odessa2").houseNumber(1).build());

  @Test
  public void naturalOrderingTest() {
    List<Student> list = new ArrayList<>();

    list.add(st1);
    list.add(st2);
    list.add(st3);
    Collections.sort(list);
    assertThat("John", is(list.get(0).getName()));
    assertThat("John", is(list.get(1).getName()));
    assertThat("John1", is(list.get(2).getName()));
  }

  @Test
  public void sortByAgeTest() {
    List<Student> list = new ArrayList<>();

    list.add(st1);
    list.add(st2);
    list.add(st3);
    Collections.sort(list, new SortByAge());
    assertThat(12, is(list.get(0).getAge()));
    assertThat(15, is(list.get(1).getAge()));
    assertThat(19, is(list.get(2).getAge()));
  }

  @Test
  public void sortByAddressTest() {
    List<Student> list = new ArrayList<>();

    list.add(st1);
    list.add(st2);
    list.add(st3);
    Collections.sort(list, new SortByAddress());
    assertThat("Odessa1", is(list.get(0).getAddress().getCity()));
    assertThat("Odessa1", is(list.get(1).getAddress().getCity()));
    assertThat("Odessa2", is(list.get(2).getAddress().getCity()));
  }

}
