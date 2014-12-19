package com.lidynast.customdialog.dialog;

import com.lidynast.customdialog.dialog.effects.BaseEffects;
import com.lidynast.customdialog.dialog.effects.FadeIn;
import com.lidynast.customdialog.dialog.effects.Fall;
import com.lidynast.customdialog.dialog.effects.FlipH;
import com.lidynast.customdialog.dialog.effects.FlipV;
import com.lidynast.customdialog.dialog.effects.NewsPaper;
import com.lidynast.customdialog.dialog.effects.RotateBottom;
import com.lidynast.customdialog.dialog.effects.RotateLeft;
import com.lidynast.customdialog.dialog.effects.Shake;
import com.lidynast.customdialog.dialog.effects.SideFall;
import com.lidynast.customdialog.dialog.effects.SlideBottom;
import com.lidynast.customdialog.dialog.effects.SlideLeft;
import com.lidynast.customdialog.dialog.effects.SlideRight;
import com.lidynast.customdialog.dialog.effects.SlideTop;
import com.lidynast.customdialog.dialog.effects.Slit;


/**
 * Created by lee on 2014/7/30.
 */
public enum  Effectstype {

    Fadein(FadeIn.class),
    Slideleft(SlideLeft.class),
    Slidetop(SlideTop.class),
    SlideBottom(SlideBottom.class),
    Slideright(SlideRight.class),
    Fall(Fall.class),
    Newspager(NewsPaper.class),
    Fliph(FlipH.class),
    Flipv(FlipV.class),
    RotateBottom(RotateBottom.class),
    RotateLeft(RotateLeft.class),
    Slit(Slit.class),
    Shake(Shake.class),
    Sidefill(SideFall.class);
    private Class<? extends BaseEffects> effectsClazz;

    private Effectstype(Class<? extends BaseEffects> mclass) {
        effectsClazz = mclass;
    }

    public BaseEffects getAnimator() {
        BaseEffects bEffects=null;
	try {
		bEffects = effectsClazz.newInstance();
	} catch (ClassCastException e) {
		throw new Error("Can not init animatorClazz instance");
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		throw new Error("Can not init animatorClazz instance");
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		throw new Error("Can not init animatorClazz instance");
	}
	return bEffects;
    }
}
