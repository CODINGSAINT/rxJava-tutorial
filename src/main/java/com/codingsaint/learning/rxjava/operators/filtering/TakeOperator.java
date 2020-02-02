package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TakeOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(TakeOperator.class);

    public static void main(String[] args) {
        LOGGER.info("Take Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .take(2)
                .subscribe(new DemoObserver());


    }

}
