# MobilYa_App

#### Kullanılan Teknolojiler
*Kotlin, JetBrains tarafından geliştirilen ve özellikle Android uygulama geliştirmek için tasarlanmış bir programlama dilidir. Kotlin, Java'nın yerine geçebilen ve Java ile tam uyumlu çalışabilen bir dil olarak tasarlanmıştır. Bu özellikleri sayesinde, Java projelerine uyumlu bir şekilde entegre edilebilen ve Java ile yazılmış kodları kullanabilen bir dil olarak kullanılabilir.

*ARCore, Google tarafından geliştirilen ve Android cihazlarda artırılmış gerçeklik (AR) uygulamaları oluşturmayı sağlayan bir platformdur. Artırılmış gerçeklik, gerçek dünya görüntüsüne dijital içerik eklemeyi amaçlayan bir teknolojidir. ARCore, özellikle mobil cihazlarda (telefonlar ve tabletler gibi) bu tür uygulamaları geliştirmek isteyen geliştiricilere yöneliktir. ARCore’un temel özellikleri aşağıda yer almaktadır. 

1.	Hareket Takibi: ARCore, cihazın konumunu ve hareketini takip eder. Bu, gerçek dünyadaki nesnelerle etkileşimde bulunmak için cihazın konumunu belirlemenizi ve bu nesneleri takip etmenizi sağlar.
2.	Yüzey Algılama: ARCore, düz yüzeyleri algılamak ve belirli bir konumda dijital nesneleri sabitlemek için çevresel görüntüleme tekniklerini kullanır. Bu sayede, kullanıcılar cihazlarını belirli bir konumda tuttuklarında dijital içeriğin tutarlı bir şekilde görünmesi sağlanır.
3.	Işık Tahmini: ARCore, ortam ışığını algılayabilir ve bu bilgiyi kullanarak dijital nesnelerin çevresel aydınlatmaya uyum sağlamasını sağlar. Bu, artırılmış gerçeklik deneyimini daha gerçekçi kılar.
4.	Görsel İşleme ve Tanıma: ARCore, gerçek dünyadaki nesneleri tanıma ve takip etme yeteneğine sahiptir. Bu, kullanıcıların cihazlarını belirli nesnelerle etkileştirebilmelerine olanak tanır.

1)	Giriş Arayüzü
*Uygulamamızda bir kullanıcının giriş yaptığı zaman istediği modele kolaylıkla erişebilmesi ve kullanım amacını yerine getirebilmesi için basit, anlaşılabilir ve kullanışlı bir arayüz tasarladık. Aşağıda Şekil.1’de mobil uygulamamızın arayüzünü ve arayüzde bulunan kategorileri gösteren bir görsel ekledik.

![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/929da0e1-4ad8-4fac-ad89-3106ba83a4b0)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/f0b49165-5411-4ec8-a335-5310b80217ee)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/e5df08b0-9bd9-4e14-9dff-3f63ef5911cf)


Şekil. 1
2)	Detay Arayüzü
*Kullanıcı ilk giriş sayfasında bir ürün beğenip ona tıkladığı zaman uygulama direct olarak kullanıcıya o ürünün detay sayfasını görüntüleyecektir. Kullanıcı beğendiği ürünü aşağıda Şekil.2’de görüldüğü gibi ‘Kendi evinde gör’ butonuna basarak görüntüleyebilir. 

   ![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/bd30b15d-65c8-417a-a9a0-ebea589748b5)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/98388beb-7f65-4fff-970f-cbe3995d2138)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/9cc2bd99-45eb-4290-a797-d85f68a7c445)



Şekil. 2
3)	3D Modelin Görüntülenmesi
Kullanıcının butona basmasının ardından kullanıcı kendi ortamında seçtiği ürün modelini 3D bir şekilde görüntüleyebilir.Açılan modeli küçültebilir, döndürebilir ve istediği şekilde konumlandırabilir. Aşağıda Şekil.3’de de görüldüğü gibi istenen ürün farklı boyutlarda ve ortamlarda görüntülenebilmektedir. 

![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/cefd04e4-2c43-4d7d-ae52-721a67e2cf15)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/da6aa3dc-31c8-463f-879e-d504d25ee453)![image](https://github.com/zehrabetultaskin/MobilYa_App/assets/101520940/7c8d0599-1cfb-4c5f-a493-b243d199a2e1)

#### Uygulamanın Yüklenmesi ve Çalıştırılması 
1. Uygulamayı direkt olarak kullanmak için projeyi Github'dan yeşil 'Code' yazan butona tıklayarak 'Local' başlığı altında 'Download ZIP' butonuna basarak indirebilirsiniz. Daha sonra projeyi zip dosyasından dosyaya sağ tıklayarak 'Buraya Çıkar' seçeneğini seçerek çıkarıp dizindeki MobilYa-master1\app\release\app-release.apk dosyasını indirebilirsiniz. Telefonunuza apk dosyasını aktararak gerekli izinleri verdikten sonra uygulamayı aktif olarak kullanabilirsiniz. Ancak Android sürümünüz 13 versiyon ise kullanabilirsiniz.

2. Uygulamayı bir geliştirici olarak düzenlemek isterseniz yine projeyi indirmelisiniz. Ancak projede geliştirme yapabilmek için Android Studio IDE'sini bilgisayarınıza yüklemelisiniz. Ardından Android Studio uygulamasına girerek en üstte bulunan 'File' menüsü altında 'Open' seçeneğini seçerek açılan pencerede yüklediğiniz projenin yolunu bulup seçmeliniz. Seçtikten sonra projenin açılımını kabul edip geliştirme yapmaya başlayabilirsiniz. 

   
Şekil. 3
