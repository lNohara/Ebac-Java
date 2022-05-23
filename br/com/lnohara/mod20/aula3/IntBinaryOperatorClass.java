package br.com.lnohara.mod20.aula3;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorClass implements IntBinaryOperator {
    @Override
    public int applyAsInt(int left, int right) {
        return left + right;
    }
}
