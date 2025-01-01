package com.my.televip;


 import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import android.content.Context;
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
import android.app.Notification;
import java.util.Locale;
import android.content.res.Configuration;

public class telech extends StrVip {

public static void Start(final XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
                  
XposedHelpers.findAndHookMethod("android.view.Window", lpparam.classLoader, "setFlags", int.class, int.class, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    int flags = (Integer) param.args[0];
                    // إزالة FLAG_SECURE من العلم
                    flags &= ~LayoutParams.FLAG_SECURE;
                    param.args[0] = flags;
                }
            });   
                   XposedHelpers.findAndHookMethod(
                "android.view.WindowManagerImpl", // اسم الفئة المستهدفة
                lpparam.classLoader,
                "addView", // اسم الطريقة
                android.view.View.class, // المعامل الأول
               android.view.ViewGroup.LayoutParams.class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        // الحصول على WindowManager.LayoutParams
                        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) param.args[1];

                        // إزالة FLAG_SECURE إذا كان مفعلاً
                        if ((layoutParams.flags & WindowManager.LayoutParams.FLAG_SECURE) != 0) {
                            layoutParams.flags &= ~WindowManager.LayoutParams.FLAG_SECURE;                            
                        }
                    }
                });
final Class<?> drawableClass = Class.forName("org.telegram.messenger.R$drawable", true, lpparam.classLoader);

final Class<?> profileActivityClass = lpparam.classLoader.loadClass("org.telegram.ui.ProfileActivity");
final        Class<?> messagesControllerClass = lpparam.classLoader.loadClass("org.telegram.messenger.MessagesController");
final    Class<?> alertDialogBuilderClass = XposedHelpers.findClass(
        "org.telegram.ui.ActionBar.AlertDialog.Builder",
        lpparam.classLoader
    );
    final Class<?> itemClass = Class.forName("org.telegram.ui.Adapters.DrawerLayoutAdapter$Item", true, lpparam.classLoader);

XposedHelpers.findAndHookMethod("org.telegram.ui.ProfileActivity", lpparam.classLoader, "createActionBarMenu", boolean.class, new XC_MethodHook() {
    @Override
    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
        Object profileActivityInstance = param.thisObject;
        Class<?> profileActivityClass = lpparam.classLoader.loadClass("org.telegram.ui.ProfileActivity");
        Class<?> baseFragmentClass = lpparam.classLoader.loadClass("org.telegram.ui.ActionBar.BaseFragment");
        Class<?> longClass = Long.class;

        Method getMessagesControllerMethod = baseFragmentClass.getDeclaredMethod("getMessagesController");
        getMessagesControllerMethod.setAccessible(true);
        Object messagesController = getMessagesControllerMethod.invoke(profileActivityInstance);

        if (messagesController != null) {
            // الحصول على chatId
            Field chatIdField = profileActivityClass.getDeclaredField("chatId");
            chatIdField.setAccessible(true);
            final long chatId = chatIdField.getLong(profileActivityInstance);

            // تحويل chatId إلى Long
            Object chatIdObject = longClass.getDeclaredMethod("valueOf", long.class).invoke(null, chatId);

            // استدعاء getChat
            Method getChatMethod = messagesController.getClass().getDeclaredMethod("getChat", Long.class);
            getChatMethod.setAccessible(true);
            Object chat = getChatMethod.invoke(messagesController, chatIdObject);

            // الحصول على userId
            Field userIdField = profileActivityClass.getDeclaredField("userId");
            userIdField.setAccessible(true);
            final long userId = userIdField.getLong(profileActivityInstance);

            // تحويل userId إلى Long
            Object userIdObject = longClass.getDeclaredMethod("valueOf", long.class).invoke(null, userId);

            // استدعاء getUser
            Method getUserMethod = messagesController.getClass().getDeclaredMethod("getUser", Long.class);
            getUserMethod.setAccessible(true);
            Object user = getUserMethod.invoke(messagesController, userIdObject);

            // الحصول على otherItem
            Field otherItemField = profileActivityClass.getDeclaredField("otherItem");
            otherItemField.setAccessible(true);
            Object otherItem = otherItemField.get(profileActivityInstance);

            // استدعاء getUserConfig للحصول على clientUserId
            Method getUserConfigMethod = baseFragmentClass.getDeclaredMethod("getUserConfig");
            getUserConfigMethod.setAccessible(true);
            Object userConfig = getUserConfigMethod.invoke(profileActivityInstance);

            Method getClientUserIdMethod = userConfig.getClass().getDeclaredMethod("getClientUserId");
            getClientUserIdMethod.setAccessible(true);
            long clientUserId = (long) getClientUserIdMethod.invoke(userConfig);

            // استدعاء addSubItem على otherItem
            if (otherItem != null) {
                Method addSubItemMethod = otherItem.getClass().getDeclaredMethod(
                        "addSubItem",
                        int.class,
                        int.class,
                        CharSequence.class
                );
                addSubItemMethod.setAccessible(true);
                int drawableResource = XposedHelpers.getStaticIntField(drawableClass, "msg_filled_menu_users");
                Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
                        XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                        "applicationContext"
                );

                if (chat != null) {
                    if (applicationContext != null) {
                        SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);
                        te.edit().putString("id", String.valueOf(chatId)).commit();
                    }
                   addSubItemMethod.invoke(otherItem, 45, drawableResource, String.valueOf(chatId));
                } else if (user != null) {
                    if (applicationContext != null) {
                        SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);
                        te.edit().putString("id", String.valueOf(userId)).commit();
                          addSubItemMethod.invoke(otherItem, 45, drawableResource, String.valueOf((long)(userId)));

                        // تحقق إذا كان userId يساوي clientUserId
              //          if (userId != clientUserId) {
              Strck(applicationContext);  
                        if (!te.getString("username", "").contains(String.valueOf((long)(userId)))) {
                         if (getAppLanguage(applicationContext).equals("ar")) {
                         HideUser="تغير الاسم";
                         }else if (MainHook.getAppLanguage(applicationContext).equals("zh")) {
                       HideUser = "更改名称";
                         }else{
                         HideUser="Change Name";
                         }
                            addSubItemMethod.invoke(otherItem, 46, drawableResource, HideUser);
                            } else {
                       if (getAppLanguage(applicationContext).equals("ar")) {
                         HideUser="حذف الاسم";
                         }else if (MainHook.getAppLanguage(applicationContext).equals("zh")) {
                       HideUser = "删除名称";
                         }else{
                         HideUser = "Delete Name";
                         }
                            addSubItemMethod.invoke(otherItem, 47, drawableResource, HideUser);
     
                            }
                 //       }
                    }
                }
            }
        }
        XposedBridge.log("createActionBarMenu method is true.");
    }
});
        final    Class<?> profileActivityClass3 = XposedHelpers.findClass(
                "org.telegram.ui.ProfileActivity$6", 
                lpparam.classLoader
            );
            
            XposedHelpers.findAndHookMethod(
                profileActivityClass3,
                "onItemClick", // اسم الدالة        
                int.class,
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        // تنفيذ الكود قبل استدعاء الدالة
                    }

                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                    int id =(int)param.args[0];
                                            Object profileActivityInstance = param.thisObject;
                  final      Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                                    "applicationContext"
                                );
                    if (id==45){                        
                                    if (applicationContext != null) {                                    
final SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);	
               ((ClipboardManager) applicationContext.getSystemService(applicationContext.CLIPBOARD_SERVICE)).setPrimaryClip(ClipData.newPlainText("clipboard", te.getString("id", "")));
SketchwareUtil.showMessage(applicationContext, te.getString("id", ""));
                    }  
                          }else if (id ==46){
                                                          if (applicationContext != null) {
               Object profileActivity = XposedHelpers.getObjectField(profileActivityInstance, "this$0");

        // استدعاء getParentActivity للحصول على النشاط الأب
        Object parentActivity = XposedHelpers.callMethod(profileActivity, "getParentActivity");

        if (parentActivity != null) {
            // Create the AlertDialog using Telegram's specific AlertDialog.Builder
            Object alertDialog = XposedHelpers.newInstance(
                XposedHelpers.findClass("org.telegram.ui.ActionBar.AlertDialog$Builder", lpparam.classLoader),
                parentActivity
            );
            Strck(applicationContext); 
                         if (getAppLanguage(applicationContext).equals("ar")) {
                         HideUser="تغير الاسم";
                         }else if (MainHook.getAppLanguage(applicationContext).equals("zh")) {
                       HideUser = "更改名称";
                         }else{
                         HideUser="Change Name";
                         }
                                      XposedHelpers.callMethod(alertDialog, "setTitle", HideUser);                                    
                                      // إنشاء EditText مع تصميم جميل
final EditText editText = new EditText(applicationContext);
ckDarck(lpparam);
    if (!isCurrentThemeDay){
    editText.setTextColor(0xFF000000);
    editText.setHintTextColor(0xFF424242);
    }else {
    editText.setTextColor(0xFFFFFFFF);
editText.setHintTextColor(0xFFBDBDBD);
    }
editText.setHint(howdow);
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


      XposedHelpers.callMethod(alertDialog, "setPositiveButton", styes, 
    new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            try {

                String inputText  = editText.getText().toString().trim();

                // التحقق من المدخلات
                if (!inputText.isEmpty()) {
                    // النص مدخل بشكل صحيح، قم بمعالجة النص هنا
                    Toast.makeText(applicationContext, tm+": " + inputText, Toast.LENGTH_SHORT).show();
final SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);	
String  newname =te.getString("id", "");
te.edit().putString(newname, inputText).commit();
String useri=te.getString("username", "") +" "+te.getString("id", "")+" ";
te.edit().putString("username", useri).commit();
                    // غلق الـ AlertDialog
                    XposedHelpers.callMethod(dialog, "dismiss");
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
                          }else if (id ==47){
                                                          if (applicationContext != null) {
               Object profileActivity = XposedHelpers.getObjectField(profileActivityInstance, "this$0");

        // استدعاء getParentActivity للحصول على النشاط الأب
        Object parentActivity = XposedHelpers.callMethod(profileActivity, "getParentActivity");

        if (parentActivity != null) {
        final SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);	
String  remname =te.getString("id", "");
te.edit().remove(remname).commit();
String useri=te.getString("username", "");
useri= useri.replace(remname, "");
te.edit().putString("username", useri).commit();
String username=te.getString("username", "");
username=username.replace(" ", "");
if (username.isEmpty()) {
te.edit().remove("username").commit();
}
            
        Strck(applicationContext); 
         Toast.makeText(applicationContext, deltm, Toast.LENGTH_SHORT).show();
}

}

}
                    
}
            });
TeleVip(lpparam);
TeleOne(lpparam);
    // استدعاء الطريقة من الكلاس Theme مباشرة
    XposedHelpers.findAndHookMethod(
    "org.telegram.ui.Adapters.DrawerLayoutAdapter", // اسم الكلاس
    lpparam.classLoader,                           // الـ ClassLoader
    "resetItems",                                   // اسم الدالة
    new XC_MethodHook() {
        @Override
        protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
            // الكود الذي تريد تنفيذه قبل الدالة                    
        }
        @Override
        protected void afterHookedMethod(MethodHookParam param) throws Throwable {
            Object drawerLayoutAdapterInstance = param.thisObject;

            // العثور على المتغير الخاص
            Class<?> drawerLayoutAdapterClass = drawerLayoutAdapterInstance.getClass();
            Field itemsField = drawerLayoutAdapterClass.getDeclaredField("items");
            itemsField.setAccessible(true);
            ArrayList<?> items = (ArrayList<?>) itemsField.get(drawerLayoutAdapterInstance);

            // استدعاء الكلاس Item باستخدام Class.forName
                     Constructor<?> itemConstructor = itemClass.getDeclaredConstructor(int.class, CharSequence.class, int.class);
            itemConstructor.setAccessible(true);
 // استدعاء الطريقة مباشرة
 int eventType = (int) XposedHelpers.callStaticMethod(
    XposedHelpers.findClass("org.telegram.ui.ActionBar.Theme", lpparam.classLoader),
    "getEventType"
);
int drawableResource =3;
if (eventType == 0) {
  drawableResource = XposedHelpers.getStaticIntField(drawableClass, "msg_settings_ny");
        } else if (eventType == 1) {
            drawableResource = XposedHelpers.getStaticIntField(drawableClass, "msg_settings_14");
            
        } else if (eventType == 2) {
            drawableResource = XposedHelpers.getStaticIntField(drawableClass, "msg_settings_hw");
        } else {
            drawableResource = XposedHelpers.getStaticIntField(drawableClass, "msg_settings_old");
        }
                          final      Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                                    "applicationContext"
                                );
Strck(applicationContext); 

            Object newItem = itemConstructor.newInstance(13048, GhostMode, drawableResource);

            // إضافة الكائن الجديد إلى القائمة
            if (items instanceof ArrayList<?>) {
    ArrayList<Object> typedItems = (ArrayList<Object>) items;
    typedItems.add(newItem); // إضافة العنصر في الموقع الأول
}
        }
    }
);

Class<?> launchActivityClass = XposedHelpers.findClass(
                "org.telegram.ui.LaunchActivity", 
                lpparam.classLoader
            );

            XposedHelpers.findAndHookMethod(
                launchActivityClass,
                "lambda$onCreate$6", // اسم الدالة
                android.view.View.class, // نوع الوسيط الأول
                int.class,
                float.class, // نوع الوسيط الثاني
                float.class, // نوع الوسيط الثالث
                new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        // تنفيذ الكود قبل استدعاء الدالة
                    }

                    @Override
                    protected void afterHookedMethod(final MethodHookParam param) throws Throwable {
ondilag(param,lpparam);
                    }
                }
            );
            
        
      XposedHelpers.findAndHookMethod(
                messagesControllerClass,
                "getUser",
                Long.class, // معامل الدالة
                new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        // الكائن الذي أرجعته الدالة getUser
                        long userlong =(long)param.args[0];
                        Object profileActivityInstance = param.thisObject;
                        Context applicationContext = (Context) XposedHelpers.getStaticObjectField(
XposedHelpers.findClass("org.telegram.messenger.ApplicationLoader", lpparam.classLoader),
                                    "applicationContext"
                                );
                      if (applicationContext != null) {
final SharedPreferences te = applicationContext.getSharedPreferences("televip", Activity.MODE_PRIVATE);	
                    if (te.getString("username", "").contains(String.valueOf((long)(userlong)))) {
if (te.contains(String.valueOf((long)(userlong)))) {
                        Object userObject = param.getResult();

                        if (userObject != null) {
                            // تعديل الحقل username
                            XposedHelpers.setObjectField(userObject, "first_name", te.getString(String.valueOf((long)(userlong)), ""));
                            XposedHelpers.setObjectField(userObject, "last_name", null);
                        } else {
                            XposedBridge.log("getUser returned null.");
                        }
                        }
                        }
                        }else {
                        XposedBridge.log("applicationContext returned null.");
                        }
                      
                    }
                }
            );

}

}