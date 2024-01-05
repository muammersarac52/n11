Feature:Urun_arama_yapilabilmesi
@arama
  Scenario Outline:Urun_arama_testi

    Given MS Kullanici url gider
    When  MS Ana sayfayi dogrular
    And   MS aramaya "<urunler>" urunler yazar
    And   MS acilan sayfayi dogrular
    Examples:
      | urunler    |
      | telefon    |
