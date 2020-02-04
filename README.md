<h2 style="text-align: right;">کلاس رویداد های تقویم برای جاوا</h2>
<p style="text-align: right;">سلام دوستان. من نیاز داشتم که بدونم رویداد هر روز در تقویم (هجری شمسی یا قمری یا میلادی) چی هست. برای مثال می خواستم بدونم ۵ اذر چه رویداد هایی داره. یا مثلا 5 ژانویه چه رویداد هایی داره یا مثلا 12 محرم چه رویداد هایی داره.&nbsp; توی اینترنت گشتم دیدم چیزی وجود نداره، تصمیم گرفتم خودم یکی بسازم</p>
<p>&nbsp;</p>
<p style="text-align: right;">رویداد های ماه های قمری مانند ۱۲ محرم که میشه روز عاشورا</p>
<p style="text-align: right;">رویداد های ماه های میلادی مثلا ۱۱ سپتامبر که میشه حادثه تروریستی برج های دوقولو</p>
<p style="text-align: right;">رویداد های ماه های هجری شمسی مانند 12 فروردین که میشه روز جمهوری اسلامی</p>
<p style="text-align: right;">&nbsp;</p>
<p style="text-align: right;">یک کلاس نوشتم که رویداد های هر روز رو میتونید باهاش بفهمید. استفاده از این کلاس خیــــلی راحت هست. کافیه توی پروژتون یک کلاس به نام</p>
<p style="text-align: right;">FarsiCalendar</p>
<p style="text-align: left;">بسازید و کد هایی که نوشتم رو توش کپی پیست کنید.</p>
<div dir="rtl">&nbsp;</div>
<h2 style="text-align: right;">استفاده از این کلاس راحته. یه مثال میزنم</h2>
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
<p style="text-align: right;">با این کد به راحتی میتونید رویداد های ۷ تیر، ۱۲ محرم و ۸ مارس رو به دست بیارید. اگه در یک روز چندتا رویداد باشه با علامت - از همدیگه جدا شدن</p>
<p style="text-align: right;">&nbsp;</p>
<p style="text-align: right;">&nbsp;برای اینکه بفهمید در تقویم، مثلا در روز 14 بهمن چه رویداد هایی وجود داره، باید اول بفهمید که 14 بهمن چندم (مثلا ژانویه) میشه و چندم ( مثلا محرم) میشه. بعدش برید رویداد تک تک اون روز ها رو بخونید</p>
<p style="text-align: right;">&nbsp;</p>
<h3 style="text-align: right;">پس ترتیب کارهاتون به صورت زیر میشه</h3>
<p style="text-align: right;"><strong>اول</strong>: باید بفهمید 14 بهمن میشه چندم (مثلا ژانویه) و چندم ( مثلا محرم). فرض میکنیم میشه 5 ژانویه و 19 محرم</p>
<p style="text-align: right;"><strong>دوم</strong>: باید رویداد های 14 بهمن رو بخونید</p>
<p style="text-align: right;"><strong>سوم</strong>: باید رویداد های 5 ژانویه رو بخونید</p>
<p style="text-align: right;"><strong>چهارم</strong>: باید رویداد های 19 محرم رو بخونید</p>
<p style="text-align: right;">&nbsp;</p>
<p style="text-align: right;">مجموع این رویداد ها میشن رویداد های 14 بهمن که در تقویم ما نوشته میشن</p>
<p style="text-align: right;">&nbsp;</p>
<p style="text-align: right;">&nbsp;</p>
<p style="text-align: right;">برای تبدیل هجری شمسی به قمری و میلادی هم باید یک متد داخل همین کلاس بنویسم که فعلا وقت نکردم</p>
<p style="text-align: right;">&nbsp;</p>
<h2 style="text-align: center;">&nbsp;</h2>
<h2 style="text-align: center;">برداشته شده&nbsp; time.ir دوستان تمامی اطلاعات از سایت<br /><br /></h2>
