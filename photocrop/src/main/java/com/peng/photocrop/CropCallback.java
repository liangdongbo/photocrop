package com.peng.photocrop;

import android.content.Intent;
import android.net.Uri;

/**
 * Created with Android Studio.
 * User: ryan@xisue.com
 * Date: 10/1/14
 * Time: 11:00 AM
 * Desc: CropCallback
 * Revision:
 * - 10:20 2014/10/01 The basic interfaces.
 * - 13:00 2014/10/03 Able to get access to the CropParams the related Context.
 * - 23:00 2015/09/05 Remove getContext, rename onCancel, onFailed, add handleIntent.
 */
public interface CropCallback {

    void onPhotoCropped(Uri uri);//图片裁剪

    void onPhotoSelected(Uri uri);//图片选择

    void onPhotoTaken(Uri uri);//图片拍照

    void onPhotoCompressed(Uri uri);//图片压缩

    void onCancel(int requestCode);//取消操作

    void onFailed(String message);//失败操作

    void handleIntent(Intent intent, int requestCode);//进行startActivityForResult

    CropParams getCropParams();//获取裁剪参数
}
