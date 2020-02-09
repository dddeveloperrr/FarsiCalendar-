import java.util.HashMap;

public class FarsiCalendar {

    HashMap < Integer, String > farvardin = new HashMap < Integer, String > ();
    HashMap < Integer, String > ordibehesht = new HashMap < Integer, String > ();
    HashMap < Integer, String > khordad = new HashMap < Integer, String > ();
    HashMap < Integer, String > tir = new HashMap < Integer, String > ();
    HashMap < Integer, String > mordad = new HashMap < Integer, String > ();
    HashMap < Integer, String > shahrivar = new HashMap < Integer, String > ();
    HashMap < Integer, String > mehr = new HashMap < Integer, String > ();
    HashMap < Integer, String > aban = new HashMap < Integer, String > ();
    HashMap < Integer, String > azar = new HashMap < Integer, String > ();
    HashMap < Integer, String > dey = new HashMap < Integer, String > ();
    HashMap < Integer, String > bahman = new HashMap < Integer, String > ();
    HashMap < Integer, String > esfand = new HashMap < Integer, String > ();


    HashMap < Integer, String > moharam = new HashMap < Integer, String > ();
    HashMap < Integer, String > safar = new HashMap < Integer, String > ();
    HashMap < Integer, String > rabiaval = new HashMap < Integer, String > ();
    HashMap < Integer, String > rabisani = new HashMap < Integer, String > ();
    HashMap < Integer, String > jamadiaval = new HashMap < Integer, String > ();
    HashMap < Integer, String > jamadisani = new HashMap < Integer, String > ();
    HashMap < Integer, String > rajab = new HashMap < Integer, String > ();
    HashMap < Integer, String > shaban = new HashMap < Integer, String > ();
    HashMap < Integer, String > ramezan = new HashMap < Integer, String > ();
    HashMap < Integer, String > shaval = new HashMap < Integer, String > ();
    HashMap < Integer, String > ziqade = new HashMap < Integer, String > ();
    HashMap < Integer, String > zihaje = new HashMap < Integer, String > ();


    HashMap < Integer, String > january = new HashMap < Integer, String > ();
    HashMap < Integer, String > february = new HashMap < Integer, String > ();
    HashMap < Integer, String > march = new HashMap < Integer, String > ();
    HashMap < Integer, String > april = new HashMap < Integer, String > ();
    HashMap < Integer, String > may = new HashMap < Integer, String > ();
    HashMap < Integer, String > june = new HashMap < Integer, String > ();
    HashMap < Integer, String > july = new HashMap < Integer, String > ();
    HashMap < Integer, String > august = new HashMap < Integer, String > ();
    HashMap < Integer, String > september = new HashMap < Integer, String > ();
    HashMap < Integer, String > october = new HashMap < Integer, String > ();
    HashMap < Integer, String > november = new HashMap < Integer, String > ();
    HashMap < Integer, String > december = new HashMap < Integer, String > ();


    //-----------------------------------------------------------------------------------------------------------------\\
    //---------------------------------------------------------ماه های هجری--------------------------------------------------\\
    //-----------------------------------------------------------------------------------------------------------------\\


    public FarsiCalendar() {

        farvardin.put(1, "");
        farvardin.put(2, "");
        farvardin.put(3, "");
        farvardin.put(4, "");
        farvardin.put(5, "");
        farvardin.put(6, "زادروز آشو زرتشت، اَبَراِنسان بزرگ تاریخ-روز امید، روز شادباش نویسی-");
        farvardin.put(7, "");
        farvardin.put(8, "");
        farvardin.put(9, "");
        farvardin.put(10, "روز جانباز-جشن آبانگاه-");
        farvardin.put(11, "");
        farvardin.put(12, "روز جمهوری اسلامی-");
        farvardin.put(13, "جشن سیزده به در-");
        farvardin.put(14, "");
        farvardin.put(15, "");
        farvardin.put(16, "");
        farvardin.put(17, "سروش روز، جشن سروشگان-روز جوان-");
        farvardin.put(18, "");
        farvardin.put(19, "فروردین روز، جشن فروردینگان-");
        farvardin.put(20, "");
        farvardin.put(21, "");
        farvardin.put(22, "");
        farvardin.put(23, "روز دندانپزشک-");
        farvardin.put(24, "");
        farvardin.put(25, "روز بزرگداشت عطار نیشابوری-");
        farvardin.put(26, "");
        farvardin.put(27, "");
        farvardin.put(28, "");
        farvardin.put(29, "روز ارتش جمهوری اسلامی ایران-");
        farvardin.put(30, "زاد روز حکیم سید اسماعیل جرجانی، روز علوم آزمایشگاهی-");
        farvardin.put(31, "");


        ordibehesht.put(1, "روز بزرگداشت سعدی-");
        ordibehesht.put(2, "");
        ordibehesht.put(3, "روزبزرگداشت شیخ بهایی، روزملی کارآفرینی-");
        ordibehesht.put(4, "");
        ordibehesht.put(5, "");
        ordibehesht.put(6, "");
        ordibehesht.put(7, "");
        ordibehesht.put(8, "");
        ordibehesht.put(9, "روزشوراها-");
        ordibehesht.put(10, "جشن چهلم نوروز-روز ملی خلیج فارس-");
        ordibehesht.put(11, "");
        ordibehesht.put(12, "شهادت استاد مرتضی مطهری، روزمعلم-");
        ordibehesht.put(13, "");
        ordibehesht.put(14, "");
        ordibehesht.put(15, "جشن بهاربد-روز شیراز-");
        ordibehesht.put(16, "");
        ordibehesht.put(17, "روز اسناد ملی و میراث مکتوب-");
        ordibehesht.put(18, "");
        ordibehesht.put(19, "");
        ordibehesht.put(20, "");
        ordibehesht.put(21, "");
        ordibehesht.put(22, "");
        ordibehesht.put(23, "");
        ordibehesht.put(24, "");
        ordibehesht.put(25, "روز بزرگداشت فردوسی-");
        ordibehesht.put(26, "");
        ordibehesht.put(27, "روز ارتباطات و روابط عمومی-");
        ordibehesht.put(28, "روز بزرگداشت حکیم عمر خیام-");
        ordibehesht.put(29, "");
        ordibehesht.put(30, "");
        ordibehesht.put(31, "");


        khordad.put(1, "روز بهره وری و بهینه سازی مصرف-روز بزرگداشت ملاصدرا-");
        khordad.put(2, "");
        khordad.put(3, "فتح خرمشهر در عملیات بیت المقدس و روز مقاومت، ایثار و پیروزی-");
        khordad.put(4, "روز دزفول، روز مقاومت و پایداری-");
        khordad.put(5, "");
        khordad.put(6, "خرداد روز،جشن خردادگان-");
        khordad.put(7, "");
        khordad.put(8, "");
        khordad.put(9, "");
        khordad.put(10, "");
        khordad.put(11, "");
        khordad.put(12, "");
        khordad.put(13, "");
        khordad.put(14, "رحلت حضرت امام خمینی-");
        khordad.put(15, "قیام 15 خرداد-");
        khordad.put(16, "");
        khordad.put(17, "");
        khordad.put(18, "");
        khordad.put(19, "");
        khordad.put(20, "");
        khordad.put(21, "");
        khordad.put(22, "");
        khordad.put(23, "");
        khordad.put(24, "");
        khordad.put(25, "روز ملی گل وگیاه-");
        khordad.put(26, "");
        khordad.put(27, "روز جهاد کشاورزی-");
        khordad.put(28, "");
        khordad.put(29, "");
        khordad.put(30, "");
        khordad.put(31, "");


        tir.put(1, "روز اصناف-جشن آب پاشونک، جشن آغاز تابستان-");
        tir.put(2, "");
        tir.put(3, "");
        tir.put(4, "");
        tir.put(5, "");
        tir.put(6, "");
        tir.put(7, "انفجار دفتر حزب جمهوری اسلامی و شهادت دکتر بهشتی و 72 نفر از اعضای حزب-روز قوه قضاییه-");
        tir.put(8, "روز مبارزه با سلاح های شیمیایی و میکروبی-");
        tir.put(9, "");
        tir.put(10, "روز صنعت و معدن-");
        tir.put(11, "");
        tir.put(12, "");
        tir.put(13, "تیر روز،جشن تیرگان-");
        tir.put(14, "روز قلم-");
        tir.put(15, "جشن خام خواری-");
        tir.put(16, "");
        tir.put(17, "");
        tir.put(18, "");
        tir.put(19, "");
        tir.put(20, "");
        tir.put(21, "");
        tir.put(22, "");
        tir.put(23, "");
        tir.put(24, "");
        tir.put(25, "روز بهزیستی و تامین اجتماعی-");
        tir.put(26, "");
        tir.put(27, "اعلام پذیرش قطعنامه 598 شورای امنیت از سوی ایران-");
        tir.put(28, "");
        tir.put(29, "");
        tir.put(30, "");
        tir.put(31, "");


        mordad.put(1, "");
        mordad.put(2, "");
        mordad.put(3, "");
        mordad.put(4, "");
        mordad.put(5, "");
        mordad.put(6, "روز ترویج آموزش های فنی و حرفه ای-");
        mordad.put(7, "مرداد روز، جشن مردادگان-");
        mordad.put(8, "روز بزرگداشت شیخ شهاب الدین سهروردی-");
        mordad.put(9, "");
        mordad.put(10, "جشن چله تابستان-");
        mordad.put(11, "");
        mordad.put(12, "");
        mordad.put(13, "");
        mordad.put(14, "صدور فرمان مشروطیت-");
        mordad.put(15, "");
        mordad.put(16, "");
        mordad.put(17, "روز خبرنگار-");
        mordad.put(18, "");
        mordad.put(19, "");
        mordad.put(20, "");
        mordad.put(21, "");
        mordad.put(22, "");
        mordad.put(23, "");
        mordad.put(24, "");
        mordad.put(25, "");
        mordad.put(26, "سالروز ورود آزادگانِ سرافراز به وطن-");
        mordad.put(27, "");
        mordad.put(28, "سالروز وقایع 28 مرداد و برکناری دکتر محمد مصدق-سالروز فاجعه آتش زدن سینما رکس آبادان-");
        mordad.put(29, "");
        mordad.put(30, "");
        mordad.put(31, "");


        shahrivar.put(1, "روز بزرگداشت ابوعلی سینا و روز پزشک-");
        shahrivar.put(2, "آغاز هفته دولت-");
        shahrivar.put(3, "");
        shahrivar.put(4, "زادروز داراب (کوروش)-شهریور روز، جشن شهریورگان-روز کارمند-");
        shahrivar.put(5, "روز بزرگداشت محمدبن زکریای رازی و روز داروساز-");
        shahrivar.put(6, "");
        shahrivar.put(7, "");
        shahrivar.put(8, "انفجار در دفتر نخست‌وزیری جمهوری اسلامی ایران، روز مبارزه با تروریسم-");
        shahrivar.put(9, "");
        shahrivar.put(10, "");
        shahrivar.put(11, "روزصنعت چاپ-");
        shahrivar.put(12, "");
        shahrivar.put(13, "روز بزرگداشت ابوریحان بیرونی-روز تعاون-");
        shahrivar.put(14, "");
        shahrivar.put(15, "");
        shahrivar.put(16, "");
        shahrivar.put(17, "قیام 17 شهریور-");
        shahrivar.put(18, "");
        shahrivar.put(19, "درگذشت آیت الله سید محمود طالقانی-");
        shahrivar.put(20, "");
        shahrivar.put(21, "روز سینما-");
        shahrivar.put(22, "");
        shahrivar.put(23, "");
        shahrivar.put(24, "");
        shahrivar.put(25, "");
        shahrivar.put(26, "");
        shahrivar.put(27, "روز شعر و ادب پارسی و روز بزرگداشت استاد شهریار-");
        shahrivar.put(28, "");
        shahrivar.put(29, "");
        shahrivar.put(30, "روز گفتگوی تمدنها-");
        shahrivar.put(31, "آغاز هفته دفاع مقدس-");


        mehr.put(1, "آغاز حمله مغول به ایران در پاییز 598 خورشیدی-");
        mehr.put(2, "");
        mehr.put(3, "");
        mehr.put(4, "");
        mehr.put(5, "");
        mehr.put(6, "");
        mehr.put(7, "سقوط هواپیمای حامل جمعی از فرماندهان جنگ (کلاهدوز، نامجو، فلاحی، فکوری، جهان آرا) در سال 1360-روز آتش نشانی و ایمنی-");
        mehr.put(8, "روزبزرگداشت مولوی-");
        mehr.put(9, "");
        mehr.put(10, "");
        mehr.put(11, "");
        mehr.put(12, "");
        mehr.put(13, "روز نیروی انتظامی-");
        mehr.put(14, "روز دامپزشکی-");
        mehr.put(15, "");
        mehr.put(16, "روز ملی کودک-مهر روز، جشن مهرگان-");
        mehr.put(17, "");
        mehr.put(18, "");
        mehr.put(19, "");
        mehr.put(20, "روز بزرگداشت حافظ-");
        mehr.put(21, "جشن پیروزی کاوه و فریدون-");
        mehr.put(22, "");
        mehr.put(23, "");
        mehr.put(24, "");
        mehr.put(25, "");
        mehr.put(26, "روز تربیت بدنی و ورزش-");
        mehr.put(27, "");
        mehr.put(28, "");
        mehr.put(29, "");
        mehr.put(30, "");


        aban.put(1, "روز آمار و برنامه ریزی-");
        aban.put(2, "");
        aban.put(3, "");
        aban.put(4, "");
        aban.put(5, "");
        aban.put(6, "");
        aban.put(7, "سالروز ورود کوروش بزرگ به بابل در سال 539 پیش از میلاد-");
        aban.put(8, "روز نوجوان-");
        aban.put(9, "");
        aban.put(10, "آبان روز، جشن آبانگان-");
        aban.put(11, "");
        aban.put(12, "");
        aban.put(13, "روز دانش آموز-");
        aban.put(14, "روز فرهنگ عمومی-");
        aban.put(15, "جشن میانه پاییز-");
        aban.put(16, "");
        aban.put(17, "");
        aban.put(18, "روز ملی کیفیت-");
        aban.put(19, "");
        aban.put(20, "");
        aban.put(21, "");
        aban.put(22, "");
        aban.put(23, "");
        aban.put(24, "روز کتاب و کتابخوانی-");
        aban.put(25, "");
        aban.put(26, "");
        aban.put(27, "");
        aban.put(28, "");
        aban.put(29, "");
        aban.put(30, "");


        azar.put(1, "آذر جشن-");
        azar.put(2, "");
        azar.put(3, "");
        azar.put(4, "");
        azar.put(5, "روز بسیج مستضعفان-");
        azar.put(6, "");
        azar.put(7, "روز نیروی دریایی-");
        azar.put(8, "");
        azar.put(9, "جشن آذرگان ،آذر روز-");
        azar.put(10, "روز مجلس-");
        azar.put(11, "");
        azar.put(12, "");
        azar.put(13, "روز بیمه-");
        azar.put(14, "");
        azar.put(15, "روز حسابدار-");
        azar.put(16, "روز دانشجو-");
        azar.put(17, "");
        azar.put(18, "");
        azar.put(19, "");
        azar.put(20, "");
        azar.put(21, "");
        azar.put(22, "");
        azar.put(23, "");
        azar.put(24, "");
        azar.put(25, "روز پژوهش-");
        azar.put(26, "روز حمل و نقل-");
        azar.put(27, "");
        azar.put(28, "");
        azar.put(29, "");
        azar.put(30, "جشن شب یلدا-");


        dey.put(1,"روز میلاد خورشید، جشن خرم روز، نخستین جشن دیگان-");
        dey.put(2,"");
        dey.put(3,"");
        dey.put(4,"");
        dey.put(5,"سالروز شهادت آشو زرتشت، اَبَراِنسان بزرگ تاریخ-سالروز زمین لرزه ی بم در سال 1382-");
        dey.put(6,"");
        dey.put(7,"");
        dey.put(8,"دی به آذر روز، دومین جشن دیگان-");
        dey.put(9,"");
        dey.put(10,"");
        dey.put(11,"");
        dey.put(12,"");
        dey.put(13,"");
        dey.put(14,"");
        dey.put(15,"دی به مهر روز، سومین جشن دیگان-");
        dey.put(16,"");
        dey.put(17,"");
        dey.put(18,"");
        dey.put(19,"");
        dey.put(20,"سالروز قتل امیرکبیر به دستور ناصرالدین شاه قاجار-");
        dey.put(21,"");
        dey.put(22,"");
        dey.put(23,"دی به دین روز، چهارمین جشن دیگان-");
        dey.put(24,"");
        dey.put(25,"");
        dey.put(26,"");
        dey.put(27,"");
        dey.put(28,"");
        dey.put(29,"");
        dey.put(30,"");


        bahman.put(1,"زادروز فردوسی-");
        bahman.put(2,"بهمن روز، جشن بهمنگان-");
        bahman.put(3,"");
        bahman.put(4,"");
        bahman.put(5,"جشن نوسره-");
        bahman.put(6,"");
        bahman.put(7,"");
        bahman.put(8,"");
        bahman.put(9,"");
        bahman.put(10,"جشن سده-");
        bahman.put(11,"");
        bahman.put(12,"بازگشت امام خمینی (ره) به ایران-");
        bahman.put(13,"");
        bahman.put(14,"");
        bahman.put(15,"جشن میانه زمستان-");
        bahman.put(16,"");
        bahman.put(17,"");
        bahman.put(18,"");
        bahman.put(19,"روز نیروی هوایی-");
        bahman.put(20,"");
        bahman.put(21,"");
        bahman.put(22,"پیروزی انقلاب اسلامی-");
        bahman.put(23,"");
        bahman.put(24,"");
        bahman.put(25,"");
        bahman.put(26,"");
        bahman.put(27,"");
        bahman.put(28,"");
        bahman.put(29,"جشن سپندارمذگان و روز عشق-");
        bahman.put(30,"");


        esfand.put(1,"");
        esfand.put(2,"");
        esfand.put(3,"");
        esfand.put(4,"");
        esfand.put(5,"روز بزرگداشت خواجه نصیر الدین طوسی و روز مهندس-روز بزرگداشت زمین و بانوان-");
        esfand.put(6,"");
        esfand.put(7,"سالروز درگذشت علی اکبر دهخدا-سالروز استقلال کانون وکلای دادگستری و روز وکیل مدافع-");
        esfand.put(8,"");
        esfand.put(9,"");
        esfand.put(10,"");
        esfand.put(11,"");
        esfand.put(12,"");
        esfand.put(13,"");
        esfand.put(14,"سالروز درگذشت دکتر محمد مصدق-");
        esfand.put(15,"روز درختکاری-");
        esfand.put(16,"");
        esfand.put(17,"");
        esfand.put(18,"");
        esfand.put(19,"");
        esfand.put(20,"");
        esfand.put(21,"");
        esfand.put(22,"");
        esfand.put(23,"");
        esfand.put(24,"");
        esfand.put(25,"پایان سرایش شاهنامه-");
        esfand.put(26,"");
        esfand.put(27,"");
        esfand.put(28,"");
        esfand.put(29,"روز ملی شدن صنعت نفت ایران-");
        esfand.put(30,"");

      //-----------------------------------------------------------------------------------------------------------------\\
      //---------------------------------------------------------ماه های قمری--------------------------------------------------\\
      //-----------------------------------------------------------------------------------------------------------------\\

        moharam.put(1,"");
        moharam.put(2,"");
        moharam.put(3,"");
        moharam.put(4,"");
        moharam.put(5,"");
        moharam.put(6,"");
        moharam.put(7,"");
        moharam.put(8,"");
        moharam.put(9,"تاسوعای حسینی-");
        moharam.put(10,"عاشورای حسینی-");
        moharam.put(11,"");
        moharam.put(12,"شهادت امام زین العابدین علیه السلام-");
        moharam.put(13,"");
        moharam.put(14,"");
        moharam.put(15,"");
        moharam.put(16,"");
        moharam.put(17,"");
        moharam.put(18,"");
        moharam.put(19,"");
        moharam.put(20,"");
        moharam.put(21,"");
        moharam.put(22,"");
        moharam.put(23,"");
        moharam.put(24,"");
        moharam.put(25,"");
        moharam.put(26,"");
        moharam.put(27,"");
        moharam.put(28,"");
        moharam.put(29,"");
        moharam.put(30,"");


        safar.put(1,"");
        safar.put(2,"");
        safar.put(3,"");
        safar.put(4,"");
        safar.put(5,"");
        safar.put(6,"");
        safar.put(7,"");
        safar.put(8,"");
        safar.put(9,"");
        safar.put(10,"");
        safar.put(11,"");
        safar.put(12,"");
        safar.put(13,"");
        safar.put(14,"");
        safar.put(15,"");
        safar.put(16,"");
        safar.put(17,"");
        safar.put(18,"");
        safar.put(19,"");
        safar.put(20,"اربعین حسینی-");
        safar.put(21,"");
        safar.put(22,"");
        safar.put(23,"");
        safar.put(24,"");
        safar.put(25,"");
        safar.put(26,"");
        safar.put(27,"");
        safar.put(28,"رحلت رسول اکرم-شهادت امام حسن مجتبی علیه السلام-");
        safar.put(29,"شهادت امام رضا علیه السلام-");
        safar.put(30,"");


        rabiaval.put(1,"هجرت پیامبر اکرم از مکه به مدینه-");
        rabiaval.put(2,"");
        rabiaval.put(3,"");
        rabiaval.put(4,"");
        rabiaval.put(5,"");
        rabiaval.put(6,"");
        rabiaval.put(7,"");
        rabiaval.put(8,"شهادت امام حسن عسکری علیه السلام-");
        rabiaval.put(9,"");
        rabiaval.put(10,"");
        rabiaval.put(11,"");
        rabiaval.put(12,"میلاد رسول اکرم به روایت اهل سنت-");
        rabiaval.put(13,"");
        rabiaval.put(14,"");
        rabiaval.put(15,"");
        rabiaval.put(16,"");
        rabiaval.put(17,"میلاد رسول اکرم-میلاد امام جعفر صادق علیه السلام-");
        rabiaval.put(18,"");
        rabiaval.put(19,"");
        rabiaval.put(20,"");
        rabiaval.put(21,"");
        rabiaval.put(22,"");
        rabiaval.put(23,"");
        rabiaval.put(24,"");
        rabiaval.put(25,"");
        rabiaval.put(26,"");
        rabiaval.put(27,"");
        rabiaval.put(28,"");
        rabiaval.put(29,"");
        rabiaval.put(30,"");


        rabisani.put(1,"");
        rabisani.put(2,"");
        rabisani.put(3,"");
        rabisani.put(4,"");
        rabisani.put(5,"");
        rabisani.put(6,"");
        rabisani.put(7,"");
        rabisani.put(8,"ولادت امام حسن عسکری علیه السلام-");
        rabisani.put(9,"");
        rabisani.put(10,"وفات حضرت معصومه سلام الله علیها-");
        rabisani.put(11,"");
        rabisani.put(12,"");
        rabisani.put(13,"");
        rabisani.put(14,"");
        rabisani.put(15,"");
        rabisani.put(16,"");
        rabisani.put(17,"");
        rabisani.put(18,"");
        rabisani.put(19,"");
        rabisani.put(20,"");
        rabisani.put(21,"");
        rabisani.put(22,"");
        rabisani.put(23,"");
        rabisani.put(24,"");
        rabisani.put(25,"");
        rabisani.put(26,"");
        rabisani.put(27,"");
        rabisani.put(28,"");
        rabisani.put(29,"");
        rabisani.put(30,"");


        jamadiaval.put(1,"");
        jamadiaval.put(2,"");
        jamadiaval.put(3,"");
        jamadiaval.put(4,"");
        jamadiaval.put(5,"ولادت حضرت زینب سلام الله علیها-روز پرستار و بهورز-");
        jamadiaval.put(6,"");
        jamadiaval.put(7,"");
        jamadiaval.put(8,"");
        jamadiaval.put(9,"");
        jamadiaval.put(10,"");
        jamadiaval.put(11,"");
        jamadiaval.put(12,"");
        jamadiaval.put(13,"");
        jamadiaval.put(14,"");
        jamadiaval.put(15,"");
        jamadiaval.put(16,"");
        jamadiaval.put(17,"");
        jamadiaval.put(18,"");
        jamadiaval.put(19,"");
        jamadiaval.put(20,"");
        jamadiaval.put(21,"");
        jamadiaval.put(22,"");
        jamadiaval.put(23,"");
        jamadiaval.put(24,"");
        jamadiaval.put(25,"");
        jamadiaval.put(26,"");
        jamadiaval.put(27,"");
        jamadiaval.put(28,"");
        jamadiaval.put(29,"");
        jamadiaval.put(30,"");


        jamadisani.put(1,"");
        jamadisani.put(2,"");
        jamadisani.put(3,"شهادت حضرت فاطمه زهرا سلام الله علیها-");
        jamadisani.put(4,"");
        jamadisani.put(5,"");
        jamadisani.put(6,"");
        jamadisani.put(7,"");
        jamadisani.put(8,"");
        jamadisani.put(9,"");
        jamadisani.put(10,"");
        jamadisani.put(11,"");
        jamadisani.put(12,"");
        jamadisani.put(13,"");
        jamadisani.put(14,"");
        jamadisani.put(15,"");
        jamadisani.put(16,"");
        jamadisani.put(17,"");
        jamadisani.put(18,"");
        jamadisani.put(19,"");
        jamadisani.put(20,"ولادت حضرت فاطمه زهرا سلام الله علیها-روز مادر-");
        jamadisani.put(21,"");
        jamadisani.put(22,"");
        jamadisani.put(23,"");
        jamadisani.put(24,"");
        jamadisani.put(25,"");
        jamadisani.put(26,"");
        jamadisani.put(27,"");
        jamadisani.put(28,"");
        jamadisani.put(29,"");
        jamadisani.put(30,"");


        rajab.put(1,"ولادت امام محمد باقر علیه السلام-");
        rajab.put(2,"");
        rajab.put(3,"شهادت امام علی النقی الهادی علیه السلام-");
        rajab.put(4,"");
        rajab.put(5,"");
        rajab.put(6,"");
        rajab.put(7,"");
        rajab.put(8,"");
        rajab.put(9,"");
        rajab.put(10,"ولادت امام محمد تقی علیه السلام-");
        rajab.put(11,"");
        rajab.put(12,"");
        rajab.put(13,"ولادت امام علی علیه السلام-روز پدر-");
        rajab.put(14,"");
        rajab.put(15,"وفات حضرت زینب سلام الله علیها-");
        rajab.put(16,"");
        rajab.put(17,"");
        rajab.put(18,"");
        rajab.put(19,"");
        rajab.put(20,"");
        rajab.put(21,"");
        rajab.put(22,"");
        rajab.put(23,"");
        rajab.put(24,"");
        rajab.put(25,"شهادت امام موسی کاظم علیه السلام-");
        rajab.put(26,"");
        rajab.put(27,"مبعث رسول اکرم-");
        rajab.put(28,"");
        rajab.put(29,"");
        rajab.put(30,"");


        shaban.put(1,"");
        shaban.put(2,"");
        shaban.put(3,"ولادت امام حسین علیه السلام-روز پاسدار-");
        shaban.put(4,"ولادت ابوالفضل العباس علیه السلام-روز جانباز-");
        shaban.put(5,"ولادت امام زین العابدین علیه السلام-");
        shaban.put(6,"");
        shaban.put(7,"");
        shaban.put(8,"");
        shaban.put(9,"");
        shaban.put(10,"");
        shaban.put(11,"ولادت علی اکبر علیه السلام-روز جوان-");
        shaban.put(12,"");
        shaban.put(13,"");
        shaban.put(14,"");
        shaban.put(15,"ولادت حضرت مهدی-جشن نیمه شعبان-");
        shaban.put(16,"");
        shaban.put(17,"");
        shaban.put(18,"");
        shaban.put(19,"");
        shaban.put(20,"");
        shaban.put(21,"");
        shaban.put(22,"");
        shaban.put(23,"");
        shaban.put(24,"");
        shaban.put(25,"");
        shaban.put(26,"");
        shaban.put(27,"");
        shaban.put(28,"");
        shaban.put(29,"");
        shaban.put(30,"");


        ramezan.put(1,"");
        ramezan.put(2,"");
        ramezan.put(3,"");
        ramezan.put(4,"");
        ramezan.put(5,"");
        ramezan.put(6,"");
        ramezan.put(7,"");
        ramezan.put(8,"");
        ramezan.put(9,"");
        ramezan.put(10,"");
        ramezan.put(11,"");
        ramezan.put(12,"");
        ramezan.put(13,"");
        ramezan.put(14,"");
        ramezan.put(15,"ولادت امام حسن مجتبی علیه السلام-");
        ramezan.put(16,"");
        ramezan.put(17,"");
        ramezan.put(18,"شب قدر-");
        ramezan.put(19,"ضربت خوردن حضرت علی علیه السلام-");
        ramezan.put(20,"");
        ramezan.put(21,"شهادت حضرت علی علیه السلام-");
        ramezan.put(22,"شب قدر-");
        ramezan.put(23,"");
        ramezan.put(24,"");
        ramezan.put(25,"");
        ramezan.put(26,"");
        ramezan.put(27,"");
        ramezan.put(28,"");
        ramezan.put(29,"");
        ramezan.put(30,"");


        shaval.put(1,"عید سعید فطر-");
        shaval.put(2,"تعطیل به مناسبت عید سعید فطر-");
        shaval.put(3,"");
        shaval.put(4,"");
        shaval.put(5,"");
        shaval.put(6,"");
        shaval.put(7,"");
        shaval.put(8,"");
        shaval.put(9,"");
        shaval.put(10,"");
        shaval.put(11,"");
        shaval.put(12,"");
        shaval.put(13,"");
        shaval.put(14,"");
        shaval.put(15,"");
        shaval.put(16,"");
        shaval.put(17,"");
        shaval.put(18,"");
        shaval.put(19,"");
        shaval.put(20,"");
        shaval.put(21,"");
        shaval.put(22,"");
        shaval.put(23,"");
        shaval.put(24,"");
        shaval.put(25,"شهادت امام جعفر صادق علیه السلام-");
        shaval.put(26,"");
        shaval.put(27,"");
        shaval.put(28,"");
        shaval.put(29,"");
        shaval.put(30,"");


        ziqade.put(1,"ولادت حضرت معصومه سلام الله علیها-روز دختران-");
        ziqade.put(2,"");
        ziqade.put(3,"");
        ziqade.put(4,"");
        ziqade.put(5,"");
        ziqade.put(6,"");
        ziqade.put(7,"");
        ziqade.put(8,"");
        ziqade.put(9,"");
        ziqade.put(10,"");
        ziqade.put(11,"ولادت امام رضا علیه السلام-");
        ziqade.put(12,"");
        ziqade.put(13,"");
        ziqade.put(14,"");
        ziqade.put(15,"");
        ziqade.put(16,"");
        ziqade.put(17,"");
        ziqade.put(18,"");
        ziqade.put(19,"");
        ziqade.put(20,"");
        ziqade.put(21,"");
        ziqade.put(22,"");
        ziqade.put(23,"");
        ziqade.put(24,"");
        ziqade.put(25,"");
        ziqade.put(26,"");
        ziqade.put(27,"");
        ziqade.put(28,"");
        ziqade.put(29,"");
        ziqade.put(30,"شهادت امام محمد تقی علیه السلام-");


        zihaje.put(1,"");
        zihaje.put(2,"");
        zihaje.put(3,"");
        zihaje.put(4,"");
        zihaje.put(5,"");
        zihaje.put(6,"");
        zihaje.put(7,"شهادت امام محمد باقر علیه السلام-");
        zihaje.put(8,"");
        zihaje.put(9,"روز عرفه-");
        zihaje.put(10,"عید سعید قربان-");
        zihaje.put(11,"");
        zihaje.put(12,"");
        zihaje.put(13,"");
        zihaje.put(14,"");
        zihaje.put(15,"ولادت امام علی النقی الهادی علیه السلام-");
        zihaje.put(16,"");
        zihaje.put(17,"");
        zihaje.put(18,"عید سعید غدیر خم-");
        zihaje.put(19,"");
        zihaje.put(20,"ولادت امام موسی کاظم علیه السلام-");
        zihaje.put(21,"");
        zihaje.put(22,"");
        zihaje.put(23,"");
        zihaje.put(24,"");
        zihaje.put(25,"");
        zihaje.put(26,"");
        zihaje.put(27,"");
        zihaje.put(28,"");
        zihaje.put(29,"");
        zihaje.put(30,"");


        //----------------------------------------------------------------------------------------------------------------\\
        //---------------------------------------------------------ماه های میلادی-------------------------------------------------\\
        //-----------------------------------------------------------------------------------------------------------------\\


        january.put(1,"جشن آغاز سال نو میلادی-");
        january.put(2,"");
        january.put(3,"");
        january.put(4,"");
        january.put(5,"");
        january.put(6,"");
        january.put(7,"");
        january.put(8,"");
        january.put(9,"");
        january.put(10,"");
        january.put(11,"درگذشت کارل دیوید آندرسون فیزیکدان آمریکایی، برندهٔ جایزه فیزیک نوبل سال ۱۹۳۶-");
        january.put(12,"");
        january.put(13,"");
        january.put(14,"");
        january.put(15,"");
        january.put(16,"");
        january.put(17,"");
        january.put(18,"");
        january.put(19,"");
        january.put(20,"");
        january.put(21,"");
        january.put(22,"");
        january.put(23,"");
        january.put(24,"");
        january.put(25,"");
        january.put(26,"");
        january.put(27,"");
        january.put(28,"");
        january.put(29,"");
        january.put(30,"");
        january.put(31,"");


        february.put(1,"");
        february.put(2,"");
        february.put(3,"");
        february.put(4,"");
        february.put(5,"");
        february.put(6,"");
        february.put(7,"");
        february.put(8,"");
        february.put(9,"");
        february.put(10,"");
        february.put(11,"");
        february.put(12,"زادروز چارلز داروین بنیانگذار نظریه‌ی فرگشت از طریق انتخاب طبیعی-");
        february.put(13,"");
        february.put(14,"روز ولنتاین-");
        february.put(15,"");
        february.put(16,"");
        february.put(17,"");
        february.put(18,"");
        february.put(19,"");
        february.put(20,"");
        february.put(21,"روز جهانی زبان مادری-");
        february.put(22,"");
        february.put(23,"");
        february.put(24,"");
        february.put(25,"");
        february.put(26,"");
        february.put(27,"");
        february.put(28,"");
        february.put(29,"");
        february.put(30,"");
        february.put(31,"");


        march.put(1,"");
        march.put(2,"");
        march.put(3,"");
        march.put(4,"");
        march.put(5,"");
        march.put(6,"");
        march.put(7,"");
        march.put(8,"روزجهانی زنان-");
        march.put(9,"");
        march.put(10,"");
        march.put(11,"");
        march.put(12,"");
        march.put(13,"");
        march.put(14,"");
        march.put(15,"");
        march.put(16,"");
        march.put(17,"");
        march.put(18,"");
        march.put(19,"");
        march.put(20,"روز جهانی شادی-");
        march.put(21,"");
        march.put(22,"");
        march.put(23,"");
        march.put(24,"");
        march.put(25,"");
        march.put(26,"");
        march.put(27,"روز جهانی تئاتر-");
        march.put(28,"");
        march.put(29,"");
        march.put(30,"");
        march.put(31,"");


        april.put(1,"");
        april.put(2,"");
        april.put(3,"");
        april.put(4,"");
        april.put(5,"");
        april.put(6,"");
        april.put(7,"روز جهانی بهداشت-");
        april.put(8,"");
        april.put(9,"");
        april.put(10,"");
        april.put(11,"");
        april.put(12,"");
        april.put(13,"");
        april.put(14,"");
        april.put(15,"");
        april.put(16,"");
        april.put(17,"");
        april.put(18,"");
        april.put(19,"");
        april.put(20,"");
        april.put(21,"");
        april.put(22,"جشن گیاه آوری، روز زمین-");
        april.put(23,"");
        april.put(24,"");
        april.put(25,"");
        april.put(26,"");
        april.put(27,"");
        april.put(28,"");
        april.put(29,"");
        april.put(30,"");
        april.put(31,"");


        may.put(1,"روزجهانی کارگر-");
        may.put(2,"");
        may.put(3,"");
        may.put(4,"");
        may.put(5,"روز جهانی ماما-");
        may.put(6,"");
        may.put(7,"");
        may.put(8,"روز جهانی صلیب سرخ و هلال احمر-");
        may.put(9,"");
        may.put(10,"");
        may.put(11,"");
        may.put(12,"");
        may.put(13,"");
        may.put(14,"");
        may.put(15,"");
        may.put(16,"");
        may.put(17,"");
        may.put(18,"روز جهانی موزه و میراث فرهنگی-");
        may.put(19,"");
        may.put(20,"");
        may.put(21,"");
        may.put(22,"");
        may.put(23,"");
        may.put(24,"");
        may.put(25,"");
        may.put(26,"");
        may.put(27,"");
        may.put(28,"");
        may.put(29,"");
        may.put(30,"");
        may.put(31,"");


        june.put(1,"");
        june.put(2,"");
        june.put(3,"");
        june.put(4,"");
        june.put(5,"روز جهانی محیط زیست-");
        june.put(6,"");
        june.put(7,"");
        june.put(8,"");
        june.put(9,"");
        june.put(10,"روز جهانی صنایع دستی-");
        june.put(11,"");
        june.put(12,"روز جهانی مبارزه با کار کودکان-");
        june.put(13,"");
        june.put(14,"روز جهانی اهدای خون-");
        june.put(15,"");
        june.put(16,"");
        june.put(17,"روز جهانی بیابان زدایی-");
        june.put(18,"");
        june.put(19,"");
        june.put(20,"");
        june.put(21,"");
        june.put(22,"");
        june.put(23,"");
        june.put(24,"");
        june.put(25,"");
        june.put(26,"روز جهانی مبارزه با مواد مخدر-");
        june.put(27,"");
        june.put(28,"");
        june.put(29,"");
        june.put(30,"");
        june.put(31,"");


        july.put(1,"");
        july.put(2,"");
        july.put(3,"");
        july.put(4,"");
        july.put(5,"");
        july.put(6,"");
        july.put(7,"");
        july.put(8,"");
        july.put(9,"");
        july.put(10,"");
        july.put(11,"");
        july.put(12,"");
        july.put(13,"");
        july.put(14,"");
        july.put(15,"");
        july.put(16,"");
        july.put(17,"");
        july.put(18,"");
        july.put(19,"");
        july.put(20,"");
        july.put(21,"");
        july.put(22,"");
        july.put(23,"");
        july.put(24,"");
        july.put(25,"");
        july.put(26,"");
        july.put(27,"");
        july.put(28,"");
        july.put(29,"");
        july.put(30,"");
        july.put(31,"");


        august.put(1,"آغاز هفته جهانی شیردهی-");
        august.put(2,"");
        august.put(3,"");
        august.put(4,"");
        august.put(5,"");
        august.put(6,"");
        august.put(7,"");
        august.put(8,"");
        august.put(9,"");
        august.put(10,"");
        august.put(11,"");
        august.put(12,"");
        august.put(13,"روز جهانی چپ دست ها-");
        august.put(14,"");
        august.put(15,"");
        august.put(16,"");
        august.put(17,"");
        august.put(18,"");
        august.put(19,"روز جهانی عکاسی-");
        august.put(20,"");
        august.put(21,"");
        august.put(22,"");
        august.put(23,"");
        august.put(24,"");
        august.put(25,"");
        august.put(26,"");
        august.put(27,"");
        august.put(28,"");
        august.put(29,"");
        august.put(30,"");
        august.put(31,"");


        september.put(1,"");
        september.put(2,"");
        september.put(3,"");
        september.put(4,"");
        september.put(5,"");
        september.put(6,"");
        september.put(7,"");
        september.put(8,"");
        september.put(9,"");
        september.put(10,"روز جهانی پیشگیری از خودکشی-");
        september.put(11,"حمله به برج‌های دوقلوی مرکز تجارت جهانی-");
        september.put(12,"");
        september.put(13,"روز گرامیداشت برنامه نویسان-");
        september.put(14,"");
        september.put(15,"");
        september.put(16,"");
        september.put(17,"");
        september.put(18,"");
        september.put(19,"");
        september.put(20,"");
        september.put(21,"روز جهانی صلح-");
        september.put(22,"");
        september.put(23,"");
        september.put(24,"");
        september.put(25,"");
        september.put(26,"");
        september.put(27,"روز جهانی جهانگردی-");
        september.put(28,"");
        september.put(29,"");
        september.put(30,"روز جهانی ناشنوایان-روز جهانی ترجمه و مترجم-");
        september.put(31,"");


        october.put(1,"روز جهانی سالمندان-");
        october.put(2,"");
        october.put(3,"");
        october.put(4,"");
        october.put(5,"روز جهانی معلم-");
        october.put(6,"");
        october.put(7,"");
        october.put(8,"");
        october.put(9,"روز جهانی پست-");
        october.put(10,"روز جهانی مبارزه با حکم اعدام-");
        october.put(11,"روز جهانی دختر-");
        october.put(12,"");
        october.put(13,"");
        october.put(14,"روز جهانی استاندارد-");
        october.put(15,"روز جهانی عصای سفید-");
        october.put(16,"روز جهانی غذا-");
        october.put(17,"روز جهانی ریشه کنی فقر-");
        october.put(18,"");
        october.put(19,"");
        october.put(20,"");
        october.put(21,"");
        october.put(22,"");
        october.put(23,"");
        october.put(24,"");
        october.put(25,"");
        october.put(26,"");
        october.put(27,"");
        october.put(28,"");
        october.put(29,"");
        october.put(30,"");
        october.put(31,"");


        november.put(1,"");
        november.put(2,"");
        november.put(3,"");
        november.put(4,"");
        november.put(5,"");
        november.put(6,"");
        november.put(7,"");
        november.put(8,"");
        november.put(9,"");
        november.put(10,"");
        november.put(11,"");
        november.put(12,"");
        november.put(13,"");
        november.put(14,"روز جهانی دیابت-");
        november.put(15,"روز جهانی فلسفه-");
        november.put(16,"");
        november.put(17,"");
        november.put(18,"");
        november.put(19,"");
        november.put(20,"روز جهانی کودک-");
        november.put(21,"");
        november.put(22,"");
        november.put(23,"");
        november.put(24,"");
        november.put(25,"روز جهانی مبارزه با خشونت علیه زنان-");
        november.put(26,"");
        november.put(27,"");
        november.put(28,"");
        november.put(29,"");
        november.put(30,"");
        november.put(31,"");


        december.put(1,"روز جهانی ایدز-");
        december.put(2,"");
        december.put(3,"روز جهانی معلولان-");
        december.put(4,"");
        december.put(5,"");
        december.put(6,"");
        december.put(7,"");
        december.put(8,"");
        december.put(9,"");
        december.put(10,"");
        december.put(11,"");
        december.put(12,"");
        december.put(13,"");
        december.put(14,"");
        december.put(15,"");
        december.put(16,"");
        december.put(17,"");
        december.put(18,"");
        december.put(19,"");
        december.put(20,"");
        december.put(21,"");
        december.put(22,"");
        december.put(23,"");
        december.put(24,"");
        december.put(25,"جشن کریسمس-");
        december.put(26,"");
        december.put(27,"");
        december.put(28,"");
        december.put(29,"");
        december.put(30,"");
        december.put(31,"");

    }


    // با استفاده از این متد میتونیم رویدداد هر روزی رو بدست بیارم ( مال هر ماهی باشه فرق نداره، قمری شمسی میلادی)
    public String get(int rooz, String maah) {

        String returnvalue = "";

        if (maah.equals("farvardin")) {                     ////////////////////////شروع ماه های هجری////////////////////////

            returnvalue = farvardin.get(rooz);

        } else if (maah.equals("ordibehesht")) {

            returnvalue = ordibehesht.get(rooz);

        } else if (maah.equals("khordad")) {

            returnvalue = khordad.get(rooz);

        } else if (maah.equals("tir")) {

            returnvalue = tir.get(rooz);

        } else if (maah.equals("mordad")) {

            returnvalue = mordad.get(rooz);

        } else if (maah.equals("shahrivar")) {

            returnvalue = shahrivar.get(rooz);

        } else if (maah.equals("mehr")) {

            returnvalue = mehr.get(rooz);

        } else if (maah.equals("aban")) {

            returnvalue = aban.get(rooz);

        } else if (maah.equals("azar")) {

            returnvalue = azar.get(rooz);

        } else if (maah.equals("dey")) {

            returnvalue = dey.get(rooz);

        } else if (maah.equals("bahman")) {

            returnvalue = bahman.get(rooz);

        } else if (maah.equals("esfand")) {

            returnvalue = esfand.get(rooz);

        } else if (maah.equals("moharam")) {                ////////////////////////شروع ماه های قمری////////////////////////

            returnvalue = moharam.get(rooz);

        } else if (maah.equals("safar")) {

            returnvalue = safar.get(rooz);

        } else if (maah.equals("rabiaval")) {

            returnvalue = rabiaval.get(rooz);

        } else if (maah.equals("rabisani")) {

            returnvalue = rabisani.get(rooz);

        } else if (maah.equals("jamadiaval")) {

            returnvalue = jamadiaval.get(rooz);

        } else if (maah.equals("jamadisani")) {

            returnvalue = jamadisani.get(rooz);

        } else if (maah.equals("rajab")) {

            returnvalue = rajab.get(rooz);

        } else if (maah.equals("shaban")) {

            returnvalue = shaban.get(rooz);

        } else if (maah.equals("ramezan")) {

            returnvalue = ramezan.get(rooz);

        } else if (maah.equals("shaval")) {

            returnvalue = shaval.get(rooz);

        } else if (maah.equals("ziqade")) {

            returnvalue = ziqade.get(rooz);

        } else if (maah.equals("zihaje")) {

            returnvalue = zihaje.get(rooz);

        } else if (maah.equals("january")) {                 ////////////////////////شروع ماه های میلادی////////////////////////

            returnvalue = january.get(rooz);

        } else if (maah.equals("february")) {

        	returnvalue = february.get(rooz);

        } else if (maah.equals("march")) {

      	    returnvalue = march.get(rooz);

        } else if (maah.equals("april")) {

      	    returnvalue = april.get(rooz);

        } else if (maah.equals("may")) {

      	    returnvalue = may.get(rooz);

        } else if (maah.equals("june")) {

      	    returnvalue = june.get(rooz);

        } else if (maah.equals("july")) {

      	    returnvalue = july.get(rooz);

        } else if (maah.equals("august")) {

      	    returnvalue = august.get(rooz);

        } else if (maah.equals("september")) {

      	    returnvalue = september.get(rooz);

        } else if (maah.equals("october")) {

      	    returnvalue = october.get(rooz);

        } else if (maah.equals("november")) {

      	    returnvalue = november.get(rooz);

        } else if (maah.equals("december")) {

      	    returnvalue = december.get(rooz);

        }

        return returnvalue;
    }
}
