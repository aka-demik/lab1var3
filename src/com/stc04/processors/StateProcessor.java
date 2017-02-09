package com.stc04.processors;

/**
 * Интерфейс для слежения за состоянием обработки.
 */
public interface StateProcessor {

    /**
     * Метод используется поставщиком данных, для передачи информации об ошибке во входном потоке.
     *
     * @param ex ошибка, повлекшая остановку обработки.
     */
    void consumeException(Exception ex);

    /**
     * Флаг сигнализирующий нужно ли продолжать работу.
     *
     * @return true, если нужно продолжать и false - если пора остановиться.
     */
    boolean getActive();
}
