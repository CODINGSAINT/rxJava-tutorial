package com.codingsaint.learning.rxjava.operators.transforming;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BufferOperator {
private static final Logger LOGGER= LoggerFactory.getLogger(BufferOperator.class);

    public static void main(String[] args) {
        Observable.fromIterable(RxUtils.shapes(10))
                .buffer(3)
                .subscribe(new DemoObserver());

    }
}
