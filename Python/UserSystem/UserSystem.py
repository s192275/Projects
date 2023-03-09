users={"Ali":"123","Mehmet":"456","Ayşe":"789","Abuzer":"159"}
print("""
*****MENÜ*****
1.Kullanıcı girişi
2.Kullanıcı ekle
3.Kullanıcı sil""")
secim=int(input("Lütfen seçiminizi yapınız:"))
if(secim == 1):
    user = input("Lütfen kullanıcı adını giriniz:")
    password = input("Lütfen kullanıcı şifresini giriniz:")
    for i in users.keys():
      if(i == user and password == users[i]):
        print("Sisteme hoşgeldiniz:",user)
        break
      else:
        print("Lütfen tekrar deneyiniz:")
        user = input("Lütfen kullanıcı adını giriniz:")
        password = input("Lütfen kullanıcı şifresini giriniz:")
        if(i == user and password == users[i]):
          print("Sisteme hoşgeldiniz:",user)
          break
if(secim == 2):
      user2 = input("Lütfen eklemek istediğiniz kullanıcıyı giriniz: ")
      password2 = input("Doğrulamak için şifresini giriniz: ")
      for j in users.keys():
        if(j == user2 and password2 != users[j]):
            print("Bu kullanıcı zaten var ama yanlış şifre")
            user2 = input("Lütfen eklemek istediğiniz kullanıcıyı giriniz: ")
            password2 = input("Doğrulamak için şifresini giriniz: ")
            if(j != user2 ):
                users = list(users)
                users.append(user2)
                users.append(password2)
                print("Kullanıcı eklenmiştir...")
                break
        elif(j == user2 and password2 == users[j]):
            print("Bu kullanıcı zaten listede var.Eklenecek kullanıcıyı seçiniz...")
            user2 = input("Lütfen eklemek istediğiniz kullanıcıyı giriniz: ")
            password2 = input("Doğrulamak için şifresini giriniz: ")
            if (j != user2):
                users = list(users)
                users.append(user2)
                users.append(password2)
                print("Kullanıcı eklenmiştir...")
                break
        else:
            users = list(users)
            users.append(user2)
            users.append(password2)
            print("Kullanıcı eklenmiştir...")
            break
if(secim == 3):
    user3=input("Lütfen silinecek kullanıcıyı seçiniz:")
    password3=input("Lütfen şifresini giriniz:")
    for i in users.keys():
        if(i != user3):
            print("Böyle bir kullanıcı yok.Tekrar deneyiniz:")
            user3 = input("Lütfen silinecek kullanıcıyı seçiniz:")
            password3 = input("Lütfen şifresini giriniz:")
            if(password3 == users[i] and user3 ==i):
                users = list(users)
                users.remove(user3)
                print("Kullanıcı silinmiştir...")
                break
        elif(i == user3 and password3 != users[i]):
            print("Şifre yanlış.Lütfen tekrar deneyiniz:")
            password3 = input("Lütfen şifresini giriniz:")
            if (password3 == users[i] and user3 == i):
                users = list(users)
                users.remove(user3)
                print("Kullanıcı silinmiştir...")
                break
        else:
            users=list(users)
            users.remove(user3)
            print("Kullanıcı silinmiştir...")
            break
if(secim !=1 and secim != 2 and secim !=3 ):
   print("İşlem sonlandırılmıştır...")
