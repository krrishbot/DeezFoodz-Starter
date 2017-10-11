package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.food.FoodActivity;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzActivity;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by sai on 10/10/2017.
 */
@Singleton
@Component (modules={AppModule.class , PresenterModule.class,NetworkModule.class})
public interface AppComponent {

    void inject(FoodActivity activity);

    void inject(FoodzActivity activity);
    void inject(FoodPresenterImpl foodPresenter);
    void inject(FoodzPresenterImpl foodzPresenter);
}
