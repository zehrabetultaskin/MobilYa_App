# MobilYa_App
A.	Kotlin 
Kotlin, JetBrains tarafından geliştirilen ve özellikle Android uygulama geliştirmek için tasarlanmış bir programlama dilidir. Kotlin, Java'nın yerine geçebilen ve Java ile tam uyumlu çalışabilen bir dil olarak tasarlanmıştır. Bu özellikleri sayesinde, Java projelerine uyumlu bir şekilde entegre edilebilen ve Java ile yazılmış kodları kullanabilen bir dil olarak kullanılabilir.

B.	ARCore
ARCore, Google tarafından geliştirilen ve Android cihazlarda artırılmış gerçeklik (AR) uygulamaları oluşturmayı sağlayan bir platformdur. Artırılmış gerçeklik, gerçek dünya görüntüsüne dijital içerik eklemeyi amaçlayan bir teknolojidir. ARCore, özellikle mobil cihazlarda (telefonlar ve tabletler gibi) bu tür uygulamaları geliştirmek isteyen geliştiricilere yöneliktir. ARCore’un temel özellikleri aşağıda yer almaktadır. 

1.	Hareket Takibi: ARCore, cihazın konumunu ve hareketini takip eder. Bu, gerçek dünyadaki nesnelerle etkileşimde bulunmak için cihazın konumunu belirlemenizi ve bu nesneleri takip etmenizi sağlar.
2.	Yüzey Algılama: ARCore, düz yüzeyleri algılamak ve belirli bir konumda dijital nesneleri sabitlemek için çevresel görüntüleme tekniklerini kullanır. Bu sayede, kullanıcılar cihazlarını belirli bir konumda tuttuklarında dijital içeriğin tutarlı bir şekilde görünmesi sağlanır.
3.	Işık Tahmini: ARCore, ortam ışığını algılayabilir ve bu bilgiyi kullanarak dijital nesnelerin çevresel aydınlatmaya uyum sağlamasını sağlar. Bu, artırılmış gerçeklik deneyimini daha gerçekçi kılar.
4.	Görsel İşleme ve Tanıma: ARCore, gerçek dünyadaki nesneleri tanıma ve takip etme yeteneğine sahiptir. Bu, kullanıcıların cihazlarını belirli nesnelerle etkileştirebilmelerine olanak tanır.

III.	GELIŞME
A.	Models
Models klasörünün altında bulunan sınıfımızda kullandığımız mobilya modelleri için hangi davranışların sergileneceğini belirttik. Klasör altında mobilyalar için tek bir model oluşturarak bu modelin uygulamada bulunan bütün mobilya modelleri için uygulanması sağlanmıştır.
B.	Screens

•	Detail Screen: Detail screen sınıfımızda detay arayüzünde bulunan öğelerin nasıl görüntüleneceği ve hangi davranışları sergileyeceğini belirttiğimiz bir sınıftır. Butonların renkleri, mobilyalar için hangi resimler kullanılacak, ar görüntüleyicisini başlatmak için butona atama yapılmıştır buton sayesinde ar görüntüleyicisi de çalışmaktadır.
•	Home Screen: Home Screen sınıfımızda uygulamanın ana ekranında yer alan görüntü özellikleri belirlenmiştir. Ana ekranda hangi renkler kullanılacak, kategori sıralamaları kategori ekleme gibi işlevsel özellikler de yer almaktadır. NavHostController kullanılarak uygulama içerisinde tıklanılan mobilyanın detay sayfasına geçiş yapılmaktadır.
•	Splash Screen: Uygulama başlangıç esnasında çalıştığında gösterilecek logo resim başlangıç animasyonu gibi estetik özellikler bu sınıf içerisinde tanımlanır. Uygulamamızda yer alan başlangıç ekranının görsel özelliklerini içeren sınıfımızdır. Splash sınıfı yaşam döngüsü içerisinde sadece bir defa çalışır ve ardından ana ekranı gösteren navigasyon ekran devreye girer. Uygulama restart edildiğinde tekrardan başlangıç ekranını görmemiz mümkündür.
C.	UI Theme
UI theme sınıfımızda mobilyaların görsel özelliklerini ve renklerini belirttik. Burada hangi renklerin kullanılacağı boyutunun small medium ve large olarak ayarlandığı, uygulama içerisinde yer alan temanın hangi renkleri kullanacağını bu klasör altında bulunan sınıflar aracılığı ile uygulamaya bildirerek aynı zamanda kullandığımız tema içerisinde yer alan yazı timi yazı rengi ve fontu gibi özellikleri de burada belirledik.

1)	Giriş Arayüzü
Uygulamamızda bir kullanıcının giriş yaptığı zaman istediği modele kolaylıkla erişebilmesi ve kullanım amacını yerine getirebilmesi için basit, anlaşılabilir ve kullanışlı bir arayüz tasarladık. Aşağıda Şekil.1’de mobil uygulamamızın arayüzünü ve arayüzde bulunan kategorileri gösteren bir görsel ekledik.

![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/929da0e1-4ad8-4fac-ad89-3106ba83a4b0)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/f0b49165-5411-4ec8-a335-5310b80217ee)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/e5df08b0-9bd9-4e14-9dff-3f63ef5911cf)


Şekil. 1
2)	Detay Arayüzü
Kullanıcı ilk giriş sayfasında bir ürün beğenip ona tıkladığı zaman uygulama direct olarak kullanıcıya o ürünün detay sayfasını görüntüleyecektir. Kullanıcı beğendiği ürünü aşağıda Şekil.2’de görüldüğü gibi ‘Kendi evinde gör’ butonuna basarak görüntüleyebilir. 

   ![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/bd30b15d-65c8-417a-a9a0-ebea589748b5)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/98388beb-7f65-4fff-970f-cbe3995d2138)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/9cc2bd99-45eb-4290-a797-d85f68a7c445)



Şekil. 2
3)	3D Modelin Görüntülenmesi
Kullanıcının butona basmasının ardından kullanıcı kendi ortamında seçtiği ürün modelini 3D bir şekilde görüntüleyebilir.Açılan modeli küçültebilir, döndürebilir ve istediği şekilde konumlandırabilir. Aşağıda Şekil.3’de de görüldüğü gibi istenen ürün farklı boyutlarda ve ortamlarda görüntülenebilmektedir. 

![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/cefd04e4-2c43-4d7d-ae52-721a67e2cf15)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/da6aa3dc-31c8-463f-879e-d504d25ee453)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/7c8d0599-1cfb-4c5f-a493-b243d199a2e1)



   
Şekil. 3
