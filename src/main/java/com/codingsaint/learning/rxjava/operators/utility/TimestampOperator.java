package com.codingsaint.learning.rxjava.operators.utility;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class TimestampOperator {
    private static final Logger LOGGER= LoggerFactory.getLogger(TimeoutOperator.class);

    public static void main(String[] args) {
        LOGGER.info("Timestamp Operator");
        Observable.fromIterable(RxUtils.shapes(10))
                .timestamp().subscribe(new DemoObserver());

    }
}
