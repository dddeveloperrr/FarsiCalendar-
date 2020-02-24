<h2 dir="rtl" align="center">کلاس رویداد های تقویم برای جاوا</h2>
<div dir="rtl">سلام دوستان. من نیاز داشتم که بدونم رویداد هر روز در تقویم (هجری شمسی یا قمری یا میلادی) چی هست. برای مثال می خواستم بدونم ۵ اذر چه رویداد هایی داره. یا مثلا 5 ژانویه چه رویداد هایی داره یا مثلا 12 محرم چه رویداد هایی داره. توی اینترنت گشتم دیدم چیزی وجود نداره، تصمیم گرفتم خودم یکی بسازم.</div>
<div dir="rtl">&nbsp;</div>
<div dir="rtl">رویداد های ماه های قمری مانند ۱۲ محرم که میشه روز عاشورا</div>
<div dir="rtl">رویداد های ماه های میلادی مثلا ۱۱ سپتامبر که میشه حادثه تروریستی برج های دوقولو</div>
<div dir="rtl">رویداد های ماه های هجری شمسی مانند 12 فروردین که میشه روز جمهوری اسلامی</div>
<div dir="rtl">&nbsp;</div>
<p dir="rtl">یک کلاس نوشتم که رویداد های هر روز رو میتونید باهاش بفهمید. استفاده از این کلاس خیــــلی راحت هست. کافیه توی پروژتون یک کلاس به نام&nbsp;FarsiCalendar بسازید و کد هایی که نوشتم رو توش کپی پیست کنید.</p>
<h2 dir="rtl" align="center">استفاده از این کلاس راحته. یه مثال میزنم</h2>
<p><span class="css-truncate css-truncate-target"><a id="4b42d5b8b69bc14caeedfea4a1d4512e-61f121b620b518254358199044002b9164287492" class="js-navigation-open" title="FarsiCalendar.java" href="https://github.com/dddeveloperrr/Calendar/blob/master/FarsiCalendar.java">FarsiCalendar&nbsp;</a></span>object = new <span class="css-truncate css-truncate-target"><a id="4b42d5b8b69bc14caeedfea4a1d4512e-61f121b620b518254358199044002b9164287492" class="js-navigation-open" title="FarsiCalendar.java" href="https://github.com/dddeveloperrr/Calendar/blob/master/FarsiCalendar.java">FarsiCalendar&nbsp;</a></span>();</p>
<p>String rooydad = object.get(7, "tir");<br /> System.out.println(rooydad);</p>
<p>Output:</p>
<p>انفجار دفتر حزب جمهوری اسلامی و شهادت دکتر بهشتی و 72 نفر از اعضای حزب-روز قوه قضاییه-</p>
<hr />
<p>String rooydad = object.get(12, "moharam");<br /> System.out.println(rooydad);</p>
<p>Output:</p>
<p>شهادت امام زین العابدین علیه السلام-</p>
<hr />
<p>String rooydad = object.get(8, "march");<br /> System.out.println(rooydad);</p>
<p>Output:</p>
<p>روزجهانی زنان-</p>
<hr />
<p dir="rtl">&nbsp;</p>
<p dir="rtl">با این کد به راحتی میتونید رویداد های ۷ تیر، ۱۲ محرم و ۸ مارس رو به دست بیارید. اگه در یک روز چندتا رویداد باشه با علامت - از همدیگه جدا شدن.</p>
<p dir="rtl">&nbsp;برای اینکه بفهمید در تقویم، مثلا در روز 14 بهمن چه رویداد هایی وجود داره، باید اول بفهمید که 14 بهمن چندم (مثلا ژانویه) میشه و چندم ( مثلا محرم) میشه. بعدش برید رویداد تک تک اون روز ها رو بخونید</p>
<h3 dir="rtl">پس ترتیب کارهاتون به صورت زیر میشه</h3>
<p dir="rtl"><strong>اول</strong>: باید بفهمید 14 بهمن میشه چندم (مثلا ژانویه) و چندم ( مثلا محرم). فرض میکنیم میشه 5 ژانویه و 19 محرم</p>
<p dir="rtl"><strong>دوم</strong>: باید رویداد های 14 بهمن رو بخونید</p>
<p dir="rtl"><strong>سوم</strong>: باید رویداد های 5 ژانویه رو بخونید</p>
<p dir="rtl"><strong>چهارم</strong>: باید رویداد های 19 محرم رو بخونید</p>
<p dir="rtl">مجموع این رویداد ها میشن رویداد های 14 بهمن که در تقویم ما نوشته میشن</p>
<p dir="rtl">برای تبدیل هجری شمسی به قمری و میلادی هم باید یک متد داخل همین کلاس بنویسم که فعلا وقت نکردم (دوستان، بعد از کلی سرچ در گوگل و گشتن در وبسایت های مختلف، کدهای زیادی رو برای تبدیل تاریخ میلادی به شمسی پیدا کردم ولی ظاهرا همشون ایراد داشتن به نوعی. ولی کامل ترین کتاب خانه ای که برای تبدیل تمام انواع تقویم ها پیدا کردم مال شرکت معروف&nbsp;IBM هست که میتونید تمااااام تقویم ها رو باهاش تبدیل کنید.</p>
<p dir="rtl">ادرس سایتش رو میزارم براتون. همچنین توی یوتوب هم اگه اسمشو سرچ کنید احتمالا فیلم های اموزشی زیادی ازش پیدا کنین. اسم کتابخانه این هست&nbsp;ICU4J ادرس سایتش هم اینه:</p>
<p dir="rtl"><a href="https://unicode-org.github.io/icu-docs/apidoc/released/icu4j/">https://unicode-org.github.io/icu-docs/apidoc/released/icu4j/</a></p>
<h2 align="center">برداشته شده&nbsp; time.ir دوستان تمامی اطلاعات از سایت</h2>
