package com.parking.lot.core.usecases;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface UseCaseExecutor {

    /**
     *
     * @param usecase
     * @param input
     * @param outputMapper
     * @return
     * @param <R> response
     * @param <I> input
     * @param <O> output
     */
    <R, I extends UseCase.Input, O extends UseCase.Output> CompletableFuture<R> execute(
            UseCase<I, O> usecase,
            I input,
            Function<O, R> outputMapper
    );

}
