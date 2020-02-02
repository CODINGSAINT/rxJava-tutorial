package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementAtOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElementAtOperator.class);

    public static void main(String[] args) {
        LOGGER.info("ElementAt Operator");
        Observable.fromIterable(
                RxUtils.postiveNumbers(10)
        ).elementAt(11).subscribe(new MaybeObserver<Integer>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                LOGGER.info("onSubscribe");
            }

            @Override
            public void onSuccess(Integer integer) {
                LOGGER.info("onSuccess {}", integer);
            }

            @Override
            public void onError(Throwable throwable) {
                LOGGER.info("onError ", throwable.getMessage());
            }

            @Override
            public void onComplete() {
                LOGGER.info("onComplete ");

            }
        });

    }
}
