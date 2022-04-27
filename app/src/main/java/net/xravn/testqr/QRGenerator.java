package net.xravn.testqr;

import android.graphics.Bitmap;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;


public class QRGenerator {

    public static void setQR(String text, ImageView imageView) {
        imageView.setImageBitmap(generateQR(text, imageView.getWidth(), imageView.getHeight()));
    }

    public static Bitmap generateQR(String text, int width, int height) {
        return QRCode.from(text).withSize(width, height).bitmap();
    }
}
