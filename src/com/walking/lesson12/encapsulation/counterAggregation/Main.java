package com.walking.lesson12.encapsulation.counterAggregation;

// Используя за основу задачу из темы про классы и объекты, реализовать класс счетчика, который хранит название счетчика и его значение,
// его единицы измерения, а также обеспечивает доступ к значениям. Название счетчика и его единицы измерения должны быть неизменны.
//Также реализовать сервис CounterService, зона ответственности которого — хранение массива доступных счетчиков, получение всех доступных счетчиков,
// получение доступа к счетчику по названию, увеличение значения счетчика на единицу или заданное значение, а также сброс счетчика до нулевого значения.
// Ответственность класса, содержащего main() — создание счетчиков. Сам класс также предлагаю назвать Main.
// Также реализовать в классе Main приватный метод, который позволяет вывести значения счетчиков в виде:
//    <Название счетчика>: <Значение счетчика>

import com.walking.lesson12.encapsulation.counterAggregation.service.CounterService;
import com.walking.lesson12.encapsulation.counterAggregation.model.Counter;

public class Main {
    public static final String COLD_WATER_NAME = "Cold Water";
    public static final String HOT_WATER_NAME = "Hot water";

    public static final String GAS_NAME = "Gas";
    public static final String ELECTRIC_NAME = "Electric";

    public static final String M3_UNIT = "m3";
    public static final String KWH_UNIT = "kWh";

    public static void main(String[] args) {
        Counter coldWaterCounter = new Counter(COLD_WATER_NAME, M3_UNIT);
        Counter hotWaterCounter = new Counter(HOT_WATER_NAME, M3_UNIT);
        Counter gasCounter = new Counter(GAS_NAME, M3_UNIT);
        Counter electricCounter = new Counter(ELECTRIC_NAME, KWH_UNIT);

        CounterService counterService = new CounterService(coldWaterCounter, hotWaterCounter, gasCounter, electricCounter);

        counterService.increaseCounter(COLD_WATER_NAME, 20);
        counterService.incrementCounter(hotWaterCounter);
        counterService.incrementCounter(gasCounter);
        counterService.increaseCounter(electricCounter, 33);
        counterService.increaseCounter(gasCounter, 137);
        counterService.increaseCounter(hotWaterCounter, 23);

        printCounter(counterService.getAllCounters());
    }

    private static void printCounter(Counter[] counters) {
        for (Counter counter : counters) {
            System.out.printf("%s: %s\n", counter.getName(), counter.getValue());
        }
    }
}
