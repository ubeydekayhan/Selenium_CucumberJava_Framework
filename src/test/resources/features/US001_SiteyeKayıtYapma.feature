Feature: US001_Siteye_Kayit_Yapma
  Scenario: TC01_Siteye_Kaydol
    Given Kullanici_"automationexercise_url"_sayfasina_gider
    And  Kullanici 2 saniye bekler
    Given Kullanici_anasayfanin_basariyla_dogrulandigini_goruntuler
    And Kullanici 2 saniye bekler
    Given Kullanici_kaydol_Giris_dugmesine_tiklar
    And Kullanici 2 saniye bekler
    Given Yeni_kullanici_kaydinin_gorundugu_dogrulanir
    And Kullanici 2 saniye bekler
    Given Kullanici_"adini"_ve_"eposta_adresini"_girer_ve_kaydolur
    And Kullanici 2 saniye bekler
    Given Hesap_Bilgilerini_Girinin_gorundugunu_dogrular
    Given Kullanici_Kayit_Icin_Ayrintilari_Doldurur
    Given Signup_for_our_newsletter_onay_kutusu_secilir
    Given Receive_special_offers_from_our_partners_onay_kutusu_secilir
    Given Kullanici_ayrintili_bilgileri_doldurur
    Given Kullanici_Create_Account_butonuna_tiklar
    Given Kullanici_Account_Created_yazisinin_Gorundugunu_Dogrular
    And Kullanici_Delete_Account_Butonuna_basar
    Then ACCOUNT_DELETED_gorunur_ve_Continueya_basar
    And sayfayi_kapatir
