package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObservableUsingRange {
    private static final Logger LOGGER = LoggerFactory.getLogger(ObservableUsingRange.class);

    public static void main(String... args) {
        Observable.range(2,10).
                subscribe(new DemoObserver());
    }
}
