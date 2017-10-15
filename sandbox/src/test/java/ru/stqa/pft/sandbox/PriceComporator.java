package ru.stqa.pft.sandbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by User on 15.10.2017.
 */
public class PriceComporator {
    private PriceComporator INSTANCE;
    public PriceComporator() {
        this.INSTANCE = new PriceComporator();
    }

    public PriceComporator getINSTANCE() {
        return INSTANCE;
        int n = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(Integer.parseInt(n)));
    }
}
