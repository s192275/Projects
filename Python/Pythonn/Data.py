import pandas as pd
persona = pd.read_csv("persona.csv")
df = persona.copy()
print(df.head()) #dosya ile ilgili ilk 5 verinin incelenmesi
print(df.info()) #dosya ile ilgili bilgilerin toplanması
print(df.nunique()) #unique değerlerin incelenmesi
print(df["PRICE"].value_counts()) #hangi price dan kaç adet satış gerçekleşti
print(df["COUNTRY"].value_counts()) #hangi ülkede kaç adet satış gerçekleşti
print(df.groupby("COUNTRY").agg({"PRICE" : "sum"})) #hangi ülkede satıştan ne kadar kazanıldı
print(df.groupby("SOURCE").agg({"PRICE" : "count"})) #source türlerine göre satış adeti
print(df.groupby("COUNTRY").agg({"PRICE" : "mean"})) #ülkelere göre satış ortalamaları
print(df.groupby("SOURCE").agg({"PRICE": "mean"})) #source lara göre price ortalamaları
print(df.groupby(["COUNTRY","SOURCE"]).agg({"PRICE": "mean"})) #country-source kırılımında price ortalamaları
df2=df.groupby(["COUNTRY","SOURCE","SEX","AGE"]).agg({"PRICE":"mean"}) #country source sex age kırılımında ortalama kazançlar
agg_df = df2.sort_values(ascending= False, by="PRICE") #sort_values metodu ile azalan olacak şekilde PRICE a göre sıralama
print(agg_df)
df["AGE_CAT"]=pd.cut(x=df['AGE'], bins=[0,20,40,60,80], labels=["0-20","20-40","40-60","60-80"]) #agg_df e göre hata alınca df e göre düzenleyip kopyasını agg_df e attım
print(df)
agg_df = df.copy()
print(agg_df)
agg_df["customers_level_based"] = (agg_df["COUNTRY"].astype(str))+"_"+agg_df["SOURCE"].astype(str)+"_"+agg_df["SEX"].astype(str)+"_"+agg_df["AGE_CAT"].astype(str) #6.soruda istenilen bilgileri str yapıp büyük harfe çevirip birleştirme işlemi
agg_df["customers_level_based"] = agg_df["customers_level_based"].str.upper()
print(agg_df)

#for q in [0, 0.25, 0.51, 0.75, 1]:
    #print(q, ':', np.quantile(agg_df["PRICE"], q))
agg_df['SEGMENT'] = agg_df['PRICE'].transform(lambda x: pd.qcut(x.rank(method='first'), q = [0, 0.25, 0.5, 0.75, 1], labels = ["D","C","B","A"])) #7.soru çözümü
print(agg_df)
print(agg_df.groupby("SEGMENT").agg({"PRICE": ["mean","max","sum"]}))

new_user="TUR_ANDROID_FEMALE_20-40"
print(agg_df[agg_df["customers_level_based"] ==new_user].mode()) #Uyguladık ve 20-40 yaş arası Türk kadını A segmentindedir gelir olarak
print(agg_df[agg_df["customers_level_based"]==new_user].groupby("customers_level_based").agg({"PRICE":"mean"})) #Uyguladık ve 20-40 yaş arası Türk kadını fiyat olarak 36 küsür satın alınma yapmıştır.

new_user="FRA_IOS_FEMALE_20-40"
print(agg_df[agg_df["customers_level_based"] ==new_user].mode()) #Uyguladık ve 20-40 yaş arası FR kadını D segmentindedir gelir olarak
print(agg_df[agg_df["customers_level_based"]==new_user].groupby("customers_level_based").agg({"PRICE":"mean"})) #Uyguladık ve 20-40 yaş arası Türk kadını fiyat olarak 30 küsür satın alınma yapmıştır.