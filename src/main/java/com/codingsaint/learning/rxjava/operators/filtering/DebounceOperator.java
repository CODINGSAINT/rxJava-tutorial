package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DebounceOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DebounceOperator.class);
    private static List<Character> changeIt = new ArrayList<>();

    public static void main(String[] args) {
        LOGGER.info("Debounce Operator");
        Random r = new Random();
        Observable.interval(2, TimeUnit.SECONDS)
                .map(c -> {
                    changeIt.add((char) (r.nextInt(26) + 'a'));
                    return changeIt;
                }).doOnEach
                (notification -> {
                    LOGGER.info("Current Value ->{}", notification.getValue());
                })
                .debounce(2, TimeUnit.SECONDS)
                .observeOn(Schedulers.trampoline())
                .subscribe(new DemoObserver());
        RxUtils.sleep(10000);


    }
}
