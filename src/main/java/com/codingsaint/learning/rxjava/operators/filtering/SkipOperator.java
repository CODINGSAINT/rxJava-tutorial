package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SkipOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(SkipOperator.class);

    public static void main(String[] args) {
        LOGGER.info("Skip Operator");
        Observable.fromIterable(RxUtils.postiveNumbers(10))
                .skip(5)
                .subscribe(new DemoObserver());


    }

}
