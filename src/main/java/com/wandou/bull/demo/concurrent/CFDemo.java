//package com.wandou.bull.demo.concurrent;
//
//import com.google.common.base.Stopwatch;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//
///**
// * @author liming
// * @date 2022/1/26 11:50
// */
//
//public class CFDemo {
//
//
//    public static void main(String[] args) {
//
//        CompletableFuture[] cfs = CompletableFuture.runAsync(() -> vis()).exceptionally(throwable -> {
//            System.out.println("eee");
//            return null;
//        })
//
//
//        CompletableFuture[] completableFutures = visitorList.stream()
//                .map((Function<BargainResponseItemVisitor, CompletableFuture>) bargainResponseItemVisitor -> CompletableFuture
//                        .runAsync(() -> {
//                            Stopwatch stopwatch = Stopwatch.createStarted();
//                            bargainResponseItemVisitor
//                                    .visit(userVo, response, vo, boostRecordVos, requestSource, userProfile);
//                            stopwatch.stop();
//                            QMonitor.recordQuantile(
//                                    "bargain_info_task_" + bargainResponseItemVisitor.getClass().getSimpleName(),
//                                    stopwatch.elapsed(TimeUnit.MILLISECONDS));
//                        }, bargainQueryExecutor).exceptionally(throwable -> {
//                            QMonitor.recordOne(bargainResponseItemVisitor.getClass().getSimpleName() + "_error");
//                            log.error("构造response失败,", throwable);
//                            return null;
//                        })).toArray(CompletableFuture[]::new);
//    }
//}
