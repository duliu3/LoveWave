/**
 * Copyright (C)  2016 深圳市狗尾草智能科技有限公司
 * Holoera
 * DpAndPxUtil.java
 */
package star.wavelove;

import android.content.Context;

/**
 * @author duliu3
 * @since 2016/9/20 18:18
 * @version 1.0
 * <p><strong>Features draft description.主要功能介绍</strong></p>
 */
public class DpAndPxUtil {

    // ===========================================================
    // Constants
    // ===========================================================

    private static final String TAG = DpAndPxUtil.class.getSimpleName();

    /**
     * dip-->px
     */
    public static int dip2Px(Context context, int dip) {
        // px/dip = density;
        float density = context.getResources().getDisplayMetrics().density;
        int px = (int) (dip * density + .5f);
        return px;
    }

    /**
     * px-->dip
     */
    public static int px2Dip(Context context, int px) {
        // px/dip = density;
        float density = context.getResources().getDisplayMetrics().density;
        int dip = (int) (px / density + .5f);
        return dip;
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2Dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
