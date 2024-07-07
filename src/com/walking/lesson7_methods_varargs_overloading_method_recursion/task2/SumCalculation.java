package com.walking.lesson7_methods_varargs_overloading_method_recursion.task2;

// Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void. Возвращать:
// Для числовых типов — тот же тип. Даже если это ведет к потере точности.
// При угрозе потери данных — выводить сообщение в консоль и возвращать текущий результат (для byte, short, int);
// Для boolean — определение истинности всех переданных параметров, принимая то, что их стоит объединять через логическое И;
// Для char — строку, полученную в результате конкатенации всех переданных параметров.
// Количество параметров может быть любым. Используйте перегрузку — у всех методов должны быть одинаковые названия.

public class SumCalculation {
    public static void main(String[] args) {
        System.out.println(getSum((byte) 4, (byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10));
        System.out.println(getSum((short) 4, (short) 5, (short) 6, (short) 7, (short) 8, (short) 9, (short) 10));
        System.out.println(getSum(2, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(getSum(10.0f, 23.3f, 45.7f));
        System.out.println(getSum(10.2d, 23.3d, 45.7d));
        System.out.println(getSum('a', 'b', 'c', 'd', 'e', 'f'));
    }

    static byte getSum(byte... bytes) {
        byte result = 0;

        for (byte b : bytes) {
            if (checkRange(Byte.MIN_VALUE, Byte.MAX_VALUE, result, b)) {
                System.out.println("Byte value out of range. Return current result.");

                return result;
            }

            result += b;
        }

        return result;
    }

    static short getSum(short... shorts) {
        short result = 0;

        for (short sh : shorts) {
            if (checkRange(Short.MIN_VALUE, Short.MAX_VALUE, result, sh)) {
                System.out.println("Short value out of range. Return current result.");

                return result;
            }

            result += sh;
        }

        return result;
    }

    static int getSum(int... ints) {
        int result = 0;

        for (int i : ints) {
            if (checkRange(Integer.MIN_VALUE, Integer.MAX_VALUE, result, i)) {
                System.out.println("Int value out of range. Return current result.");

                return result;
            }

            result += i;
        }

        return result;
    }

    static long getSum(long... longs) {
        long result = 0;

        for (long l : longs) {
            result += l;
        }

        return result;
    }

    static float getSum(float... floats) {
        float result = 0;

        for (float f : floats) {
            result += f;
        }

        return result;
    }

    static double getSum(double... doubles) {
        double result = 0;

        for (double d : doubles) {
            result += d;
        }

        return result;
    }

    static boolean getSum(boolean... booleans) {
        for (boolean b : booleans) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    static String getSum(char... chars) {
        String result = "";

        for (char c : chars) {
            result += c;
        }

        return result;
    }

    static boolean checkRange(long minRange, long maxRange, long currentSum, long nextValue) {
        long checkSum = currentSum + nextValue;

        return checkSum < minRange || checkSum > maxRange;
    }
}
