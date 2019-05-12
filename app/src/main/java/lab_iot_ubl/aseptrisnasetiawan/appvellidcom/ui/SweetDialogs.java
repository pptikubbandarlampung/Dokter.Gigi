package lab_iot_ubl.aseptrisnasetiawan.appvellidcom.ui;

import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;

import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.ontbee.legacyforks.cn.pedant.SweetAlert.SweetAlertDialog;

import lab_iot_ubl.aseptrisnasetiawan.appvellidcom.R;
import lab_iot_ubl.aseptrisnasetiawan.appvellidcom.features.RegisterGambarDokter;


/**
 * Created by github.com/adip28 on 7/17/2018.
 */
public class SweetDialogs {

//    public static void commonSuccess(RegisterGambarDokter registerGambarDokter, String message) {
//
//        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE);
//        dialog.setCancelable(false);
//        dialog.setTitleText("Berhasil Memuat permintaan");
//        dialog.setContentText(body);
//        dialog.setConfirmText("OK");
//        dialog.setConfirmClickListener(sweetAlertDialog -> {
//            sweetAlertDialog.dismissWithAnimation();
//            listener.onClosed("Sukses");
//        });
//        dialog.show();
//    }
//    }

    public interface onDialogClosed{
        void onClosed(String string);
    }
    public static void commonWarning(Activity context, String title, String content, boolean close) {
        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE);
        dialog.setCancelable(true);
        dialog.setTitleText(title);
        dialog.setContentText(content);
        dialog.setConfirmText("OK");
        dialog.setCustomImage(R.drawable.doctor);
        dialog.setConfirmClickListener((SweetAlertDialog sweetAlertDialog) -> {
            sweetAlertDialog.dismissWithAnimation();
            if(close)
                context.finish();
        });
        dialog.show();
    }
    public static void commonError(Activity context, String content, boolean close) {
        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
        dialog.setCancelable(false);
        dialog.setTitleText("Gagal memuat permintaan");
        dialog.setContentText(content);
        dialog.setConfirmText("OK");
        dialog.setCustomImage(R.drawable.doctor);
        dialog.setConfirmClickListener(sweetAlertDialog -> {
            sweetAlertDialog.dismissWithAnimation();
            if(close)
                context.finish();
        });
        dialog.show();
    }

    public static void endpointError(Activity context) {
        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
        dialog.setCancelable(false);
        dialog.setTitleText("Oops!");
        dialog.setContentText("Koneksi internet Anda sedang tidak stabil atau server mengalami gangguan, silahkan coba beberapa saat lagi");
        dialog.setConfirmText("OK");
        dialog.setCustomImage(R.drawable.doctor);
        dialog.setConfirmClickListener(sweetAlertDialog -> {
            sweetAlertDialog.dismissWithAnimation();
            //App.getPref().clear();
            context.finish();
        });
        try {
            dialog.show();
        }catch (Exception e){
            e.printStackTrace();

        }
    }
    public static void commonError(Activity context, String title, String content, onDialogClosed listener) {
        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE);
        dialog.setCancelable(true );
        dialog.setTitleText(title);
        dialog.setContentText(content);
        dialog.setConfirmText("OK");
        dialog.setConfirmClickListener(sweetAlertDialog -> {
            sweetAlertDialog.dismissWithAnimation();
            listener.onClosed("closed");
        });
        dialog.show();
    }

    public static void commonLogout(Activity context, String title, String content, onDialogClosed listener) {
        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
        dialog.setCancelable(true);
        dialog.setTitleText(title);
        dialog.setContentText(content);
        dialog.setConfirmText("OK");
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCustomImage(R.drawable.doctor);
        dialog.setConfirmClickListener(sweetAlertDialog -> {
            sweetAlertDialog.dismissWithAnimation();
            listener.onClosed("closed");
        });
        dialog.show();
    }

//    public static void locationDisabledWarning(Activity context) {
//        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
//        dialog.setCancelable(false);
//        dialog.setTitleText("Lokasi Tidak aktif");
//        dialog.setContentText("Lokasi Anda tidak aktif, aktifkan lokasi terlebih dahulu untuk melanjutkan");
//        dialog.setConfirmText("Settings");
//        dialog.setCustomImage(CustomDrawable.googleMaterialDrawable(
//                context, R.color.colorPrimaryDark, 36,
//                GoogleMaterial.Icon.gmd_gps_off
//        ));
//        dialog.setConfirmClickListener(sweetAlertDialog -> {
//            sweetAlertDialog.dismissWithAnimation();
//            Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
//            context.startActivity(intent);
//            context.finish();
//        });
//        dialog.show();
//    }

    public static void commonSuccess(Activity context, String body, onDialogClosed listener) {
        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE);
        dialog.setCancelable(false);
        dialog.setTitleText("Berhasil Memuat permintaan");
        dialog.setContentText(body);
        dialog.setConfirmText("OK");
        dialog.setConfirmClickListener(sweetAlertDialog -> {
            sweetAlertDialog.dismissWithAnimation();
            listener.onClosed("Sukses");
        });
        dialog.show();
    }

    public static void tripSuccess(Activity context, float Distance , boolean close) {
        SweetAlertDialog dialog = new SweetAlertDialog(context, SweetAlertDialog.SUCCESS_TYPE);
        dialog.setCancelable(false);
        dialog.setTitleText("Berhasil Memuat permintaan");
        dialog.setContentText("Total Jarak Trip Anda: "+Distance+" Meter");
        dialog.setConfirmText("OK");
        dialog.setConfirmClickListener(sweetAlertDialog -> {
            sweetAlertDialog.dismissWithAnimation();
            if(close)
                context.finish();

        });
        dialog.show();
    }

}
