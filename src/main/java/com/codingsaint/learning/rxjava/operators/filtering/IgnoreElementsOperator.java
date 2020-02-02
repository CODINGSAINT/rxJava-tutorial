package com.codingsaint.learning.rxjava.operators.filtering;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.CompletableObserver;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IgnoreElementsOperator {
    private static final Logger LOGGER = LoggerFactory.getLogger(IgnoreElementsOperator.class);

    public static void main(String[] args) {
        LOGGER.info("IgnoreElements Operator");
        Observable.fromIterable(RxUtils.primeNumbers(10))
                .ignoreElements()
                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(Disposable disposable) {
                        LOGGER.info("onSubscribe");

                    }

                    @Override
                    public void onComplete() {
                        LOGGER.info("onComplete");

                    }

                    @Override
                    public void onError(Throwable throwable) {
                        LOGGER.info("onError");
                    }
                });

    }

}
