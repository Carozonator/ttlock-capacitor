package com.ttlockcapacitor.app;

//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.os.AsyncTask;
import android.os.Handler;
//import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

//import com.ttlock.bl.sdk.api.TTLockAPI;
import com.ttlock.bl.sdk.callback.TTLockCallback;
import com.ttlock.bl.sdk.entity.DeviceInfo;
import com.ttlock.bl.sdk.entity.Error;
import com.ttlock.bl.sdk.entity.LockData;
import com.ttlock.bl.sdk.scanner.ExtendedBluetoothDevice;


@NativePlugin()
public class TtlockCapacitor extends Plugin {
    private  static String text = "";

    public TtlockCapacitor() {
        this.text = " culo sucio";
    }

    /**
     * TTLock Callback
     */
    private TTLockCallback mTTLockCallback = new TTLockCallback() {

        @Override
        public void onFoundDevice(ExtendedBluetoothDevice extendedBluetoothDevice) {

        }

        @Override
        public void onDeviceConnected(ExtendedBluetoothDevice extendedBluetoothDevice) {

        }

        @Override
        public void onDeviceDisconnected(ExtendedBluetoothDevice extendedBluetoothDevice) {

        }

        @Override
        public void onGetLockVersion(ExtendedBluetoothDevice extendedBluetoothDevice, int protocolType, int protocolVersion, int scene, int groupId, int orgId, Error error) {

        }

        @Override
        public void onLockInitialize(ExtendedBluetoothDevice extendedBluetoothDevice, final LockData lockData, Error error) {

        }

        @Override
        public void onReadDeviceInfo(ExtendedBluetoothDevice extendedBluetoothDevice, DeviceInfo deviceInfo, Error error) {

        }

        @Override
        public void onOperateRemoteControl(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int operateType, int keyValue, Error error) {

        }

        @Override
        public void onOperateDoorSensorLocking(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int operationType, int operationValue, Error error) {

        }

        @Override
        public void onGetDoorSensorState(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int state, Error error) {

        }

        @Override
        public void onSetNBServer(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, Error error) {

        }


        @Override
        public void onResetEKey(ExtendedBluetoothDevice extendedBluetoothDevice, final int lockFlagPos, Error error) {

        }

        @Override
        public void onSetLockName(ExtendedBluetoothDevice extendedBluetoothDevice, String lockname, Error error) {

        }

        @Override
        public void onSetAdminKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, String adminCode, Error error) {

        }

        @Override
        public void onSetDeletePassword(ExtendedBluetoothDevice extendedBluetoothDevice, String deleteCode, Error error) {

        }

        @Override
        public void onUnlock(ExtendedBluetoothDevice extendedBluetoothDevice, int uid, int uniqueid, long lockTime, Error error) {

        }


        @Override
        public void onSetLockTime(ExtendedBluetoothDevice extendedBluetoothDevice, Error error) {

        }

        @Override
        public void onGetLockTime(ExtendedBluetoothDevice extendedBluetoothDevice, long lockTime, Error error) {

        }

        @Override
        public void onResetKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, final String pwdInfo, final long timestamp, final Error error) {

        }

        @Override
        public void onSetMaxNumberOfKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, int validPwdNum, Error error) {

        }

        @Override
        public void onResetKeyboardPasswordProgress(ExtendedBluetoothDevice extendedBluetoothDevice, int progress, Error error) {

        }

        @Override
        public void onResetLock(ExtendedBluetoothDevice extendedBluetoothDevice, Error error) {

        }

        @Override
        public void onAddKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, int keyboardPwdType, String password, long startDate, long endDate, Error error) {

        }

        @Override
        public void onModifyKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, int keyboardPwdType, String originPwd, String newPwd, Error error) {

        }

        @Override
        public void onDeleteOneKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, int keyboardPwdType, String deletedPwd, Error error) {

        }

        @Override
        public void onDeleteAllKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, Error error) {

        }

        @Override
        public void onGetOperateLog(ExtendedBluetoothDevice extendedBluetoothDevice, final String records, final Error error) {

        }

        @Override
        public void onSearchDeviceFeature(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int specialValue, Error error) {

        }

        @Override
        public void onAddICCard(ExtendedBluetoothDevice extendedBluetoothDevice, int status, int battery, long cardNo, Error error) {

        }

        @Override
        public void onModifyICCardPeriod(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, long cardNo, long startDate, long endDate, Error error) {

        }

        @Override
        public void onDeleteICCard(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, long cardNo, Error error) {

        }

        @Override
        public void onClearICCard(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, Error error) {

        }

        @Override
        public void onSetWristbandKeyToLock(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, Error error) {

        }

        @Override
        public void onSetWristbandKeyToDev(Error error) {

        }

        @Override
        public void onSetWristbandKeyRssi(Error error) {

        }

        @Override
        public void onAddFingerPrint(ExtendedBluetoothDevice extendedBluetoothDevice, int status, int battery, long fingerPrintNo, Error error) {

        }

        @Override
        public void onAddFingerPrint(ExtendedBluetoothDevice extendedBluetoothDevice, int status, int battery, long fingerPrintNo, int totalCount, Error error) {

        }

        @Override
        public void onFingerPrintCollection(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, Error error) {

        }

        @Override
        public void onFingerPrintCollection(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int currentCount, int totalCount, Error error) {

        }

        @Override
        public void onModifyFingerPrintPeriod(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, long fingerPrintNo, long startDate, long endDate, Error error) {

        }

        @Override
        public void onDeleteFingerPrint(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, long fingerPrintNo, Error error) {

        }

        @Override
        public void onClearFingerPrint(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, Error error) {

        }

        @Override
        public void onSearchAutoLockTime(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int currentTime, int minTime, int maxTime, Error error) {

        }

        @Override
        public void onModifyAutoLockTime(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int autoLockTime, Error error) {

        }

//        @Override
//        public void onReadDeviceInfo(ExtendedBluetoothDevice extendedBluetoothDevice, String modelNumber, String hardwareRevision, String firmwareRevision, String manufactureDate, String lockClock) {
//
//        }

        @Override
        public void onEnterDFUMode(ExtendedBluetoothDevice extendedBluetoothDevice, Error error) {

        }

        @Override
        public void onGetLockSwitchState(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int status, Error error) {

        }

        @Override
        public void onLock(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int uid, int uniqueid, long lockTime, Error error) {

        }

        @Override
        public void onScreenPasscodeOperate(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int status, Error error) {

        }

        @Override
        public void onRecoveryData(ExtendedBluetoothDevice extendedBluetoothDevice, int op, Error error) {

        }

        @Override
        public void onSearchICCard(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, String json, Error error) {

        }

        @Override
        public void onSearchFingerPrint(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, String json, Error error) {

        }

        @Override
        public void onSearchPasscode(ExtendedBluetoothDevice extendedBluetoothDevice, String json, Error error) {

        }

        @Override
        public void onSearchPasscodeParam(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, String pwdInfo, long timestamp, Error error) {

        }

        @Override
        public void onOperateRemoteUnlockSwitch(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int operateType, int state, int specialValue, Error error) {

        }

        @Override
        public void onOperateAudioSwitch(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, int operateType, int state, Error error) {

        }

        @Override
        public void onGetElectricQuantity(ExtendedBluetoothDevice extendedBluetoothDevice, int electricQuantity, Error error) {

        }

        @Override
        public void onGetAdminKeyboardPassword(ExtendedBluetoothDevice extendedBluetoothDevice, int battery, String adminCode, Error error) {

        }
    };


    private Handler handler = new Handler();
    @PluginMethod()
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value",value.concat(this.text));
        call.success(ret);
    }
}
