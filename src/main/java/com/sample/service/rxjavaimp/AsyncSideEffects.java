package com.sample.service.rxjavaimp;

import com.sample.service.JavaPrograms.Country;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import oracle.sql.TIMESTAMP;
import org.apache.commons.lang3.StringUtils;
import rx.Observable;
import rx.schedulers.Schedulers;

public class AsyncSideEffects {

  //properties

  String name;
  int age;

  //functions

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  //constructor


  public static void main(String[] args) {

   /* AtomicInteger value = new AtomicInteger(1);

    List<Observable<Integer>> tasks = new ArrayList<>();

    do {
      tasks.add(
          Observable.fromCallable(new TaskCallable(value.getAndIncrement()))
              .subscribeOn(Schedulers.io())
              .timeout(3, TimeUnit.SECONDS));
    } while (value.get() <= 5);

    Observable.merge(tasks,10)
        .toBlocking()
        .subscribe(System.out::println);

    System.out.println("Processing started");*/
   
    System.out.println(Country.GBR.getCode());
    Country[] values = Country.values();
    Country.GBR.name();

    String neetha = StringUtils.leftPad("neetha", 9, '0');

    System.out.println(neetha);
    System.out.println(LocalDate.now());
    System.out.println(LocalDate.now().toEpochDay());
    System.out.println(LocalDate.now().toString());
    System.out.println(LocalDateTime.of(2019,07,04,12,0)
        .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());

    System.out.println(Instant.now().toEpochMilli());

    LocalDateTime localDateTime = LocalDateTime.of(2019, 07, 04, 18, 30);

    System.out.println("gg"+localDateTime.toEpochSecond(ZoneOffset.UTC));


    LocalDate localDate = LocalDate.of(2019,7,5);

    long epoch = localDate.atStartOfDay().atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();

    long l = localDate
        .atStartOfDay()
        .atZone(ZoneId.systemDefault())
        .withZoneSameInstant(ZoneOffset.UTC)
        .toInstant().toEpochMilli();
    System.out.println("orrrr"+l);

    long xx= localDate
        .atStartOfDay()
        .atZone(ZoneId.systemDefault())
        .toInstant().toEpochMilli();

    System.out.println("chnage"+xx);

    System.out.println("eccc"+epoch);
// To convert epoch back to date
    LocalDate convertedDate = Instant.ofEpochMilli(1562265000000L).atZone(ZoneOffset.UTC).toLocalDate();
    System.out.println(localDate);
    System.out.println(convertedDate);

  }
}
