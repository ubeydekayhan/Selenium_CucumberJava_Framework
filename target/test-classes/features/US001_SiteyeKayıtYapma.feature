Feature: US001_Siteye_Kayit_Yapma
  Scenario: TC01_Siteye_Kaydol
    Given Kullanici_"automationexercise_url"_sayfasina_gider
    Given Kullanici_anasayfanin_basariyla_dogrulandigini_goruntuler
    Given Kullanici_kaydol_Giris_dugmesine_tiklar
    Given Yeni_kullanici_kaydinin_gorundugu_dogrulanir
    Given Kullanici_"adini"_ve_"eposta_adresini"_girer_ve_kaydolur
    Given Hesap_Bilgilerini_Girinin_gorundugunu_dogrular
    Given Kullanici_ayrintili_bilgileri_doldurur
    And Kullanici 3 saniye bekler
    Given Kullanici_Account_Created_yazisinin_Gorundugunu_Dogrular
    And Kullanici 1 saniye bekler
    Given Kullanici_continueya_basar
    And Kullanici 3 saniye bekler
    Given reklami_kapatir
    And Kullanici_Delete_Account_Butonuna_basar
    Then ACCOUNT_DELETED_gorunur_ve_Continueya_basar
    And sayfayi_kapatir










