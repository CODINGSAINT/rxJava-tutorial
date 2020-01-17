package com.codingsaint.learning.rxjava.observables;

import com.codingsaint.learning.rxjava.models.Shape;
import com.codingsaint.learning.rxjava.observer.DemoObserver;
import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ObservableUsingCreate {
    private static final Logger LOGGER= LoggerFactory.getLogger(ObservableUsingCreate.class);

    public static void main(String ...args){
        List<Shape> shapes= RxUtils.shapes(15);

        Observable.create(new ObservableOnSubscribe<Object>() {
            @Override
            public void subscribe(ObservableEmitter<Object> observableEmitter) throws Exception {
            try{
                shapes.forEach(observableEmitter::onNext);
            }
            catch(Exception e){
                observableEmitter.onError(e);
            }
            observableEmitter.onComplete();
            }
        }).subscribe(new DemoObserver());

    }
}
