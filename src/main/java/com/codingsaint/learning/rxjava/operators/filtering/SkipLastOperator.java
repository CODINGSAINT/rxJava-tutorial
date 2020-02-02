package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkipLastOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(SkipLastOperator.class);

    public static void main(String[] args) {
        LOGGER.info("SkipLast Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .skipLast(5)
                .subscribe(new DemoObserver());


    }

}
