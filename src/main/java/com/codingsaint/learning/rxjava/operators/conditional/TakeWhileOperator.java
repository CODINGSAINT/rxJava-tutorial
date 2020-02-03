package com.codingsaint.learning.rxjava.operators.conditional;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeWhileOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(TakeWhileOperator.class);

    public static void main(String[] args) {
        LOGGER.info("TakeWhile Operator");
        Observable<Integer> positveNumbers = Observable.fromIterable(RxUtils.postiveNumbers(10));

        positveNumbers.takeWhile( integer -> {
            return integer<4;
        }).subscribe(new DemoObserver());
    }
}
