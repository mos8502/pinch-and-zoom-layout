package hu.nemi.pinchandzoomlayout.scale;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by nemi on 30/05/16.
 */

public interface Scale {
    int TYPE_SCALE_UP = 1;
    int TYPE_SCALE_DOWN = 0;

    @IntDef(value = {TYPE_SCALE_DOWN, TYPE_SCALE_UP})
    @Retention(RetentionPolicy.SOURCE)
    @interface Type {

    }
    void updateScale(float incrementalScale);
    float getScale();
    @Type int getType();
}
