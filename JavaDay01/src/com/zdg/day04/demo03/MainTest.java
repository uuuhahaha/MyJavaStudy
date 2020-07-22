package com.zdg.day04.demo03;

/*
* 测试包子铺和吃货类
* */

import java.util.concurrent.*;

public class MainTest {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();

        Baozipu baozipu = new Baozipu(baozi);

        Chihuo chihuo = new Chihuo(baozi);
        //一般创建线程池
        //ExecutorService executorService = Executors.newFixedThreadPool(3);

        //阿里推荐采用的创建线程池的方法
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 5, 3, TimeUnit.MINUTES, new LinkedBlockingQueue<>());

        //方法一
        //Thread baozipuThread = new Thread(baozipu);
        //Thread chihuoThread = new Thread(chihuo);
        //baozipuThread.start();
        //chihuoThread.start();

        threadPoolExecutor.submit(baozipu);
        threadPoolExecutor.submit(chihuo);

        //方法二 线程池
        //executorService.submit(baozipu);
        //executorService.submit(chihuo);
        //executorService.shutdown();
    }
}
