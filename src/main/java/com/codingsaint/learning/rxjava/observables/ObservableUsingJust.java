package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.observer.DemoObserver;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObservableUsingJust {

    private static final Logger LOGGER= LoggerFactory.getLogger(ObservableUsingJust.class);

    public static void main(String ...args){
        Observable.just("a","b","c","d","e","f","g","h","i","j")
                .subscribe(new DemoObserver());
    }
}
