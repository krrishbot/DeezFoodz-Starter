package com.raywenderlich.android.deezfoodz.dagger;

import android.content.Context;

import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenter;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenter;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sai on 11/10/2017.
 */
@Module
public class PresenterModule {

    @Provides
    FoodPresenter providesFoodPresenter(Context context)
    {
        return new FoodPresenterImpl(context);
    }
    @Provides
    FoodzPresenter providesFoodzPresenter(Context context){
        return new FoodzPresenterImpl(context);
    }
}
