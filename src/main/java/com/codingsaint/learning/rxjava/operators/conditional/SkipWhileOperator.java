package com.codingsaint.learning.rxjava.operators.conditional;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class SkipWhileOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(SkipWhileOperator.class);

    public static void main(String[] args) {
        LOGGER.info("SkipWhile Operator");
        Observable<Integer> positveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(10));

        positveNumbers.skipWhile( integer -> {
            return integer<4;
        }).subscribe(new DemoObserver());
    }
}
