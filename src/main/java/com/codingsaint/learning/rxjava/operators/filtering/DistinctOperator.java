package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

public class DistinctOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(DistinctOperator.class);

    public static void main(String[] args) {
        LOGGER.info("Distinct Operator");
        Observable.just(1, 2, 3, 2, 4, 1, 2, 3, 4, 5)
                .distinct()
                .subscribe(new DemoObserver());
    }
}
