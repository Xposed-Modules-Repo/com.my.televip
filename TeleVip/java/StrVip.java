package com.my.televip;

import android.content.Context;
 import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.util.Locale;
import de.robv.android.xposed.*;
import android.content.res.Configuration;
import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.*;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import de.robv.android.xposed.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.ArrayList;
import org.json.*;
import android.content.DialogInterface;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import android.view.WindowManager.LayoutParams;
import java.lang.reflect.Method;
import android.content.ClipData;
import android.content.ClipboardManager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class StrVip {

public static String language;
public static String noRead;
public static String NoTyping;
public static String noStoryRead;
public static String pre;
public static String usefolow;
public static String usedelemsg;
public static String allowShare;
public static String strTitle;
public static String btnsave;
public static String GhostMode;
public static boolean isCurrentThemeDay=false;
public static String Unknown;
public static String HideUser;
public static String howdow;
public static String styes;
public static String syno;
public static String chena;
public static String HideOnline;
public static String PreventMedia;
public static String HidePhone;
public static String onemsg;
public static String tothmsg;
public static String inpMsg;
public static String serc;
public static String deltm;
public static String tm = "Change to";
public static String shmsdel;
public static boolean isdele;
public static String delmsg;
public static Class<?> drawableClass;
public static String copname;
public static String copname2;
public static String onlinestatic;
public static boolean isshow;

public static void Strck(Context con){
isdele=false;
        if (MainHook.getAppLanguage(con).equals("ar")) {
                   onemsg="اذهب إلى أول رسالة";
                   tothmsg="إلى الرسالة";
                   inpMsg="ادخل معرف الرسالة";
                    serc="حسناً";
                   syno="الغاء";
                         howdow="الاسم الجديد";
                         styes="تغير";
                         syno="الغاء";
                         tm="تم تغير الى";
                         deltm="تم حذف الاسم";
                         GhostMode="وضع الشبح 👻";
                                          noRead="اخفاء علامة الاستلام";
                     noStoryRead="اخفاء مشاهدة قصة";
                      NoTyping="اخفاء مؤشر الكتاب";
                     pre="فتح تيليجرام المميز";
                   usefolow="فتح جميع الخصائص المشفره والمغلقه";
                   usedelemsg="عرض زر حذف الرسائل";
                   allowShare="سماح حفظ الفيديو في معرض";
                   strTitle="مميزات وضع شبح";
                   btnsave="حفظ"; 
                   chena="قناة المطور";   
                   HideOnline="إخفاء حالة الاتصال بالإنترنت";   
                   PreventMedia ="تعطيل حذف الوسائط السرية";
                   HidePhone="اخفاء رقم هاتف";
                   shmsdel="اضهار الرسائل المحذوفة";
                   delmsg="محذوفه";
                   copname = "تم نسخ '";
                   copname2 = "' إلى الحافظة";
                   onlinestatic ="لست متصلاً بالإنترنت";
                 }else if (MainHook.getAppLanguage(con).equals("zh")) {
onemsg = "跳转到第一条消息";
tothmsg = "跳转到消息";
inpMsg = "输入消息 ID";
serc = "完成";
syno = "取消";
howdow = "新名字";
styes = "更改";
syno = "取消";
tm = "更改为";
deltm = "名称已删除";
GhostMode = "幽灵模式 👻";
noRead = "隐藏消息的 '已读' 状态";
noStoryRead = "隐藏 '故事观看' 状态";
NoTyping = "隐藏正在输入...";
pre = "启用 Telegram 本地会员";
usefolow = "解锁频道的所有受限和加密功能";
usedelemsg = "显示 '删除消息' 按钮";
allowShare = "允许将视频保存到图库";
strTitle = "幽灵模式";
btnsave = "保存";
chena = "开发者频道";
HideOnline = "隐藏 '在线' 状态";
PreventMedia = "防止删除秘密媒体";
HidePhone = "隐藏 '电话' 号码";
shmsdel = "显示已删除的消息";
delmsg = "已删除";
copname = "已复制 '";
copname2 = "' 到剪贴板";
onlinestatic="您当前处于离线状态";
                 }else {
                 
onemsg = "Go to First Message";
tothmsg="To The Message";
inpMsg = "Input Message Id";
serc = "Done";
syno = "Cancel";
howdow = "New Name";
styes = "Change";
syno = "Cancel";
tm="Change to";
deltm = "Name deleted";
GhostMode="Ghost Mode 👻";
noRead = "Hide 'Seen' status for messages";
noStoryRead = "Hide 'Story View' status";
NoTyping = "Hide Typing...";
pre = "Enable Telegram Premium";
usefolow = "Unlock all restricted and encrypted features for channels";
usedelemsg = "Show 'Delete Messages' button";
allowShare = "Allow saving videos to the gallery";
strTitle = "Ghost Mode";
btnsave="Save";
chena="Developer Channel";
HideOnline="Hide 'Online' status";
PreventMedia ="Prevent Deletion of Secret Media.";
HidePhone ="Hide 'Phone' number";
shmsdel = "Show 'Deleted Messages'";
delmsg = "deleted";
copname = "Copied '";
copname2 = "' to the clipboard";
onlinestatic = "You are currently offline";

                 }
}

public static String getAppLanguage(Context context) {
        Configuration config = context.getResources().getConfiguration();
        Locale locale;
        
        // تحقق من إصدار النظام للحصول على Locale بالطريقة الصحيحة
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            locale = config.getLocales().get(0); // في الإصدارات الجديدة
        } else {
            locale = config.locale; // في الإصدارات القديمة
        }

        // إرجاع اسم اللغة
        return locale.getLanguage(); // مثال: "ar" للعربية
    }
public static void ckDarck(final XC_LoadPackage.LoadPackageParam lpparam) {
        try {

            // الحصول على الكائن الحالي من ThemeInfo
            Object currentThemeInfo = XposedHelpers.callStaticMethod(
                XposedHelpers.findClass("org.telegram.ui.ActionBar.Theme", lpparam.classLoader),
                "getActiveTheme"
            );

            if (currentThemeInfo != null) {
                // التحقق من قيمة isDark
                boolean isDark = (boolean) XposedHelpers.callMethod(currentThemeInfo, "isDark");
                isCurrentThemeDay=isDark;
            } else {
                XposedBridge.log("ckDarck: getActiveTheme returned null.");
            }
        } catch (Exception e) {
            XposedBridge.log("ckDarck: Error while checking isDark - " + e.getMessage());
        }
    }
public static void ondilag(final de.robv.android.xposed.XC_MethodHook.MethodHookParam param,final XC_LoadPackage.LoadPackageParam lpparam){

final    Class<?> alertDialogBuilderClass = XposedHelpers.findClass(
        "org.telegram.ui.ActionBar.AlertDialog.Builder",
        lpparam.classLoader
    );
                        // تنفيذ الكود بعد استدعاء الدالة
                        ckDarck(lpparam);
                        Object launchActivity = param.thisObject;

                        Object drawerLayoutAdapter = XposedHelpers.getObjectField(param.thisObject, "drawerLayoutAdapter");
                        if (drawerLayoutAdapter != null) {
                       
                            // استدعاء getId وطباعته
                            int result = (int) XposedHelpers.callMethod(drawerLayoutAdapter, "getId", param.args[1]);
                            if (result ==13048){
                                   Object contextapp = param.thisObject;
                        final Context applicationContext = (Context)contextapp;
                        final      Context applicationContext2= (Context) XposedHelpers.getStaticObjectField(
XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                                    "applicationContext"
                                );

                    Object alertDialog = XposedHelpers.newInstance(alertDialogBuilderClass, applicationContext);
final SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);	
                    // عرض رسالة أو تخصيص النافذة                     
Strck(applicationContext2);  
                    ArrayList<String> list = new ArrayList<>();
                   list.add(noRead);
                   list.add(noStoryRead);
                   list.add(HideOnline);
                   list.add(HidePhone);
                   list.add(NoTyping);
                   list.add(shmsdel);
                   list.add(PreventMedia);
                   list.add(usedelemsg);
                   list.add(usefolow);
                   list.add(allowShare);
                     list.add(pre);
                    final String[] items = list.toArray(new String[0]);
                    XposedHelpers.callMethod(alertDialog, "setTitle", strTitle);
                    // إنشاء تخطيط جديد
LinearLayout layout = new LinearLayout(applicationContext);
layout.setOrientation(LinearLayout.VERTICAL);

// إضافة CheckBox لكل عنصر في القائمة مع إعدادات النص
final List<CheckBox> checkBoxes = new ArrayList<>();
for (String item : items) {
    CheckBox checkBox = new CheckBox(applicationContext);
    if (item.equals(pre) && te.contains("prem")) {
checkBox.setChecked(true);
}
else if (item.equals(noRead) && te.contains("noRead")) {
checkBox.setChecked(true);
}    if (item.equals(NoTyping) && te.contains("NoTyping")) {
checkBox.setChecked(true);
}else if (item.equals(noStoryRead) && te.contains("noStoryRead")) {
checkBox.setChecked(true);
}else if (item.equals(usefolow) && te.contains("usefolow")) {
checkBox.setChecked(true);
}else if (item.equals(usedelemsg) && te.contains("usedelemsg")) {
checkBox.setChecked(true);
}else if (item.equals(allowShare) && te.contains("allowShare")) {
checkBox.setChecked(true);
}else if (item.equals(HideOnline) && te.contains("HideOnline")) {
checkBox.setChecked(true);
}else if (item.equals(PreventMedia) && te.contains("PreventMedia")) {
checkBox.setChecked(true);
}else if (item.equals(HidePhone) && te.contains("HidePhone")) {
checkBox.setChecked(true);
}else if (item.equals(shmsdel) && te.contains("shmsdel")) {
checkBox.setChecked(true);
}
	
    checkBox.setText(item);
    if (!isCurrentThemeDay){
    checkBox.setTextColor(Color.BLACK); // تغيير لون النص إلى الأبيض
    }else {
    checkBox.setTextColor(Color.WHITE); 
    }
    checkBox.setPadding(10, 10, 10, 10); // إضافة هامش صغير حول النص
    checkBox.setTypeface(Typeface.DEFAULT_BOLD); // جعل النص مائلًا قليلاً
    checkBoxes.add(checkBox);
    layout.addView(checkBox);
}

// إعداد AlertDialog واستخدام setView
XposedHelpers.callMethod(alertDialog, "setView", layout);

// إضافة زر للتحقق من الحالات

// يمكن إضافة منطق إضافي هنا للتحقق من التحديدات عند النقر على CheckBox

                    // إعداد الزر الموجب
XposedHelpers.callMethod(alertDialog, "setPositiveButton", 
    btnsave, 
    new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            try {
                // الكود الذي يتم تنفيذه عند الضغط على الزر
                for (int i = 0; i < checkBoxes.size(); i++) {
                    CheckBox checkBox = checkBoxes.get(i);
                    if (checkBox.isChecked()) {
                        if (checkBox.getText().toString().equals(pre)) {
	te.edit().putString("prem", "true").commit();
}else if (checkBox.getText().toString().equals(noRead)) {
	te.edit().putString("noRead", "true").commit();
}else if (checkBox.getText().toString().equals(NoTyping)) {
	te.edit().putString("NoTyping", "true").commit();
}else if (checkBox.getText().toString().equals(noStoryRead)) {
	te.edit().putString("noStoryRead", "true").commit();
}else if (checkBox.getText().toString().equals(usefolow)) {
	te.edit().putString("usefolow", "true").commit();
}else if (checkBox.getText().toString().equals(usedelemsg)) {
	te.edit().putString("usedelemsg", "true").commit();
}else if (checkBox.getText().toString().equals(allowShare)) {
	te.edit().putString("allowShare", "true").commit();
}else if (checkBox.getText().toString().equals(HideOnline)) {
	te.edit().putString("HideOnline", "true").commit();
}else if (checkBox.getText().toString().equals(PreventMedia)) {
	te.edit().putString("PreventMedia", "true").commit();
}else if (checkBox.getText().toString().equals(HidePhone)) {
	te.edit().putString("HidePhone", "true").commit();
}else if (checkBox.getText().toString().equals(shmsdel)) {
	te.edit().putString("shmsdel", "true").commit();
}
                    } else {
                        if (checkBox.getText().toString().equals(pre)) {
	te.edit().remove("prem").commit();
} else if (checkBox.getText().toString().equals(noRead)) {
	te.edit().remove("noRead").commit();
}else if (checkBox.getText().toString().equals(NoTyping)) {
	te.edit().remove("NoTyping").commit();
}else if (checkBox.getText().toString().equals(noStoryRead)) {
	te.edit().remove("noStoryRead").commit();
}else if (checkBox.getText().toString().equals(usefolow)) {
	te.edit().remove("usefolow").commit();
}else if (checkBox.getText().toString().equals(usedelemsg)) {
	te.edit().remove("usedelemsg").commit();
}else if (checkBox.getText().toString().equals(allowShare)) {
	te.edit().remove("allowShare").commit();
}else if (checkBox.getText().toString().equals(HideOnline)) {
	te.edit().remove("HideOnline").commit();
}else if (checkBox.getText().toString().equals(PreventMedia)) {
	te.edit().remove("PreventMedia").commit();
}else if (checkBox.getText().toString().equals(HidePhone)) {
	te.edit().remove("HidePhone").commit();
}else if (checkBox.getText().toString().equals(shmsdel)) {
	te.edit().remove("shmsdel").commit();
}
                    }
                }
                
                // غلق الـ AlertDialog بعد التحقق
                XposedHelpers.callMethod(dialog, "dismiss");
            } catch (Throwable t) {
                t.printStackTrace();
            }
           TeleVip(lpparam);
        }
    }
);
XposedHelpers.callMethod(alertDialog, "setNegativeButton", 
   chena, 
    new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
                  Object drawerLayoutContainer = XposedHelpers.getObjectField(param.thisObject, "drawerLayoutContainer");
if (drawerLayoutContainer != null) {
XposedHelpers.callStaticMethod(
                XposedHelpers.findClass("org.telegram.messenger.browser.Browser", lpparam.classLoader),
                "openUrl",applicationContext,"https://t.me/t_l0_e"
            );
           XposedHelpers.callMethod(drawerLayoutContainer, "closeDrawer");
                XposedHelpers.callMethod(dialog, "dismiss");
        }
        }
    }
);
                
                    XposedHelpers.callMethod(alertDialog, "show");
                            }
                        
                        }
}




        public static void TeleVip(final XC_LoadPackage.LoadPackageParam lpparam) {
        
         XSharedPreferences sharedPreferences = new XSharedPreferences(lpparam.packageName, "televip");    

       if (sharedPreferences.contains("prem")) {
      if (lpparam.packageName.equals("com.iMe.android")){  
            Class<?> userConfigClass3 = XposedHelpers.findClass("com.iMe.storage.data.locale.prefs.impl.h", lpparam.classLoader);

            // استخدم hook لتعديل متغير isPremium في الكائن
            XposedHelpers.findAndHookMethod(userConfigClass3, "isPremium", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    // قم بتعيين القيمة دائمًا إلى true
                    param.setResult(true);
                }
            });
            
            Class<?> userConfigClass4 = XposedHelpers.findClass("com.iMe.utils.helper.ForkPremiumHelper", lpparam.classLoader);

            // استخدم hook لتعديل متغير isPremium في الكائن
            XposedHelpers.findAndHookMethod(userConfigClass4, "isPremium", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    // قم بتعيين القيمة دائمًا إلى true
                    param.setResult(true);
                }
            });
  
}
	Class<?> userConfigClass = XposedHelpers.findClass("org.telegram.messenger.UserConfig", lpparam.classLoader);

            // استخدم hook لتعديل متغير isPremium في الكائن
            XposedHelpers.findAndHookMethod(userConfigClass, "isPremium", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    // قم بتعيين القيمة دائمًا إلى true
                    param.setResult(true);
                }
            });
                  if (!lpparam.packageName.equals("com.skyGram.bestt")){  

            
            Class<?> userConfigClass2 = XposedHelpers.findClass("org.telegram.messenger.MessagesController", lpparam.classLoader);

            // استخدم hook لتعديل متغير isPremium في الكائن
            XposedHelpers.findAndHookMethod(userConfigClass2, "premiumFeaturesBlocked", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    // قم بتعيين القيمة دائمًا إلى true
                    
                    param.setResult(false);
                }
            });
           } 
}
if (sharedPreferences.contains("noRead")) {
try {
 Class<?> clastesk = Class.forName("org.telegram.messenger.MessagesController$ReadTask", true, lpparam.classLoader);

XposedHelpers.findAndHookMethod(
    "org.telegram.messenger.MessagesController", // اسم الكلاس
    lpparam.classLoader,                           // الـ ClassLoader
    "completeReadTask",                                   // اسم الدالة
    clastesk,
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        XposedBridge.log("completeReadTask method is blocked.");
                            param.setResult(null); 
              
                    }

                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    }
                });
                } catch (ClassNotFoundException e) {
    e.printStackTrace();

}

} if (sharedPreferences.contains("NoTyping")) {

XposedHelpers.findAndHookMethod(
    "org.telegram.ui.ChatActivity$ChatActivityEnterViewDelegate",
    lpparam.classLoader,    
    "needSendTyping",                                  
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        XposedBridge.log("needSendTyping method is blocked.");
                            param.setResult(null); 
              
                    }

                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    }
                });
                
}  
if (sharedPreferences.contains("noStoryRead")) {
try {
Class<?> userConfigClass = XposedHelpers.findClass("org.telegram.ui.Stories.StoriesController", lpparam.classLoader);

 Class<?> clastesk = Class.forName("org.telegram.tgnet.tl.TL_stories$StoryItem", true, lpparam.classLoader);
Class<?> clastesk2 = Class.forName("org.telegram.tgnet.tl.TL_stories$PeerStories", true, lpparam.classLoader);

XposedHelpers.findAndHookMethod(
    userConfigClass,
    "markStoryAsRead",  
    clastesk2,
    clastesk,
    boolean.class,
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {

                            param.setResult(false); 
              
                    }

                   
                });
                } catch (ClassNotFoundException e) {
    e.printStackTrace();

}
}
if (sharedPreferences.contains("usefolow")) {
try {
Class<?> userConfigClass = XposedHelpers.findClass("org.telegram.messenger.MessagesController", lpparam.classLoader);

 Class<?> clastesk = Class.forName("org.telegram.tgnet.TLRPC$Chat", true, lpparam.classLoader);

XposedHelpers.findAndHookMethod(
    userConfigClass,
    "isChatNoForwards",  
    clastesk,
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {

                            param.setResult(false); 
              
                    }

                   
                });
                } catch (ClassNotFoundException e) {
    e.printStackTrace();

}
} 
if (sharedPreferences.contains("usedelemsg")) {
 try {
Class<?> userConfigClass = XposedHelpers.findClass("org.telegram.messenger.MessageObject", lpparam.classLoader);

 Class<?> clastesk = Class.forName("org.telegram.tgnet.TLRPC$Chat", true, lpparam.classLoader);

XposedHelpers.findAndHookMethod(
    userConfigClass,
    "canDeleteMessage",  
    boolean.class,
    clastesk,    
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {

                            param.setResult(true); 
              
                    }

                   
                });
                } catch (ClassNotFoundException e) {
    e.printStackTrace();

}
                             }  
if (sharedPreferences.contains("allowShare")) {
 	Class<?> userConfigClass = XposedHelpers.findClass("org.telegram.ui.Stories.PeerStoriesView$StoryItemHolder", lpparam.classLoader);

            // استخدم hook لتعديل متغير isPremium في الكائن
            XposedHelpers.findAndHookMethod(userConfigClass, "allowScreenshots", new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    // قم بتعيين القيمة دائمًا إلى true
                    param.setResult(true);
                }
            });  
                                                    
 }   

            // العثور على الكلاسات المطلوبة للمعاملات
if (sharedPreferences.contains("HideOnline")) {
            Class<?> connectionsManagerClass = XposedHelpers.findClass(
                "org.telegram.tgnet.ConnectionsManager",
                lpparam.classLoader
            );
            Class<?> tlObjectClass = XposedHelpers.findClass("org.telegram.tgnet.TLObject", lpparam.classLoader);
            Class<?> requestDelegateClass = XposedHelpers.findClass("org.telegram.tgnet.RequestDelegate", lpparam.classLoader);
            Class<?> requestDelegateTimestampClass = XposedHelpers.findClass("org.telegram.tgnet.RequestDelegateTimestamp", lpparam.classLoader);
            Class<?> quickAckDelegateClass = XposedHelpers.findClass("org.telegram.tgnet.QuickAckDelegate", lpparam.classLoader);
            Class<?> writeToSocketDelegateClass = XposedHelpers.findClass("org.telegram.tgnet.WriteToSocketDelegate", lpparam.classLoader);

 XposedBridge.hookMethod(
    XposedHelpers.findMethodExact(
        connectionsManagerClass,
        "sendRequestInternal",
        tlObjectClass,
        requestDelegateClass,
        requestDelegateTimestampClass,
        quickAckDelegateClass,
        writeToSocketDelegateClass,
        int.class,    // Parameter 6
        int.class,    // Parameter 7
        int.class,    // Parameter 8
        boolean.class, // Parameter 9
        int.class     // Parameter 10
    ),
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            try {
                Class<?> tlAccountUpdateStatusClass;
                if (lpparam.packageName.equals("org.telegram.messenger.beta")){  
                tlAccountUpdateStatusClass = XposedHelpers.findClass(
                    "org.telegram.tgnet.tl.TL_account$updateStatus", 
                    param.thisObject.getClass().getClassLoader()
                );                
                }else {
                tlAccountUpdateStatusClass = XposedHelpers.findClass(
                    "org.telegram.tgnet.TLRPC$TL_account_updateStatus", 
                    param.thisObject.getClass().getClassLoader()
                );
}
                // التحقق من النوع وتعديله
                Object object = param.args[0]; // أول معامل في الطريقة
                if (tlAccountUpdateStatusClass.isInstance(object)) {
                    Object tlAccountUpdateStatus = object;
                    
                    // تعديل الخاصية offline إلى true
                    XposedHelpers.setBooleanField(tlAccountUpdateStatus, "offline", true);
                   // XposedBridge.log("Modified TL_account_updateStatus: offline set to true.");
                }
            } catch (Exception e) {
                XposedBridge.log("Error while handling TL_account_updateStatus: " + e.getMessage());
            }
        }

        @Override
        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
            
        }
    }
);
XposedHelpers.findAndHookMethod(
    "org.telegram.ui.ProfileActivity", // اسم الكلاس
    lpparam.classLoader, // الـ ClassLoader
    "updateProfileData",
    boolean.class,
    new XC_MethodHook() {
        @Override
        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
            Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );
            
            final Object profileActivityInstance = param.thisObject;
                    Class<?> profileActivityClass = lpparam.classLoader.loadClass("org.telegram.ui.ProfileActivity");
        Class<?> baseFragmentClass = lpparam.classLoader.loadClass("org.telegram.ui.ActionBar.BaseFragment");
            Method getUserConfigMethod = baseFragmentClass.getDeclaredMethod("getUserConfig");
            getUserConfigMethod.setAccessible(true);
            Object userConfig = getUserConfigMethod.invoke(profileActivityInstance);

            Method getClientUserIdMethod = userConfig.getClass().getDeclaredMethod("getClientUserId");
            getClientUserIdMethod.setAccessible(true);
            long clientUserId = (long) getClientUserIdMethod.invoke(userConfig);
            Field userIdField = profileActivityClass.getDeclaredField("userId");
             userIdField.setAccessible(true);
           final long userId = userIdField.getLong(profileActivityInstance);
           if (clientUserId != 0 && userId != 0 && userId == clientUserId){
Object[] onlineTextViewArray = (Object[]) XposedHelpers.getObjectField(profileActivityInstance, "onlineTextView");

if (onlineTextViewArray != null && onlineTextViewArray.length > 1) {
    // الحصول على SimpleTextView[1]
    Object simpleTextView1 = onlineTextViewArray[1];

    if (simpleTextView1 != null) {
        // استدعاء setText باستخدام LSPosed
        XposedHelpers.callMethod(simpleTextView1, "setText", onlinestatic);
    } else {
 //       XposedBridge.log("simpleTextView1 is null.");
    }
} else {
 //   XposedBridge.log("onlineTextViewArray is null or too short.");
}
           }


        }
    }
);
   }     
if (sharedPreferences.contains("PreventMedia")) {
                Class<?> messageobjectClass = XposedHelpers.findClass("org.telegram.messenger.MessageObject", lpparam.classLoader);

                XposedHelpers.findAndHookMethod(
    "org.telegram.ui.ChatActivity", // اسم الكلاس
    lpparam.classLoader,                           // الـ ClassLoader
    "sendSecretMessageRead", 
    messageobjectClass,
     boolean.class,  
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {                     
                            param.setResult(null); 
              
              
                    }

                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    }
                });
                                XposedHelpers.findAndHookMethod(
    "org.telegram.ui.ChatActivity", // اسم الكلاس
    lpparam.classLoader,                           // الـ ClassLoader
    "sendSecretMediaDelete", 
    messageobjectClass,
 
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {                     
                            param.setResult(null); 
              
              
                    }

                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {

                    }
                });     
Class<?> photoViewerproviderClass = XposedHelpers.findClass("org.telegram.ui.PhotoViewer$PhotoViewerProvider", lpparam.classLoader);
XposedHelpers.findAndHookMethod(
    "org.telegram.ui.SecretMediaViewer", // اسم الكلاس
    lpparam.classLoader,           // الـ ClassLoader
    "openMedia",
    messageobjectClass,
    photoViewerproviderClass,
    java.lang.Runnable.class,
    java.lang.Runnable.class,    
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
       
param.args[2]=null;
param.args[3]=null;
            // الحصول على كائن ChatActivity
            Object ChatActivityInstance = param.thisObject; 
            Object forwardingMessage = param.args[0];

            if (forwardingMessage != null) {
                // الوصول إلى الحقل messageOwner داخل forwardingMessage
                Class<?> forwardingMessageClass = forwardingMessage.getClass();
                Field messageOwnerField = forwardingMessageClass.getDeclaredField("messageOwner");
                messageOwnerField.setAccessible(true);
                Object messageOwner = messageOwnerField.get(forwardingMessage);

                if (messageOwner != null) {
XposedHelpers.setObjectField(messageOwner, "ttl", 0x7FFFFFFF);


                }
            }
        }

        @Override
        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
            XposedBridge.log("openMedia method is finishing.");
        }
    }
);

XposedHelpers.findAndHookMethod(
    "org.telegram.ui.SecretMediaViewer", // اسم الكلاس
    lpparam.classLoader,                           // الـ ClassLoader
    "closePhoto", 
    boolean.class,
    boolean.class,                                  // اسم الدالة
    new XC_MethodHook() {                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {                     
                //            param.args[1] =true;
                      Object profileActivityInstance = param.thisObject;
        XposedHelpers.setObjectField(profileActivityInstance, "onClose", null);

                    }
                });
                }
                
                
                try {         

if (sharedPreferences.contains("shmsdel")) {

      final  Class<?> messagesControllerClass = XposedHelpers.findClass(
            "org.telegram.messenger.MessagesController",
            lpparam.classLoader
        );

final Class<?> MessagesStorageClass = XposedHelpers.findClass(
            "org.telegram.messenger.MessagesStorage",
            lpparam.classLoader
        );
      if (lpparam.packageName.equals("com.skyGram.bestt")){  

XposedHelpers.findAndHookMethod(
            messagesControllerClass,
            "deleteMessages",
            java.util.ArrayList.class,     // المعامل الأول
            java.util.ArrayList.class,     // المعامل الثاني
            XposedHelpers.findClass("org.telegram.tgnet.TLRPC$EncryptedChat", lpparam.classLoader), // الفئة المحددة
            long.class,                    // معاملة long
            boolean.class,
            boolean.class,
            boolean.class, 
            long.class,                // معاملة boolean
            XposedHelpers.findClass("org.telegram.tgnet.TLObject", lpparam.classLoader), // TLObject
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
isdele =true;
//XposedBridge.log("deleteMessages method executed successfully!");
                }

                
            }
        );
                XposedHelpers.findAndHookMethod(
    MessagesStorageClass,
    "markMessagesAsDeleted",
    long.class,
    java.util.ArrayList.class,
    boolean.class,
    boolean.class,
    boolean.class,
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            java.util.ArrayList<?> messages = (java.util.ArrayList<?>) param.args[1];
            Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );

            if (applicationContext != null) {
            if (!isdele){
                long user = (long) param.args[0];
                    if (user !=0){
                // التحقق من وجود بيانات
if (messages != null && !messages.isEmpty()) {
    // تحويل ArrayList إلى JSONArray
    SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);
String stuser = String.valueOf(user);
stuser = stuser.replace("-", "");

// استرجاع الرسائل المحفوظة مسبقًا
String savedMessages = te.getString("dele" + stuser, null);
List<Object> savedMessagesList = new ArrayList<>();

if (savedMessages != null) {
    try {
        // تحويل الرسائل المحفوظة مسبقًا إلى قائمة باستخدام Gson
        Gson gson = new Gson();
        savedMessagesList = gson.fromJson(savedMessages, new TypeToken<List<Object>>(){}.getType());
    } catch (Exception e) {
        XposedBridge.log("Error loading saved messages: " + e.getMessage());
    }
}

// إذا كانت الرسائل جديدة في صورة ArrayList، حولها إلى JSON String باستخدام Gson
Gson gson = new Gson();
String messagesJson = gson.toJson(messages); // إذا كانت الرسائل من نوع ArrayList

// تحويل البيانات إلى قائمة باستخدام Gson
List<Object> messagesList = gson.fromJson(messagesJson, new TypeToken<List<Object>>(){}.getType());

// دمج الرسائل الجديدة مع القديمة بدون تكرار
for (Object newMessage : messagesList) {
    boolean isDuplicate = false;

    for (Object savedMessage : savedMessagesList) {
        if (newMessage.equals(savedMessage)) {
            isDuplicate = true;
            break;
        }
    }

    // إذا لم تكن الرسالة مكررة، أضفها
    if (!isDuplicate) {
        savedMessagesList.add(newMessage);
    }
}

// تخزين الرسائل المدمجة
stuser = "dele" + stuser;
te.edit().putString(stuser, gson.toJson(savedMessagesList)).commit();

 //  XposedBridge.log("Updated messages for user " + stuser + ": " + gson.toJson(savedMessagesList));
} else {
    XposedBridge.log("No messages found in ArrayList.");
}
                }
                }
            }

            if (!isdele) {
                param.setResult(null);
            }
        }
    }
);

        XposedHelpers.findAndHookMethod(
            MessagesStorageClass,
            "updateDialogsWithDeletedMessages",
            long.class,
            long.class,
            java.util.ArrayList.class,
            java.util.ArrayList.class,
            boolean.class,
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
if (!isdele){
param.setResult(null);
}
//XposedBridge.log("updateDialogsWithDeletedMessages method executed successfully!");
                }

            }
        );

}else if (lpparam.packageName.equals("com.tgconnect.android")){  
        XposedHelpers.findAndHookMethod(
            messagesControllerClass,
            "deleteMessages",
            java.util.ArrayList.class,     // المعامل الأول
            java.util.ArrayList.class,     // المعامل الثاني
            XposedHelpers.findClass("org.telegram.tgnet.TLRPC$EncryptedChat", lpparam.classLoader), // الفئة المحددة
            long.class,                    // معاملة long
            boolean.class,                 // معاملة boolean
            int.class,                     // معاملة int
            boolean.class,                 // معاملة boolean أخرى
            long.class,                    // معاملة long أخرى
            XposedHelpers.findClass("org.telegram.tgnet.TLObject", lpparam.classLoader), // TLObject
            int.class,                     // int رابعة
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
isdele =true;
//XposedBridge.log("deleteMessages method executed successfully!");
                }

                
            }
        );
    XposedHelpers.findAndHookMethod(
    MessagesStorageClass,
    "markMessagesAsDeleted",
    long.class,
    java.util.ArrayList.class,
    boolean.class,
    boolean.class,
    int.class,
    int.class,
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            java.util.ArrayList<?> messages = (java.util.ArrayList<?>) param.args[1];
            Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );

            if (applicationContext != null) {
            if (!isdele){
                long user = (long) param.args[0];
                    if (user != 0){
                // التحقق من وجود بيانات
if (messages != null && !messages.isEmpty()) {
    // تحويل ArrayList إلى JSONArray
SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);
String stuser = String.valueOf(user);
stuser = stuser.replace("-", "");

// استرجاع الرسائل المحفوظة مسبقًا
String savedMessages = te.getString("dele" + stuser, null);
List<Object> savedMessagesList = new ArrayList<>();

if (savedMessages != null) {
    try {
        // تحويل الرسائل المحفوظة مسبقًا إلى قائمة باستخدام Gson
        Gson gson = new Gson();
        savedMessagesList = gson.fromJson(savedMessages, new TypeToken<List<Object>>(){}.getType());
    } catch (Exception e) {
        XposedBridge.log("Error loading saved messages: " + e.getMessage());
    }
}

// إذا كانت الرسائل جديدة في صورة ArrayList، حولها إلى JSON String باستخدام Gson
Gson gson = new Gson();
String messagesJson = gson.toJson(messages); // إذا كانت الرسائل من نوع ArrayList

// تحويل البيانات إلى قائمة باستخدام Gson
List<Object> messagesList = gson.fromJson(messagesJson, new TypeToken<List<Object>>(){}.getType());

// دمج الرسائل الجديدة مع القديمة بدون تكرار
for (Object newMessage : messagesList) {
    boolean isDuplicate = false;

    for (Object savedMessage : savedMessagesList) {
        if (newMessage.equals(savedMessage)) {
            isDuplicate = true;
            break;
        }
    }

    // إذا لم تكن الرسالة مكررة، أضفها
    if (!isDuplicate) {
        savedMessagesList.add(newMessage);
    }
}

// تخزين الرسائل المدمجة
stuser = "dele" + stuser;
te.edit().putString(stuser, gson.toJson(savedMessagesList)).commit();
   XposedBridge.log("Updated messages for user " + stuser + ": " + gson.toJson(savedMessagesList));
} else {
    XposedBridge.log("No messages found in ArrayList.");
}
                }else {
                XposedBridge.log("user = 0.");
                }
                }
            }else {
               XposedBridge.log("Context = null.");
            }

            if (!isdele) {
                param.setResult(null);
            }
        }
    }
);
        XposedHelpers.findAndHookMethod(
            MessagesStorageClass,
            "updateDialogsWithDeletedMessages",
            long.class,
            long.class,
            java.util.ArrayList.class,
            java.util.ArrayList.class,
            boolean.class,
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
if (!isdele){
param.setResult(null);
}
//XposedBridge.log("updateDialogsWithDeletedMessages method executed successfully!");
                }

            }
        );
}else if (lpparam.packageName.equals("xyz.nextalone.nagram")){  
        XposedHelpers.findAndHookMethod(
            messagesControllerClass,
            "deleteMessages",
            java.util.ArrayList.class,     // المعامل الأول
            java.util.ArrayList.class,     // المعامل الثاني
            XposedHelpers.findClass("org.telegram.tgnet.TLRPC$EncryptedChat", lpparam.classLoader), // الفئة المحددة
            long.class,                    // معاملة long
            boolean.class,                 // معاملة boolean
            int.class,                     // معاملة int
            boolean.class,                 // معاملة boolean أخرى
            long.class,                    // معاملة long أخرى
            XposedHelpers.findClass("org.telegram.tgnet.TLObject", lpparam.classLoader), // TLObject
            int.class,                     // int أخرى
            boolean.class,                 // boolean ثالثة
            int.class,                     // int رابعة
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
isdele =true;
//XposedBridge.log("deleteMessages method executed successfully!");
                }

                
            }
        );
                XposedHelpers.findAndHookMethod(
    MessagesStorageClass,
    "markMessagesAsDeleted",
    long.class,
    java.util.ArrayList.class,
    boolean.class,
    boolean.class,
    int.class,
    int.class,
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            java.util.ArrayList<?> messages = (java.util.ArrayList<?>) param.args[1];
            Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );

            if (applicationContext != null) {
            if (!isdele){
                long user = (long) param.args[0];
                    if (user !=0){
                // التحقق من وجود بيانات
if (messages != null && !messages.isEmpty()) {
    // تحويل ArrayList إلى JSONArray
SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);
String stuser = String.valueOf(user);
stuser = stuser.replace("-", "");

// استرجاع الرسائل المحفوظة مسبقًا
String savedMessages = te.getString("dele" + stuser, null);
List<Object> savedMessagesList = new ArrayList<>();

if (savedMessages != null) {
    try {
        // تحويل الرسائل المحفوظة مسبقًا إلى قائمة باستخدام Gson
        Gson gson = new Gson();
        savedMessagesList = gson.fromJson(savedMessages, new TypeToken<List<Object>>(){}.getType());
    } catch (Exception e) {
        XposedBridge.log("Error loading saved messages: " + e.getMessage());
    }
}

// إذا كانت الرسائل جديدة في صورة ArrayList، حولها إلى JSON String باستخدام Gson
Gson gson = new Gson();
String messagesJson = gson.toJson(messages); // إذا كانت الرسائل من نوع ArrayList

// تحويل البيانات إلى قائمة باستخدام Gson
List<Object> messagesList = gson.fromJson(messagesJson, new TypeToken<List<Object>>(){}.getType());

// دمج الرسائل الجديدة مع القديمة بدون تكرار
for (Object newMessage : messagesList) {
    boolean isDuplicate = false;

    for (Object savedMessage : savedMessagesList) {
        if (newMessage.equals(savedMessage)) {
            isDuplicate = true;
            break;
        }
    }

    // إذا لم تكن الرسالة مكررة، أضفها
    if (!isDuplicate) {
        savedMessagesList.add(newMessage);
    }
}

// تخزين الرسائل المدمجة
stuser = "dele" + stuser;
te.edit().putString(stuser, gson.toJson(savedMessagesList)).commit();
//   XposedBridge.log("Updated messages for user " + stuser + ": " + gson.toJson(savedMessagesList));
} else {
    XposedBridge.log("No messages found in ArrayList.");
}
                }
                }
            }

            if (!isdele) {
                param.setResult(null);
            }
        }
    }
);
        XposedHelpers.findAndHookMethod(
            MessagesStorageClass,
            "updateDialogsWithDeletedMessages",
            long.class,
            long.class,
            java.util.ArrayList.class,
            boolean.class,
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
if (!isdele){
param.setResult(null);
}
//XposedBridge.log("updateDialogsWithDeletedMessages method executed successfully!");
                }

            }
        );


} else {
         // اعتراض الطريقة المحددة
        XposedHelpers.findAndHookMethod(
            messagesControllerClass,
            "deleteMessages",
            java.util.ArrayList.class,     // المعامل الأول
            java.util.ArrayList.class,     // المعامل الثاني
            XposedHelpers.findClass("org.telegram.tgnet.TLRPC$EncryptedChat", lpparam.classLoader), // الفئة المحددة
            long.class,                    // معاملة long
            boolean.class,                 // معاملة boolean
            int.class,                     // معاملة int
            boolean.class,                 // معاملة boolean أخرى
            long.class,                    // معاملة long أخرى
            XposedHelpers.findClass("org.telegram.tgnet.TLObject", lpparam.classLoader), // TLObject
            int.class,                     // int أخرى
            boolean.class,                 // boolean ثالثة
            int.class,                     // int رابعة
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
isdele =true;
//XposedBridge.log("deleteMessages method executed successfully!");
                }

                
            }
        );
                XposedHelpers.findAndHookMethod(
    MessagesStorageClass,
    "markMessagesAsDeleted",
    long.class,
    java.util.ArrayList.class,
    boolean.class,
    boolean.class,
    int.class,
    int.class,
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            java.util.ArrayList<?> messages = (java.util.ArrayList<?>) param.args[1];
            Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );

            if (applicationContext != null) {
            if (!isdele){
                long user = (long) param.args[0];
                    if (user !=0){
                // التحقق من وجود بيانات
if (messages != null && !messages.isEmpty()) {
    // تحويل ArrayList إلى JSONArray
SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);
String stuser = String.valueOf(user);
stuser = stuser.replace("-", "");

// استرجاع الرسائل المحفوظة مسبقًا
String savedMessages = te.getString("dele" + stuser, null);
List<Object> savedMessagesList = new ArrayList<>();

if (savedMessages != null) {
    try {
        // تحويل الرسائل المحفوظة مسبقًا إلى قائمة باستخدام Gson
        Gson gson = new Gson();
        savedMessagesList = gson.fromJson(savedMessages, new TypeToken<List<Object>>(){}.getType());
    } catch (Exception e) {
        XposedBridge.log("Error loading saved messages: " + e.getMessage());
    }
}

// إذا كانت الرسائل جديدة في صورة ArrayList، حولها إلى JSON String باستخدام Gson
Gson gson = new Gson();
String messagesJson = gson.toJson(messages); // إذا كانت الرسائل من نوع ArrayList

// تحويل البيانات إلى قائمة باستخدام Gson
List<Object> messagesList = gson.fromJson(messagesJson, new TypeToken<List<Object>>(){}.getType());

// دمج الرسائل الجديدة مع القديمة بدون تكرار
for (Object newMessage : messagesList) {
    boolean isDuplicate = false;

    for (Object savedMessage : savedMessagesList) {
        if (newMessage.equals(savedMessage)) {
            isDuplicate = true;
            break;
        }
    }

    // إذا لم تكن الرسالة مكررة، أضفها
    if (!isDuplicate) {
        savedMessagesList.add(newMessage);
    }
}

// تخزين الرسائل المدمجة
stuser = "dele" + stuser;
te.edit().putString(stuser, gson.toJson(savedMessagesList)).commit();
//   XposedBridge.log("Updated messages for user " + stuser + ": " + gson.toJson(savedMessagesList));
} else {
    XposedBridge.log("No messages found in ArrayList.");
}
                }
                }
            }

            if (!isdele) {
                param.setResult(null);
            }
        }
    }
);
        XposedHelpers.findAndHookMethod(
            MessagesStorageClass,
            "updateDialogsWithDeletedMessages",
            long.class,
            long.class,
            java.util.ArrayList.class,
            java.util.ArrayList.class,
            boolean.class,
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
if (!isdele){
param.setResult(null);
}
//XposedBridge.log("updateDialogsWithDeletedMessages method executed successfully!");
                }

            }
        );
        }
        

        XposedHelpers.findAndHookMethod(
            messagesControllerClass,
            "markDialogMessageAsDeleted",
            long.class,
            java.util.ArrayList.class,
            new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
if (!isdele){
param.setResult(null);
}

//XposedBridge.log("markDialogMessageAsDeleted method executed successfully!");
                }

            }
        );

            Class<?> PhotoViewerClass = XposedHelpers.findClass("org.telegram.messenger.NotificationCenter", lpparam.classLoader);
Class<?> objArrayClass = Object[].class;
XposedHelpers.findAndHookMethod(PhotoViewerClass, "postNotificationName",int.class, objArrayClass ,new XC_MethodHook() {
    @Override
    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
    if (!isdele){
            int id =(int) param.args[0];
int messagesDeleted = XposedHelpers.getStaticIntField(
    XposedHelpers.findClass("org.telegram.messenger.NotificationCenter", lpparam.classLoader),
    "messagesDeleted"
);
            if (id ==messagesDeleted){
param.setResult(null);
}
    }
    
    }
    @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    isdele =false;
                }
});
    Class<?> lonClass = Class.forName("androidx.collection.LongSparseArray", true, lpparam.classLoader);
            Class<?> PhotoViewerClass2 = XposedHelpers.findClass("org.telegram.messenger.NotificationsController", lpparam.classLoader);

XposedHelpers.findAndHookMethod(PhotoViewerClass2, "removeDeletedMessagesFromNotifications", lonClass ,boolean.class ,new XC_MethodHook() {
    @Override
    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {

param.setResult(null);
    }
    
});
}

              } catch (ClassNotFoundException e) {
                      XposedBridge.log("Error messages: " + e.getMessage());
    e.printStackTrace();

}          
 
                              }
               public static void HidePhone(final XC_LoadPackage.LoadPackageParam lpparam) {
                                    XSharedPreferences sharedPreferences = new XSharedPreferences(lpparam.packageName, "televip");    
Class<?> userConfigClass = XposedHelpers.findClass("org.telegram.messenger.UserConfig", lpparam.classLoader);

XposedHelpers.findAndHookMethod(userConfigClass, "getCurrentUser", new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
        Object userObject = param.getResult();
           if (sharedPreferences.contains("HidePhone")) {
        if (userObject != null) {          
                            XposedHelpers.setObjectField(userObject, "phone", null);
                       //     XposedBridge.log("phone is null.");
                        }
                        }

}
});    
  }                         
            public static void TeleOne(final XC_LoadPackage.LoadPackageParam lpparam) {
                     XSharedPreferences sharedPreferences = new XSharedPreferences(lpparam.packageName, "televip");    

Class<?> FileLoadOperationClass = XposedHelpers.findClass("org.telegram.messenger.FileLoadOperation", lpparam.classLoader);

            // استخدم hook لتعديل متغير isPremium في الكائن
            XposedHelpers.findAndHookMethod(FileLoadOperationClass, "updateParams", new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {               
            int downloadChunkSizeBig = 0;
            int maxDownloadRequests = 4;
            int maxDownloadRequestsBig = 8;
            int maxCdnParts = 0;
            long totalBytesCount;
            long currentTimeMillis;
            long hookTimeMillis;

           
                downloadChunkSizeBig = 0x100000; // 1MB

            maxCdnParts = (int) (0x7D000000L / downloadChunkSizeBig);

            XposedHelpers.setIntField(param.thisObject, "downloadChunkSizeBig", downloadChunkSizeBig);
            XposedHelpers.setObjectField(param.thisObject, "maxDownloadRequests", maxDownloadRequests);
            XposedHelpers.setObjectField(param.thisObject, "maxDownloadRequestsBig", maxDownloadRequestsBig);
            XposedHelpers.setObjectField(param.thisObject, "maxCdnParts", maxCdnParts);
      
                
            
                }
            });
            try {
            Class<?> meobClass = Class.forName("org.telegram.messenger.MessageObject", true, lpparam.classLoader);
            Class<?> ChatMessageCellClass = XposedHelpers.findClass("org.telegram.ui.Cells.ChatMessageCell", lpparam.classLoader);

XposedHelpers.findAndHookMethod(
            ChatMessageCellClass,
            "measureTime",
            meobClass,
            new XC_MethodHook() {
                @Override
                protected void afterHookedMethod(MethodHookParam param) throws Throwable {
Object forwardingMessage = param.args[0];
Context applicationContext= (Context) XposedHelpers.getStaticObjectField(
XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                                    "applicationContext"
                                );
            if (applicationContext != null) {
            if (forwardingMessage != null) {
                // الوصول إلى الحقل messageOwner داخل forwardingMessage
                Class<?> forwardingMessageClass = forwardingMessage.getClass();
                Field messageOwnerField = forwardingMessageClass.getDeclaredField("messageOwner");
                messageOwnerField.setAccessible(true);
                Object messageOwner = messageOwnerField.get(forwardingMessage);

                if (messageOwner != null) {
                Class<?> messageOwnerClass = XposedHelpers.findClass("org.telegram.tgnet.TLRPC$Message", lpparam.classLoader);
                Field fromidField = messageOwnerClass.getDeclaredField("peer_id");
                fromidField.setAccessible(true);
                Object from_d = fromidField.get(messageOwner);
if (from_d != null){
long user = 0;
if ((long) XposedHelpers.getObjectField(from_d, "user_id") != 0){
user =(long) XposedHelpers.getObjectField(from_d, "user_id");
}else if ((long) XposedHelpers.getObjectField(from_d, "chat_id") != 0){
user =(long) XposedHelpers.getObjectField(from_d, "chat_id");
}else {
user =(long) XposedHelpers.getObjectField(from_d, "channel_id");
}
int id = (int) XposedHelpers.getObjectField(messageOwner, "id");
String stuser =String.valueOf(user);
stuser = stuser.replace("-", "");

SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);
String msg = te.getString("dele" + stuser, null);
String idu ="dele" + stuser;
if (te.contains(idu)) {
if (msg != null) {
    try {
    Gson gson = new Gson();
        // تحويل النص إلى JSONArray
        List<Integer> messagesList = gson.fromJson(msg, new TypeToken<List<Integer>>(){}.getType());

// التحقق إذا كان الـ id موجودًا
for (Integer messageId : messagesList) {
    if (messageId == id) {
        // إذا كان id موجودًا، أظهر رسالة
                              if (lpparam.packageName.equals("uz.unnarsx.cherrygram") || lpparam.packageName.equals("com.exteragram.messenger")){ 
                              SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(delmsg);
XposedHelpers.setObjectField(param.thisObject, "currentTimeString", spannableStringBuilder);

               }else {
        XposedHelpers.setObjectField(param.thisObject, "currentTimeString", delmsg);
     }
           // XposedBridge.log("Message ID " + id + " already exists for user " + user);
        break;
    }
}
    } catch (Exception e) {
        XposedBridge.log("Error parsing messages: " + e.getMessage());
    }
}
 }   
  
}
                
                }

                }
                }
}
            }
        );
                      if (!lpparam.packageName.equals("xyz.nextalone.nagram")){ 
                 drawableClass = Class.forName("org.telegram.messenger.R$drawable", true, lpparam.classLoader);              
               }

    Class<?> conClass = Class.forName("android.content.Context", true, lpparam.classLoader);
final Class<?> ChatActivityClass = lpparam.classLoader.loadClass("org.telegram.ui.ChatActivity");
               if (!isshow){
XposedHelpers.findAndHookMethod(ChatActivityClass, "createView", conClass, new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
        Object ChatActivityInstance = param.thisObject;
        Field headerItemField = ChatActivityClass.getDeclaredField("headerItem");
            headerItemField.setAccessible(true);
            Object headerItem = headerItemField.get(ChatActivityInstance);
            if (headerItem != null) {
                Method addSubItemMethod = headerItem.getClass().getDeclaredMethod(
                        "lazilyAddSubItem",
                        int.class,
                        int.class,
                        CharSequence.class
                );
                addSubItemMethod.setAccessible(true);
                       if (!lpparam.packageName.equals("xyz.nextalone.nagram")){ 
                 
                 int drawableResource = XposedHelpers.getStaticIntField(drawableClass, "msg_go_up");
                 
                 Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                                    "applicationContext"
                                );
                             
if (!lpparam.packageName.equals("com.skyGram.bestt") && !lpparam.packageName.equals("uz.unnarsx.cherrygram") && 
 !lpparam.packageName.equals("com.iMe.android") && !lpparam.packageName.equals("app.nicegram") && !lpparam.packageName.equals("org.telegram.plus") && !lpparam.packageName.equals("com.xplus.messenger") && !lpparam.packageName.equals("org.forkgram.messenger")&&!lpparam.packageName.equals("org.forkclient.messenger.beta")) {
    addSubItemMethod.invoke(headerItem, 70, drawableResource, onemsg);
}
                     drawableResource = XposedHelpers.getStaticIntField(drawableClass, "player_new_order");                 
                addSubItemMethod.invoke(headerItem, 71, drawableResource, tothmsg);
}
isshow=true;
      }
      
    }
});
}
Class<?> ChatActivityClass3;
      if (lpparam.packageName.equals("com.iMe.android")){ 
      ChatActivityClass3 = XposedHelpers.findClass(
                "org.telegram.ui.ChatActivity$19", 
                lpparam.classLoader
            ); 
}else if (lpparam.packageName.equals("org.telegram.plus")){ 
ChatActivityClass3 = XposedHelpers.findClass(
                "org.telegram.ui.ChatActivity$14", 
                lpparam.classLoader
            ); 
}else if (lpparam.packageName.equals("com.exteragram.messenger")){ 
ChatActivityClass3 = XposedHelpers.findClass(
                "org.telegram.ui.ChatActivity$13", 
                lpparam.classLoader
            ); 
}else if (lpparam.packageName.equals("org.forkclient.messenger.beta") || lpparam.packageName.equals("org.forkgram.messenger")){ 
ChatActivityClass3 = XposedHelpers.findClass(
                "org.telegram.ui.ChatActivity$15", 
                lpparam.classLoader
            ); 
}else {
ChatActivityClass3 = XposedHelpers.findClass(
                "org.telegram.ui.ChatActivity$13", 
                lpparam.classLoader
            );
}            
            XposedHelpers.findAndHookMethod(
                ChatActivityClass3,
                "onItemClick", // اسم الدالة        
                int.class,
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    int id =(int)param.args[0];
                    Object chatActivityInstance = param.thisObject;
                final  Object chatActivity = XposedHelpers.getObjectField(chatActivityInstance, "this$0");
                    if (id == 70){
// استدعاء الدالة
XposedHelpers.callMethod(chatActivity, "scrollToMessageId",1,0,true,0,true,0);
XposedBridge.log("scrollToMessageId is call.");

                }else if (id == 71){
              final Context applicationContext = (Context) XposedHelpers.callMethod(chatActivity, "getContext");
       if (applicationContext != null) {
        Object getResourceProvider = XposedHelpers.callMethod(chatActivity, "getResourceProvider");

            Object alertDialog = XposedHelpers.newInstance(
                XposedHelpers.findClass("org.telegram.ui.ActionBar.AlertDialog$Builder", lpparam.classLoader),
                applicationContext,
                getResourceProvider
            );
                            Context applicationContext2= (Context) XposedHelpers.getStaticObjectField(
                        XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                        "applicationContext"
                );
           
            Strck(applicationContext2);  

                                      XposedHelpers.callMethod(alertDialog, "setTitle", inpMsg);                                    
                                      // إنشاء EditText مع تصميم جميل
final EditText editText = new EditText(applicationContext);
editText.setInputType(InputType.TYPE_CLASS_NUMBER);
ckDarck(lpparam);
    if (!isCurrentThemeDay){
    editText.setTextColor(0xFF000000);
    editText.setHintTextColor(0xFF424242);
    }else {
    editText.setTextColor(0xFFFFFFFF);
editText.setHintTextColor(0xFFBDBDBD);
    }
editText.setTextSize(18); // تكبير النص
editText.setPadding(20, 20, 20, 20); // إضافة هوامش داخلية

// تحديد حجم EditText ليكون أكبر
LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
    LinearLayout.LayoutParams.MATCH_PARENT,
    LinearLayout.LayoutParams.WRAP_CONTENT
);
params.setMargins(20, 20, 20, 20); // إضافة هوامش خارجية
editText.setLayoutParams(params);

// إنشاء تخطيط (Layout) لتضمين EditText
LinearLayout layout = new LinearLayout(applicationContext);
layout.setOrientation(LinearLayout.VERTICAL);
layout.setPadding(30, 30, 30, 30); // هوامش إضافية داخل التخطيط
layout.addView(editText);

XposedHelpers.callMethod(alertDialog, "setView", layout);

// إعداد زر الحفظ


      XposedHelpers.callMethod(alertDialog, "setPositiveButton", serc, 
    new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            try {

                String inputText  = editText.getText().toString().trim();

                // التحقق من المدخلات
                if (!inputText.isEmpty()) {
                int msid = Integer.parseInt(inputText);
XposedHelpers.callMethod(chatActivity, "scrollToMessageId",msid,0,true,0,true,0);
XposedBridge.log("scrollToMessageId is call.");

                }

            } catch (Throwable t) {
                t.printStackTrace();
            }         
        }
    }
);

XposedHelpers.callMethod(alertDialog, "setNegativeButton", 
   syno, 
    new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            try {               
                XposedHelpers.callMethod(dialog, "dismiss");
            } catch (Throwable t) {
                t.printStackTrace();
            }         
        }
    }
);
                
                    XposedHelpers.callMethod(alertDialog, "show");
}       
                }
    }
});

XposedHelpers.findAndHookMethod(
    "org.telegram.ui.ProfileActivity", // اسم الكلاس
    lpparam.classLoader, // الـ ClassLoader
    "createView",
    conClass,
    new XC_MethodHook() {
        @Override
        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
            Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );
            
            final Object profileActivityInstance = param.thisObject;

            // الحصول على الحقل nameTextView (كمصفوفة Objects لأنه لا يمكننا تعريف SimpleTextView مباشرة)
            Object[] nameTextViewArray = (Object[]) XposedHelpers.getObjectField(profileActivityInstance, "nameTextView");

            if (nameTextViewArray != null && nameTextViewArray.length > 1) {
                // الحصول على SimpleTextView[1]
                Object simpleTextView1 = nameTextViewArray[1];

                if (simpleTextView1 != null) {
                    // إضافة حدث النقر باستخدام callMethod
                    XposedHelpers.callMethod(simpleTextView1, "setOnClickListener", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            try {
                                // تحميل الكلاسات المطلوبة
                                Class<?> profileActivityClass = lpparam.classLoader.loadClass("org.telegram.ui.ProfileActivity");
                                Class<?> baseFragmentClass = lpparam.classLoader.loadClass("org.telegram.ui.ActionBar.BaseFragment");
                                Class<?> userObjectClass = lpparam.classLoader.loadClass("org.telegram.messenger.UserObject");

                                // استدعاء MessagesController
                                Method getMessagesControllerMethod = baseFragmentClass.getDeclaredMethod("getMessagesController");
                                getMessagesControllerMethod.setAccessible(true);
                                Object messagesController = getMessagesControllerMethod.invoke(profileActivityInstance);

                                if (messagesController != null) {
                                    // الحصول على userId
                                    Field userIdField = profileActivityClass.getDeclaredField("userId");
                                    userIdField.setAccessible(true);
                                    final long userId = userIdField.getLong(profileActivityInstance);

                                    // تحويل userId إلى Long
                                    Object userIdObject = Long.class.getDeclaredMethod("valueOf", long.class).invoke(null, userId);

                                    // استدعاء getUser
                                    Method getUserMethod = messagesController.getClass().getDeclaredMethod("getUser", Long.class);
                                    getUserMethod.setAccessible(true);
                                    Object user = getUserMethod.invoke(messagesController, userIdObject);
            Field chatIdField = profileActivityClass.getDeclaredField("chatId");
            chatIdField.setAccessible(true);
            final long chatId = chatIdField.getLong(profileActivityInstance);

                                    if (user != null && chatId ==0) {
                                        // استدعاء getUserName
                                        Class<?> userClass = lpparam.classLoader.loadClass("org.telegram.tgnet.TLRPC$User");
                                        Method getUserNameMethod = userObjectClass.getDeclaredMethod("getUserName", userClass);
                                        getUserNameMethod.setAccessible(true);
                                        String userName = (String) getUserNameMethod.invoke(null, user);
                                        if (userName != null){
                                        String copnames=copname+userName+copname2;
                                                       ((ClipboardManager) applicationContext.getSystemService(applicationContext.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", userName));
                                        // عرض اسم المستخدم
                                        SketchwareUtil.showMessage(applicationContext, copnames);
                                   }
                                     }
                                }
                            } catch (Exception e) {
                                XposedBridge.log("Error: " + e.getMessage());
                            }
                        }
                    });
                }
            }
        }
    }
);

 if (!lpparam.packageName.equals("com.skyGram.bestt") && !lpparam.packageName.equals("xyz.nextalone.nagram")){ 

  Class<?> peerColorActivityClass = lpparam.classLoader.loadClass("org.telegram.ui.PeerColorActivity");
          
   XposedHelpers.findAndHookMethod(
   peerColorActivityClass,
    "apply", // اسم الميثود التي تريد اعتراضها
  new XC_MethodHook() {
        @Override
        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
            // الحصول على Context
            Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );

            // الحصول على كائن PeerColorActivity الحالي
            final Object peerColorActivityInstance = param.thisObject;

            // الوصول إلى الحقل profilePage
            Field profilePageField = peerColorActivityClass.getDeclaredField("profilePage");
            profilePageField.setAccessible(true); // السماح بالوصول إلى الحقل الخاص
            Object profilePage = profilePageField.get(peerColorActivityInstance); // استخدام get() بدلاً من getLong()

            // التحقق من selectedColor داخل profilePage
            if (profilePage != null) {
                // الوصول إلى حقل selectedColor في profilePage
                Field selectedColorField = profilePage.getClass().getDeclaredField("selectedColor");
               selectedColorField.setAccessible(true); // السماح بالوصول إلى الحقل الخاص
                int selectedColor = selectedColorField.getInt(profilePage); // الحصول على قيمة selectedColor
                Field selectedEmojiField = profilePage.getClass().getDeclaredField("selectedEmoji");
                selectedEmojiField.setAccessible(true); // السماح بالوصول إلى الحقل الخاص
                long selectedEmoji = selectedEmojiField.getLong(profilePage); // الحصول على قيمة selectedEmoji
                final SharedPreferences teleprofilepage = applicationContext.getSharedPreferences("teleProfilePage", Activity.MODE_PRIVATE);	
                // التحقق من القيمة
                if (selectedColor != 0) {
                teleprofilepage.edit().putString("selectedColor", String.valueOf(selectedColor)).commit();
                    // تنفيذ ما تريد عند تحقق الشرط
                   // XposedBridge.log("selectedColor is less than "+selectedColor);
                }else {
                teleprofilepage.edit().remove("selectedColor").commit();
                }
                if (selectedEmoji != 0) {
                 teleprofilepage.edit().putString("selectedEmoji", String.valueOf(selectedEmoji)).commit();
                    // تنفيذ ما تريد عند تحقق الشرط
          //          XposedBridge.log("selectedEmoji is less than "+selectedEmoji);
                }else {
                teleprofilepage.edit().remove("selectedEmoji").commit();
                }
            }
            
            Field namePageField = peerColorActivityClass.getDeclaredField("namePage");
            namePageField.setAccessible(true); // السماح بالوصول إلى الحقل الخاص
            Object namePage = namePageField.get(peerColorActivityInstance); // استخدام get() بدلاً من getLong()

            // التحقق من selectedColor داخل namePage
            if (namePage != null) {
                // الوصول إلى حقل selectedColor في namePage
                Field selectedColorField = namePage.getClass().getDeclaredField("selectedColor");
               selectedColorField.setAccessible(true); // السماح بالوصول إلى الحقل الخاص
                int selectedColor = selectedColorField.getInt(namePage); // الحصول على قيمة selectedColor
                Field selectedEmojiField = namePage.getClass().getDeclaredField("selectedEmoji");
                selectedEmojiField.setAccessible(true); // السماح بالوصول إلى الحقل الخاص
                long selectedEmoji = selectedEmojiField.getLong(namePage); // الحصول على قيمة selectedEmoji
                final SharedPreferences telenamePage = applicationContext.getSharedPreferences("telenamePage", Activity.MODE_PRIVATE);	
                // التحقق من القيمة
                if (selectedColor != 0) {
                telenamePage.edit().putString("selectedColor", String.valueOf(selectedColor)).commit();
                    // تنفيذ ما تريد عند تحقق الشرط
                   // XposedBridge.log("selectedColor is less than "+selectedColor);
                }else {
                telenamePage.edit().remove("selectedColor").commit();
                }
                if (selectedEmoji != 0) {
                 telenamePage.edit().putString("selectedEmoji", String.valueOf(selectedEmoji)).commit();
                    // تنفيذ ما تريد عند تحقق الشرط
          //          XposedBridge.log("selectedEmoji is less than "+selectedEmoji);
                }else {
                telenamePage.edit().remove("selectedEmoji").commit();
                }
            } 
           
            
        }
    }
);
                Class<?> userConfigClass = XposedHelpers.findClass("org.telegram.messenger.UserConfig", lpparam.classLoader);

XposedHelpers.findAndHookMethod(userConfigClass, "getCurrentUser", new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
        Object userObject = param.getResult();
HidePhone(lpparam);
                    Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                "applicationContext"
            );
if (applicationContext != null){
        if (userObject != null) {

            // الحصول على profileColor من الكائن userObject
            Object profileColor = XposedHelpers.getObjectField(userObject, "profile_color");
                        if (profileColor == null) {
          //      XposedBridge.log("profileColor is null. Creating new instance.");

                // إنشاء كائن جديد من TLRPC.TL_peerColor
                Class<?> peerColorClass = XposedHelpers.findClass(
                    "org.telegram.tgnet.TLRPC$TL_peerColor",
                    lpparam.classLoader
                );
                profileColor = XposedHelpers.newInstance(peerColorClass);

                // تعيين الكائن الجديد في userObject
                XposedHelpers.setObjectField(userObject, "profile_color", profileColor);

            }
                            final SharedPreferences teleprofilepage = applicationContext.getSharedPreferences("teleProfilePage", Activity.MODE_PRIVATE);	
if (teleprofilepage.contains("selectedColor")) {
int selectedColor = Integer.parseInt(teleprofilepage.getString("selectedColor", "0"));

            // إذا كان profileColor null، إنشاء كائن جديد

Object flags2 = XposedHelpers.getObjectField(userObject, "flags2");
            if (flags2 != null) {
                int currentFlags = (Integer) flags2;
                currentFlags |= 512;  // تطبيق OR البتية
                XposedHelpers.setObjectField(userObject, "flags2", currentFlags); // تحديث القيمة الجديدة
          //      XposedBridge.log("flags2 is "+currentFlags);
            }
            // تعديل background_emoji_id داخل profileColor
            XposedHelpers.setObjectField(profileColor, "color", selectedColor);

            // تعديل flags داخل profileColor باستخدام OR البتية
            Object flags = XposedHelpers.getObjectField(profileColor, "flags");
            if (flags != null) {
                int currentFlags = (Integer) flags;
                currentFlags |= 1;  // تطبيق OR البتية
                XposedHelpers.setObjectField(profileColor, "flags", currentFlags); // تحديث القيمة الجديدة
        //        XposedBridge.log("flags is "+currentFlags);
            }
}
if (teleprofilepage.contains("selectedEmoji")) {
long selectedEmoji = Long.valueOf(teleprofilepage.getString("selectedEmoji", "0"));

Object flags2 = XposedHelpers.getObjectField(userObject, "flags2");
            if (flags2 != null) {
                int currentFlags = (Integer) flags2;
                currentFlags |= 512;  // تطبيق OR البتية
                XposedHelpers.setObjectField(userObject, "flags2", currentFlags); // تحديث القيمة الجديدة
          //      XposedBridge.log("flags2 is "+currentFlags);
            }
            // تعديل background_emoji_id داخل profileColor
            XposedHelpers.setObjectField(profileColor, "background_emoji_id", selectedEmoji);

            // تعديل flags داخل profileColor باستخدام OR البتية
            Object flags = XposedHelpers.getObjectField(profileColor, "flags");
            if (flags != null) {
                int currentFlags = (Integer) flags;
                currentFlags |= 2;  // تطبيق OR البتية
                XposedHelpers.setObjectField(profileColor, "flags", currentFlags); // تحديث القيمة الجديدة
        //        XposedBridge.log("flags is "+currentFlags);
            }
}

            Object color = XposedHelpers.getObjectField(userObject, "color");


                        if (color == null) {
          //      XposedBridge.log("color is null. Creating new instance.");

                // إنشاء كائن جديد من TLRPC.TL_peerColor
                Class<?> peerColorClass = XposedHelpers.findClass(
                    "org.telegram.tgnet.TLRPC$TL_peerColor",
                    lpparam.classLoader
                );
                color = XposedHelpers.newInstance(peerColorClass);

                // تعيين الكائن الجديد في userObject
                                XposedHelpers.setObjectField(userObject, "color", color);
                long id = (long)XposedHelpers.getObjectField(userObject, "id");
                int color2 = (int) (id % 7);
            XposedHelpers.setObjectField(color, "color", color2);
                
            }

final SharedPreferences telenamePage = applicationContext.getSharedPreferences("telenamePage", Activity.MODE_PRIVATE);	
if (telenamePage.contains("selectedColor")) {
int selectedColor = Integer.parseInt(telenamePage.getString("selectedColor", "0"));

            // إذا كان color null، إنشاء كائن جديد

Object flags2 = XposedHelpers.getObjectField(userObject, "flags2");
            if (flags2 != null) {
                int currentFlags = (Integer) flags2;
                currentFlags |= 256;  // تطبيق OR البتية
                XposedHelpers.setObjectField(userObject, "flags2", currentFlags); // تحديث القيمة الجديدة
          //      XposedBridge.log("flags2 is "+currentFlags);
            }
            // تعديل background_emoji_id داخل color
            XposedHelpers.setObjectField(color, "color", selectedColor);

            // تعديل flags داخل color باستخدام OR البتية
            Object flags = XposedHelpers.getObjectField(color, "flags");
            if (flags != null) {
                int currentFlags = (Integer) flags;
                currentFlags |= 1;  // تطبيق OR البتية
                XposedHelpers.setObjectField(color, "flags", currentFlags); // تحديث القيمة الجديدة
        //        XposedBridge.log("flags is "+currentFlags);
            }
}
if (telenamePage.contains("selectedEmoji")) {
long selectedEmoji = Long.valueOf(telenamePage.getString("selectedEmoji", "0"));

Object flags2 = XposedHelpers.getObjectField(userObject, "flags2");
            if (flags2 != null) {
                int currentFlags = (Integer) flags2;
                currentFlags |= 256;  // تطبيق OR البتية
                XposedHelpers.setObjectField(userObject, "flags2", currentFlags); // تحديث القيمة الجديدة
          //      XposedBridge.log("flags2 is "+currentFlags);
            }
            // تعديل background_emoji_id داخل color
            XposedHelpers.setObjectField(color, "background_emoji_id", selectedEmoji);

            // تعديل flags داخل color باستخدام OR البتية
            Object flags = XposedHelpers.getObjectField(color, "flags");
            if (flags != null) {
                int currentFlags = (Integer) flags;
                currentFlags |= 2;  // تطبيق OR البتية
                XposedHelpers.setObjectField(color, "flags", currentFlags); // تحديث القيمة الجديدة
        //        XposedBridge.log("flags is "+currentFlags);
            }
}

            

           // XposedBridge.log("profileColor modifications completed.");
        } else {
   //         XposedBridge.log("userObject is null.");
        }
        }
    }
});        
}else {
HidePhone(lpparam);
}

              } catch (ClassNotFoundException e) {
                      XposedBridge.log("Error messages: " + e.getMessage());
    e.printStackTrace();

}          
 

}



}