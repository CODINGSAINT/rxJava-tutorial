package com.codingsaint.learning.rxjava.operators.conditional;

import com.codingsaint.learning.rxjava.utils.RxUtils;
import io.reactivex.Observable;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ContainsOperator {
    private static final Logger LOGGER= LoggerFactory.getLogger(ContainsOperator.class);
    public static void main(String[] args) {
        LOGGER.info("contains Operator");
        Observable<Integer> positveNumbers= Observable.fromIterable(RxUtils.postiveNumbers(10));
        positveNumbers.contains(10).subscribe(new SingleObserver<Boolean>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onSuccess(Boolean result) {
                LOGGER.info("element present {}",result);
            }

            @Override
            public void onError(Throwable throwable) {

            }
        });




    }
}
