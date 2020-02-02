package com.codingsaint.learning.rxjava.operators.transforming;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class FlatMapOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlatMapOperator.class);

    public static void main(String[] args) {
        LOGGER.info("FlatMap Operator");
        List<Integer> positiveIntegers = RxUtils.postiveNumbers(10);
        Observable.fromIterable(positiveIntegers)
                .flatMap(integer -> {
                    return twice(integer);
                })
                .subscribe(new DemoObserver());
    }

    public static Observable<Integer> twice(Integer integer) {
        return Observable.create(observableEmitter -> {
            if (!observableEmitter.isDisposed()) {
                observableEmitter.onNext(integer * 2);
            } else {
                observableEmitter.onComplete();
            }
        });
    }
}
