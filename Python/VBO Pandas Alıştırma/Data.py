import seaborn as sns

titanic = sns.load_dataset("titanic") #seaborn kütüphanesi içerisinden titanic veri setinin tanımlanması
tips = sns.load_dataset("tips") #seaborn kütüphanesi içerisinden tips veri setinin tanımlanması

result = titanic.nunique() #Her bir sutuna ait unique değerler
print(result)

result2 = titanic["pclass"].unique().size #pclass değişkenine ait unique değerlerin sayısı
print(result2)

result3 = titanic[titanic["embarked"]=="C"] #embarked değerleri C olanların bilgilerini gösterir.
print(result3)

result4 = titanic[titanic["embarked"] != "S"] #embarked değerleri S olmayanların bilgilerini gösterir.
print(result4)

result5 = titanic[(titanic["age"] < 30) & (titanic["sex"]=="female") ] #yaşı 30 dan küçük olan ve kadın olan yolcuların bilgilerini gösterir.
print(result5)

result6 = titanic[(titanic["fare"] > 500 ) | (titanic["age"] > 70) ] #yaşı 70 den büyük olan ya da ücreti 500 den fazla olanların bilgilerini gösterir.
print(result6)

print(titanic["pclass"].nunique()) #pclass sütununun unique değer sayısını gösterir
print(titanic["parch"].nunique()) #parch sütununun unique değer sayısını gösterir

result7 = titanic.groupby("sex").size() #kadın ve erkek yolcuların sayısını gösterir.
print(result7)

titanic["embarked"] = titanic["embarked"].astype("category") #titanic datasetin içerisindeki embarked sütunundaki tipi category olarak değiştirdik
print(titanic["embarked"])
print(type(titanic["embarked"]))

titanic.drop("who", axis=1 , inplace=True) #titanic datasetindeki who sütununu çıkardım ve sağlamasını yaptım.
print("who" in titanic)

result8 = titanic.pivot_table("survived" , index="pclass" , columns="sex").aggregate(["sum","count","mean"]) #survived değişkeninin pclass ve cinsiyet değişkenleri kırılımında sum count ve mean değerlerini gösterir.
print(result8)

result9=titanic.isnull().sum() #Her bir değişkendeki boş değerlerin toplamı
print(result9)

print(titanic.isna().sum())

print(titanic["deck"].fillna(titanic["deck"].mode()[0])) #sonra null değerleri modla doldurdum.
print(titanic["deck"])

titanic["age"]=titanic["age"].fillna(titanic["age"].median()) #age değişkenindeki boş değerleri age değişkeninin medyanı ile doldurur.
print(titanic["age"])

titanic["age_flag"]=titanic["age"].apply(lambda x : 0 if x<30 else 1 )  #30 yaşın altında olanlara 0 olmayanlara 1 verip age_flag adında bir sütun oluşturup değerleri ona girdim.
print(titanic["age_flag"])

cevap=tips.groupby("time").aggregate({"total_bill": ["sum","min","max"]})
print(cevap)

cevap2 = tips.pivot_table("total_bill" ,index= "day", columns="time" ).aggregate(["sum","min","max"]) # tips datasetin içindeki day ve time değerlerinin total_bill e göre ortalama min ve max değerlerinin gösterilmesi
print(cevap2)

cevap3 = tips[(tips["time"]=="Lunch") &(tips["sex"]=="Female")] #lunch zamanında gelenler ve kadın müşterileri yazdırıp günlere göre gruplayıp total_bill ve sum değişkenlerine toplam min ve max işlemlerini yaptık.
cevap4=cevap3.groupby("day").aggregate({"total_bill" :["sum","min","max"],"tip": ["sum","min","max"]})
print(cevap3)
print(cevap4)

print(tips[(tips["size"] < 3) & (tips["total_bill"] > 10)]) #size ı 3 total_bill ı 10 dan büyük olan siparişleri gösterir.

cevap5 = tips[tips["sex"]=="Male"] #önce cinsiyeti erkek olanların bilgisini çektim
print(cevap5["total_bill"].mean()) #sonra bunlardan total_bill in ortalamasını aldım.
tips["a"] = cevap5["total_bill"].apply(lambda x: 1 if x > 20.744076433121034 else 0 ) #sonra ortalamadan büyükse 1 küçükse 0 yazdır komutunu verdim her bir eleman için ve bunu bir sütuna attım
tips["a"].fillna(0.0 , inplace=True) #sonra boşlukları 0 ile doldurdum na olanlar birleştirme işleminde hem sıkıntı çıkaracak hem de 0 verirsek toplamı etkilemeyeceği için istenilen sonuca ulaşacağız

cevap6 = tips[tips["sex"]=="Female"] #önce cinsiyeti kadın olanların bilgisini çektim
print(cevap6["total_bill"].mean()) #sonra bunlardan total_bill in ortalamasını aldım.
tips["b"] = cevap6["total_bill"].apply(lambda x: 1 if x>18.056896551724137 else 0) #sonra ortalamadan büyükse 1 küçükse 0 yazdır komutunu verdim her bir eleman için ve bunu bir sütuna attım
tips["b"].fillna(0.0, inplace=True) #sonra boşlukları 0 ile doldurdum na olanlar birleştirme işleminde hem sıkıntı çıkaracak hem de 0 verirsek toplamı etkilemeyeceği için istenilen sonuca ulaşacağız

tips["total_bill_flag"] = tips["a"] + tips["b"] #sonra istenilen satırı oluşturdum
tips.drop(["a","b"], axis=1, inplace=True) #sonra birleştirme işlemi yaptım

print(tips) #sonucu bastım

#kadın ve erkeklerin total_bill_flag ortamalarını alıp saydırdım
ort=tips["total_bill_flag"].sum()/tips[tips["sex"]=="Male"].count()[0]
print(tips[tips["sex"]=="Male"]["total_bill_flag"].apply(lambda x: x if x>ort else 0).count)
ort2=tips["total_bill_flag"].sum()/tips[tips["sex"]=="Female"].count()[0]
print(tips[tips["sex"]=="Male"]["total_bill_flag"].apply(lambda x: x if x>ort else 0).count)


