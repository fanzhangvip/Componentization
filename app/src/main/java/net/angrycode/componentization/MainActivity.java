package net.angrycode.componentization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import net.angrycode.core.network.SimpleTextRequest;
import net.angrycode.data.*;
import net.angrycode.data.repository.Data;
import net.angrycode.data.repository.RepositoryFactory;
import net.angrycode.data.repository.local.LocalRepository;
import net.angrycode.data.repository.remote.RemoteRepository;
import net.angrycode.toolkit.view.SimpleDrawingView;

import org.reactivestreams.Publisher;

import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    TextView textView;
    SimpleTextRequest request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textView = (TextView) findViewById(R.id.tv_content);
//        request = new SimpleTextRequest(this, null);
//        request.request()
//                .subscribeOn(Schedulers.computation())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<String>() {
//                    @Override
//                    public void accept(@NonNull String s) throws Exception {
//                        textView.setText(s);
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(@NonNull Throwable throwable) throws Exception {
//                        textView.setText(throwable.getMessage());
//                    }
//                });
//        Flowable.fromCallable(new Callable<List<Data>>() {
//            @Override
//            public List<Data> call() throws Exception {
//                List<Data> dataList = RepositoryFactory.get().queryAll();
//                return dataList;
//            }
//        }).observeOn(AndroidSchedulers.mainThread())
//                .subscribeOn(Schedulers.io())
//                .subscribe(new Consumer<List<Data>>() {
//                    @Override
//                    public void accept(@NonNull List<Data> datas) throws Exception {
//                        textView.setText("data size:" + datas.size());
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(@NonNull Throwable throwable) throws Exception {
//                        textView.setText(throwable.getMessage());
//                    }
//                });
//        Flowable.just("one", "two", "three", "four", "five", "six")
//                .subscribeOn(Schedulers.computation())
//                .observeOn(Schedulers.single())
//                .subscribe(new Consumer<String>() {
//                    @Override
//                    public void accept(@NonNull String s) throws Exception {
//                        Log.e(TAG, s);
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(@NonNull Throwable throwable) throws Exception {
//                        Log.e(TAG, throwable.getMessage());
//                    }
//                });
//
//        Flowable.fromCallable(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                Thread.sleep(3000);
//                return "from callable";
//            }
//        }).flatMap(new Function<String, Publisher<String>>() {
//            @Override
//            public Publisher<String> apply(@NonNull String s) throws Exception {
//                return Flowable.just(s + " flat map");
//            }
//        }).subscribeOn(Schedulers.computation())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<String>() {
//                    @Override
//                    public void accept(@NonNull String s) throws Exception {
//                        Log.e(TAG, s);
//                        textView.setText(s);
//                    }
//                }, new Consumer<Throwable>() {
//                    @Override
//                    public void accept(@NonNull Throwable throwable) throws Exception {
//                        Log.e(TAG, throwable.getMessage());
//                    }
//                });
    }
}
